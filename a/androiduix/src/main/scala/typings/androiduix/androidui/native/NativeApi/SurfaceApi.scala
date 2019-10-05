package typings.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeApi.SurfaceApi")
@js.native
class SurfaceApi () extends js.Object {
  def createSurface(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def lockCanvas(surfaceId: Double, canvasId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def onSurfaceBoundChange(surfaceId: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def showFps(fps: Double): Unit = js.native
  def unlockCanvasAndPost(surfaceId: Double, canvasId: Double): Unit = js.native
}

