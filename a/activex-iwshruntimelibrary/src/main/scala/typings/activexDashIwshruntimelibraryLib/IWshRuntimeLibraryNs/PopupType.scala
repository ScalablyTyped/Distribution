package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PopupType extends js.Object

@JSGlobal("IWshRuntimeLibrary.PopupType")
@js.native
object PopupType extends js.Object {
  @js.native
  sealed trait Modal
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType
  
  @js.native
  sealed trait RTL
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType
  
  @js.native
  sealed trait RightJustified
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType
  
  @js.native
  sealed trait SecondButtonDefault
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType
  
  @js.native
  sealed trait ThirdButtonDefault
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType
  
  /* 4096 */ val Modal: Modal with scala.Double = js.native
  /* 1048576 */ val RTL: RTL with scala.Double = js.native
  /* 524288 */ val RightJustified: RightJustified with scala.Double = js.native
  /* 256 */ val SecondButtonDefault: SecondButtonDefault with scala.Double = js.native
  /* 512 */ val ThirdButtonDefault: ThirdButtonDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.PopupType with scala.Double
  ] = js.native
}

