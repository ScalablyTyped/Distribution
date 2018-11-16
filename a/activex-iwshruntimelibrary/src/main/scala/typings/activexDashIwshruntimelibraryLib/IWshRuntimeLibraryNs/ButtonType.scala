package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSGlobal("IWshRuntimeLibrary.ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait AbortRetryIgnore
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait CancelTryagainContinue
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait OK
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait OKCancel
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait RetryCancel
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait YesNo
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  @js.native
  sealed trait YesNoCancel
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType
  
  val AbortRetryIgnore: AbortRetryIgnore with java.lang.String = js.native
  val CancelTryagainContinue: CancelTryagainContinue with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OKCancel: OKCancel with java.lang.String = js.native
  val RetryCancel: RetryCancel with java.lang.String = js.native
  val YesNo: YesNo with java.lang.String = js.native
  val YesNoCancel: YesNoCancel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.ButtonType with java.lang.String
  ] = js.native
}

