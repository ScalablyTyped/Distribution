package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcWebBrowserScrollBars extends js.Object

@JSGlobal("Access.AcWebBrowserScrollBars")
@js.native
object AcWebBrowserScrollBars extends js.Object {
  @js.native
  sealed trait acScrollAuto
    extends activexDashAccessLib.AccessNs.AcWebBrowserScrollBars
  
  @js.native
  sealed trait acScrollNo
    extends activexDashAccessLib.AccessNs.AcWebBrowserScrollBars
  
  @js.native
  sealed trait acScrollYes
    extends activexDashAccessLib.AccessNs.AcWebBrowserScrollBars
  
  /* 0 */ val acScrollAuto: acScrollAuto with scala.Double = js.native
  /* 2 */ val acScrollNo: acScrollNo with scala.Double = js.native
  /* 1 */ val acScrollYes: acScrollYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcWebBrowserScrollBars with scala.Double] = js.native
}

