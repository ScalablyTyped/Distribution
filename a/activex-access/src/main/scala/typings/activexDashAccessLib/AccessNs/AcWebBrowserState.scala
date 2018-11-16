package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcWebBrowserState extends js.Object

@JSGlobal("Access.AcWebBrowserState")
@js.native
object AcWebBrowserState extends js.Object {
  @js.native
  sealed trait acComplete
    extends activexDashAccessLib.AccessNs.AcWebBrowserState
  
  @js.native
  sealed trait acInteractive
    extends activexDashAccessLib.AccessNs.AcWebBrowserState
  
  @js.native
  sealed trait acLoaded
    extends activexDashAccessLib.AccessNs.AcWebBrowserState
  
  @js.native
  sealed trait acLoading
    extends activexDashAccessLib.AccessNs.AcWebBrowserState
  
  @js.native
  sealed trait acUnintialized
    extends activexDashAccessLib.AccessNs.AcWebBrowserState
  
  /* 4 */ val acComplete: acComplete with scala.Double = js.native
  /* 3 */ val acInteractive: acInteractive with scala.Double = js.native
  /* 2 */ val acLoaded: acLoaded with scala.Double = js.native
  /* 1 */ val acLoading: acLoading with scala.Double = js.native
  /* 0 */ val acUnintialized: acUnintialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcWebBrowserState with scala.Double] = js.native
}

