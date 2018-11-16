package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWordBreak extends js.Object

@JSGlobal("MSHTML._styleWordBreak")
@js.native
object _styleWordBreak extends js.Object {
  @js.native
  sealed trait styleWordBreakBreakAll
    extends activexDashMshtmlLib.MSHTMLNs._styleWordBreak
  
  @js.native
  sealed trait styleWordBreakKeepAll
    extends activexDashMshtmlLib.MSHTMLNs._styleWordBreak
  
  @js.native
  sealed trait styleWordBreakNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleWordBreak
  
  @js.native
  sealed trait styleWordBreakNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWordBreak
  
  @js.native
  sealed trait styleWordBreak_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWordBreak
  
  /* 2 */ val styleWordBreakBreakAll: styleWordBreakBreakAll with scala.Double = js.native
  /* 3 */ val styleWordBreakKeepAll: styleWordBreakKeepAll with scala.Double = js.native
  /* 1 */ val styleWordBreakNormal: styleWordBreakNormal with scala.Double = js.native
  /* 0 */ val styleWordBreakNotSet: styleWordBreakNotSet with scala.Double = js.native
  /* 2147483647 */ val styleWordBreak_Max: styleWordBreak_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWordBreak with scala.Double] = js.native
}

