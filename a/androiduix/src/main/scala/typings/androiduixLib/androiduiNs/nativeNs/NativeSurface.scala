package typings
package androiduixLib.androiduiNs.nativeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeSurface")
@js.native
class NativeSurface ()
  extends androiduixLib.androidNs.viewNs.Surface {
  var lockedCanvas: js.Any = js.native
  var surfaceId: js.Any = js.native
}

/* static members */
@JSGlobal("androidui.native.NativeSurface")
@js.native
object NativeSurface extends js.Object {
  /* private */ def notifySurfaceReady(surfaceId: js.Any): js.Any = js.native
  /* private */ def notifySurfaceSupportDirtyDraw(surfaceId: js.Any, dirtyDrawSupport: js.Any): js.Any = js.native
}

