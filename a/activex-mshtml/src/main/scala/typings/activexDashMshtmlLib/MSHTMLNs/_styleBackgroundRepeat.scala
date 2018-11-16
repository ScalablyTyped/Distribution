package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBackgroundRepeat extends js.Object

@JSGlobal("MSHTML._styleBackgroundRepeat")
@js.native
object _styleBackgroundRepeat extends js.Object {
  @js.native
  sealed trait styleBackgroundRepeatNoRepeat
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  @js.native
  sealed trait styleBackgroundRepeatNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  @js.native
  sealed trait styleBackgroundRepeatRepeat
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  @js.native
  sealed trait styleBackgroundRepeatRepeatX
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  @js.native
  sealed trait styleBackgroundRepeatRepeatY
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  @js.native
  sealed trait styleBackgroundRepeat_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat
  
  /* 3 */ val styleBackgroundRepeatNoRepeat: styleBackgroundRepeatNoRepeat with scala.Double = js.native
  /* 4 */ val styleBackgroundRepeatNotSet: styleBackgroundRepeatNotSet with scala.Double = js.native
  /* 0 */ val styleBackgroundRepeatRepeat: styleBackgroundRepeatRepeat with scala.Double = js.native
  /* 1 */ val styleBackgroundRepeatRepeatX: styleBackgroundRepeatRepeatX with scala.Double = js.native
  /* 2 */ val styleBackgroundRepeatRepeatY: styleBackgroundRepeatRepeatY with scala.Double = js.native
  /* 2147483647 */ val styleBackgroundRepeat_Max: styleBackgroundRepeat_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBackgroundRepeat with scala.Double] = js.native
}

