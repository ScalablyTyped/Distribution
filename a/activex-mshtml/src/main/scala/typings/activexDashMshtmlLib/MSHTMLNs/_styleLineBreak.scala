package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLineBreak extends js.Object

@JSGlobal("MSHTML._styleLineBreak")
@js.native
object _styleLineBreak extends js.Object {
  @js.native
  sealed trait styleLineBreakNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleLineBreak
  
  @js.native
  sealed trait styleLineBreakNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLineBreak
  
  @js.native
  sealed trait styleLineBreakStrict
    extends activexDashMshtmlLib.MSHTMLNs._styleLineBreak
  
  @js.native
  sealed trait styleLineBreak_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLineBreak
  
  /* 1 */ val styleLineBreakNormal: styleLineBreakNormal with scala.Double = js.native
  /* 0 */ val styleLineBreakNotSet: styleLineBreakNotSet with scala.Double = js.native
  /* 2 */ val styleLineBreakStrict: styleLineBreakStrict with scala.Double = js.native
  /* 2147483647 */ val styleLineBreak_Max: styleLineBreak_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLineBreak with scala.Double] = js.native
}

