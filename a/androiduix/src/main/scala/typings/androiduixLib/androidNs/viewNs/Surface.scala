package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Surface")
@js.native
class Surface protected () extends js.Object {
  def this(canvasElement: stdLib.HTMLCanvasElement, viewRoot: ViewRootImpl) = this()
  var _showFPSNode: js.Any = js.native
  var mCanvasBound: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mCanvasElement: js.Any = js.native
  var mLockSaveCount: js.Any = js.native
  var mLockedRect: js.Any = js.native
  var mSupportDirtyDraw: scala.Boolean = js.native
  var viewRoot: js.Any = js.native
  /* protected */ def initCanvasBound(): scala.Unit = js.native
  /* protected */ def initImpl(): scala.Unit = js.native
  def isValid(): scala.Boolean = js.native
  def lockCanvas(dirty: androiduixLib.androidNs.graphicsNs.Rect): androiduixLib.androidNs.graphicsNs.Canvas = js.native
  /* protected */ def lockCanvasImpl(left: scala.Double, top: scala.Double, width: scala.Double, height: scala.Double): androiduixLib.androidNs.graphicsNs.Canvas = js.native
  def notifyBoundChange(): scala.Unit = js.native
  def showFps(fps: scala.Double): scala.Unit = js.native
  def unlockCanvasAndPost(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.Surface")
@js.native
object Surface extends js.Object {
  var DrawToCacheFirstMode: scala.Boolean = js.native
}

