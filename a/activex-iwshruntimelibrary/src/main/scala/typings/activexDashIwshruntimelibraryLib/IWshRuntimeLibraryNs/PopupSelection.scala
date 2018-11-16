package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopupSelection extends js.Object

@JSGlobal("IWshRuntimeLibrary.PopupSelection")
@js.native
object PopupSelection extends js.Object {
  @js.native
  sealed trait Abort
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait Cancel
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait Continue
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait Ignore
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait No
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait NoButton
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait OK
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait Retry
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait TryAgain
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  @js.native
  sealed trait Yes
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection
  
  /* 3 */ val Abort: Abort with scala.Double = js.native
  /* 2 */ val Cancel: Cancel with scala.Double = js.native
  /* 11 */ val Continue: Continue with scala.Double = js.native
  /* 5 */ val Ignore: Ignore with scala.Double = js.native
  /* 7 */ val No: No with scala.Double = js.native
  /* -1 */ val NoButton: NoButton with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 4 */ val Retry: Retry with scala.Double = js.native
  /* 10 */ val TryAgain: TryAgain with scala.Double = js.native
  /* 6 */ val Yes: Yes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupSelection with scala.Double
  ] = js.native
}

