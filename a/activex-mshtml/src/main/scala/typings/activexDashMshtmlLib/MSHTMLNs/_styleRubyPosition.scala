package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleRubyPosition extends js.Object

@JSGlobal("MSHTML._styleRubyPosition")
@js.native
object _styleRubyPosition extends js.Object {
  @js.native
  sealed trait styleRubyPositionAbove
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyPosition
  
  @js.native
  sealed trait styleRubyPositionInline
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyPosition
  
  @js.native
  sealed trait styleRubyPositionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyPosition
  
  @js.native
  sealed trait styleRubyPosition_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleRubyPosition
  
  /* 1 */ val styleRubyPositionAbove: styleRubyPositionAbove with scala.Double = js.native
  /* 2 */ val styleRubyPositionInline: styleRubyPositionInline with scala.Double = js.native
  /* 0 */ val styleRubyPositionNotSet: styleRubyPositionNotSet with scala.Double = js.native
  /* 2147483647 */ val styleRubyPosition_Max: styleRubyPosition_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleRubyPosition with scala.Double] = js.native
}

