package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLMinimizeFlag extends js.Object

@JSGlobal("MSHTML._HTMLMinimizeFlag")
@js.native
object _HTMLMinimizeFlag extends js.Object {
  @js.native
  sealed trait HTMLMinimizeFlagNo
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMinimizeFlag
  
  @js.native
  sealed trait HTMLMinimizeFlagYes
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMinimizeFlag
  
  @js.native
  sealed trait HTMLMinimizeFlag_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLMinimizeFlag
  
  /* 0 */ val HTMLMinimizeFlagNo: HTMLMinimizeFlagNo with scala.Double = js.native
  /* 131072 */ val HTMLMinimizeFlagYes: HTMLMinimizeFlagYes with scala.Double = js.native
  /* 2147483647 */ val HTMLMinimizeFlag_Max: HTMLMinimizeFlag_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLMinimizeFlag with scala.Double] = js.native
}

