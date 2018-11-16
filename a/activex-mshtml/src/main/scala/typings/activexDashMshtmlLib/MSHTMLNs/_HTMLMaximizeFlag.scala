package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLMaximizeFlag extends js.Object

@JSGlobal("MSHTML._HTMLMaximizeFlag")
@js.native
object _HTMLMaximizeFlag extends js.Object {
  @js.native
  sealed trait HTMLMaximizeFlagNo
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMaximizeFlag
  
  @js.native
  sealed trait HTMLMaximizeFlagYes
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMaximizeFlag
  
  @js.native
  sealed trait HTMLMaximizeFlag_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMaximizeFlag
  
  /* 0 */ val HTMLMaximizeFlagNo: HTMLMaximizeFlagNo with scala.Double = js.native
  /* 65536 */ val HTMLMaximizeFlagYes: HTMLMaximizeFlagYes with scala.Double = js.native
  /* 2147483647 */ val HTMLMaximizeFlag_Max: HTMLMaximizeFlag_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLMaximizeFlag with scala.Double] = js.native
}

