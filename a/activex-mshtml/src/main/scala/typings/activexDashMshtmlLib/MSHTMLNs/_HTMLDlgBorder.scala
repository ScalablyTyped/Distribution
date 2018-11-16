package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLDlgBorder extends js.Object

@JSGlobal("MSHTML._HTMLDlgBorder")
@js.native
object _HTMLDlgBorder extends js.Object {
  @js.native
  sealed trait HTMLDlgBorderThick
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgBorder
  
  @js.native
  sealed trait HTMLDlgBorderThin
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgBorder
  
  @js.native
  sealed trait HTMLDlgBorder_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLDlgBorder
  
  /* 262144 */ val HTMLDlgBorderThick: HTMLDlgBorderThick with scala.Double = js.native
  /* 0 */ val HTMLDlgBorderThin: HTMLDlgBorderThin with scala.Double = js.native
  /* 2147483647 */ val HTMLDlgBorder_Max: HTMLDlgBorder_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLDlgBorder with scala.Double] = js.native
}

