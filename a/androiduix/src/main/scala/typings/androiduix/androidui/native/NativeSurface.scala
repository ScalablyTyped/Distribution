package typings.androiduix.androidui.native

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeSurface extends Surface {
  
  var lockedCanvas: js.Any = js.native
  
  var surfaceId: js.Any = js.native
}
object NativeSurface {
  
  @scala.inline
  def apply(
    _showFPSNode: js.Any,
    initCanvasBound: () => Unit,
    initImpl: () => Unit,
    isValid: () => Boolean,
    lockCanvas: Rect => Canvas,
    lockCanvasImpl: (Double, Double, Double, Double) => Canvas,
    lockedCanvas: js.Any,
    mCanvasBound: Rect,
    mCanvasElement: js.Any,
    mLockSaveCount: js.Any,
    mLockedRect: js.Any,
    mSupportDirtyDraw: Boolean,
    notifyBoundChange: () => Unit,
    showFps: Double => Unit,
    surfaceId: js.Any,
    unlockCanvasAndPost: Canvas => Unit,
    viewRoot: js.Any
  ): NativeSurface = {
    val __obj = js.Dynamic.literal(_showFPSNode = _showFPSNode.asInstanceOf[js.Any], initCanvasBound = js.Any.fromFunction0(initCanvasBound), initImpl = js.Any.fromFunction0(initImpl), isValid = js.Any.fromFunction0(isValid), lockCanvas = js.Any.fromFunction1(lockCanvas), lockCanvasImpl = js.Any.fromFunction4(lockCanvasImpl), lockedCanvas = lockedCanvas.asInstanceOf[js.Any], mCanvasBound = mCanvasBound.asInstanceOf[js.Any], mCanvasElement = mCanvasElement.asInstanceOf[js.Any], mLockSaveCount = mLockSaveCount.asInstanceOf[js.Any], mLockedRect = mLockedRect.asInstanceOf[js.Any], mSupportDirtyDraw = mSupportDirtyDraw.asInstanceOf[js.Any], notifyBoundChange = js.Any.fromFunction0(notifyBoundChange), showFps = js.Any.fromFunction1(showFps), surfaceId = surfaceId.asInstanceOf[js.Any], unlockCanvasAndPost = js.Any.fromFunction1(unlockCanvasAndPost), viewRoot = viewRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSurface]
  }
  
  @scala.inline
  implicit class NativeSurfaceOps[Self <: NativeSurface] (val x: Self) extends AnyVal {
    
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
    def setLockedCanvas(value: js.Any): Self = this.set("lockedCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceId(value: js.Any): Self = this.set("surfaceId", value.asInstanceOf[js.Any])
  }
}
