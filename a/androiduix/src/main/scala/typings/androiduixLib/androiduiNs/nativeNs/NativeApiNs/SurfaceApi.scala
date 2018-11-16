package typings
package androiduixLib.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeApi.SurfaceApi")
@js.native
class SurfaceApi () extends js.Object {
  def createSurface(
    surfaceId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  def lockCanvas(
    surfaceId: scala.Double,
    canvasId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  def onSurfaceBoundChange(
    surfaceId: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  def showFps(fps: scala.Double): scala.Unit = js.native
  def unlockCanvasAndPost(surfaceId: scala.Double, canvasId: scala.Double): scala.Unit = js.native
}

