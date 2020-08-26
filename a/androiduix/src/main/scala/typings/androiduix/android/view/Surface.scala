package typings.androiduix.android.view

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Surface extends js.Object {
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

object Surface {
  @scala.inline
  def apply(
    _showFPSNode: js.Any,
    initCanvasBound: () => Unit,
    initImpl: () => Unit,
    isValid: () => Boolean,
    lockCanvas: Rect => Canvas,
    lockCanvasImpl: (Double, Double, Double, Double) => Canvas,
    mCanvasBound: Rect,
    mCanvasElement: js.Any,
    mLockSaveCount: js.Any,
    mLockedRect: js.Any,
    mSupportDirtyDraw: Boolean,
    notifyBoundChange: () => Unit,
    showFps: Double => Unit,
    unlockCanvasAndPost: Canvas => Unit,
    viewRoot: js.Any
  ): Surface = {
    val __obj = js.Dynamic.literal(_showFPSNode = _showFPSNode.asInstanceOf[js.Any], initCanvasBound = js.Any.fromFunction0(initCanvasBound), initImpl = js.Any.fromFunction0(initImpl), isValid = js.Any.fromFunction0(isValid), lockCanvas = js.Any.fromFunction1(lockCanvas), lockCanvasImpl = js.Any.fromFunction4(lockCanvasImpl), mCanvasBound = mCanvasBound.asInstanceOf[js.Any], mCanvasElement = mCanvasElement.asInstanceOf[js.Any], mLockSaveCount = mLockSaveCount.asInstanceOf[js.Any], mLockedRect = mLockedRect.asInstanceOf[js.Any], mSupportDirtyDraw = mSupportDirtyDraw.asInstanceOf[js.Any], notifyBoundChange = js.Any.fromFunction0(notifyBoundChange), showFps = js.Any.fromFunction1(showFps), unlockCanvasAndPost = js.Any.fromFunction1(unlockCanvasAndPost), viewRoot = viewRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Surface]
  }
  @scala.inline
  implicit class SurfaceOps[Self <: Surface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_showFPSNode(value: js.Any): Self = this.set("_showFPSNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitCanvasBound(value: () => Unit): Self = this.set("initCanvasBound", js.Any.fromFunction0(value))
    @scala.inline
    def setInitImpl(value: () => Unit): Self = this.set("initImpl", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def setLockCanvas(value: Rect => Canvas): Self = this.set("lockCanvas", js.Any.fromFunction1(value))
    @scala.inline
    def setLockCanvasImpl(value: (Double, Double, Double, Double) => Canvas): Self = this.set("lockCanvasImpl", js.Any.fromFunction4(value))
    @scala.inline
    def setMCanvasBound(value: Rect): Self = this.set("mCanvasBound", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCanvasElement(value: js.Any): Self = this.set("mCanvasElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLockSaveCount(value: js.Any): Self = this.set("mLockSaveCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMLockedRect(value: js.Any): Self = this.set("mLockedRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSupportDirtyDraw(value: Boolean): Self = this.set("mSupportDirtyDraw", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyBoundChange(value: () => Unit): Self = this.set("notifyBoundChange", js.Any.fromFunction0(value))
    @scala.inline
    def setShowFps(value: Double => Unit): Self = this.set("showFps", js.Any.fromFunction1(value))
    @scala.inline
    def setUnlockCanvasAndPost(value: Canvas => Unit): Self = this.set("unlockCanvasAndPost", js.Any.fromFunction1(value))
    @scala.inline
    def setViewRoot(value: js.Any): Self = this.set("viewRoot", value.asInstanceOf[js.Any])
  }
  
}

