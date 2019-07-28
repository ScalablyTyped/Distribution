package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Rect
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.Surface")
@js.native
class Surface protected () extends js.Object {
  def this(canvasElement: HTMLCanvasElement, viewRoot: ViewRootImpl) = this()
  var _showFPSNode: js.Any = js.native
  var mCanvasBound: Rect = js.native
  var mCanvasElement: js.Any = js.native
  var mLockSaveCount: js.Any = js.native
  var mLockedRect: js.Any = js.native
  var mSupportDirtyDraw: Boolean = js.native
  var viewRoot: js.Any = js.native
  /* protected */ def initCanvasBound(): Unit = js.native
  /* protected */ def initImpl(): Unit = js.native
  def isValid(): Boolean = js.native
  def lockCanvas(dirty: Rect): Canvas = js.native
  /* protected */ def lockCanvasImpl(left: Double, top: Double, width: Double, height: Double): Canvas = js.native
  def notifyBoundChange(): Unit = js.native
  def showFps(fps: Double): Unit = js.native
  def unlockCanvasAndPost(canvas: Canvas): Unit = js.native
}

/* static members */
@JSGlobal("android.view.Surface")
@js.native
object Surface extends js.Object {
  var DrawToCacheFirstMode: Boolean = js.native
}

