package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WshExecStatus extends js.Object

@JSGlobal("IWshRuntimeLibrary.WshExecStatus")
@js.native
object WshExecStatus extends js.Object {
  @js.native
  sealed trait WshFailed
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshExecStatus
  
  @js.native
  sealed trait WshFinished
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshExecStatus
  
  @js.native
  sealed trait WshRunning
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshExecStatus
  
  /* 2 */ val WshFailed: WshFailed with scala.Double = js.native
  /* 1 */ val WshFinished: WshFinished with scala.Double = js.native
  /* 0 */ val WshRunning: WshRunning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshExecStatus with scala.Double
  ] = js.native
}

