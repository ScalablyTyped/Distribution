package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WshWindowStyle extends js.Object

@JSGlobal("IWshRuntimeLibrary.WshWindowStyle")
@js.native
object WshWindowStyle extends js.Object {
  @js.native
  sealed trait WshHide
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  @js.native
  sealed trait WshMaximizedFocus
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  @js.native
  sealed trait WshMinimizedFocus
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  @js.native
  sealed trait WshMinimizedNoFocus
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  @js.native
  sealed trait WshNormalFocus
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  @js.native
  sealed trait WshNormalNoFocus
    extends activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle
  
  /* 0 */ val WshHide: WshHide with scala.Double = js.native
  /* 3 */ val WshMaximizedFocus: WshMaximizedFocus with scala.Double = js.native
  /* 2 */ val WshMinimizedFocus: WshMinimizedFocus with scala.Double = js.native
  /* 6 */ val WshMinimizedNoFocus: WshMinimizedNoFocus with scala.Double = js.native
  /* 1 */ val WshNormalFocus: WshNormalFocus with scala.Double = js.native
  /* 4 */ val WshNormalNoFocus: WshNormalNoFocus with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshWindowStyle with scala.Double
  ] = js.native
}

