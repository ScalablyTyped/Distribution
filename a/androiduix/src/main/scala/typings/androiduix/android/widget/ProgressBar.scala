package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.androidui.image.NetDrawable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends View {
  
  /* private */ def doRefreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any, callBackToApp: js.Any): js.Any = js.native
  
  def getCurrentDrawable(): Drawable = js.native
  
  def getIndeterminateDrawable(): Drawable = js.native
  
  def getInterpolator(): Interpolator = js.native
  
  def getMax(): Double = js.native
  
  def getProgress(): Double = js.native
  
  def getProgressDrawable(): Drawable = js.native
  
  def getSecondaryProgress(): Double = js.native
  
  def incrementProgressBy(diff: Double): Unit = js.native
  
  def incrementSecondaryProgressBy(diff: Double): Unit = js.native
  
  /* private */ def initProgressBar(): js.Any = js.native
  
  def isIndeterminate(): Boolean = js.native
  
  var mAnimation: js.Any = js.native
  
  var mAttached: js.Any = js.native
  
  var mBehavior: js.Any = js.native
  
  var mCurrentDrawable: js.Any = js.native
  
  var mDuration: js.Any = js.native
  
  var mHasAnimation: js.Any = js.native
  
  var mInDrawing: js.Any = js.native
  
  var mIndeterminate: js.Any = js.native
  
  var mIndeterminateDrawable: js.Any = js.native
  
  var mInterpolator: js.Any = js.native
  
  var mMax: js.Any = js.native
  
  var mMaxHeight: Double = js.native
  
  var mMaxWidth: Double = js.native
  
  var mMirrorForRtl: Boolean = js.native
  
  var mNoInvalidate: js.Any = js.native
  
  var mOnlyIndeterminate: js.Any = js.native
  
  var mProgress: js.Any = js.native
  
  var mProgressDrawable: js.Any = js.native
  
  var mRefreshData: js.Any = js.native
  
  var mRefreshIsPosted: js.Any = js.native
  
  var mSampleTile: NetDrawable = js.native
  
  var mSecondaryProgress: js.Any = js.native
  
  var mShouldStartAnimationDrawable: js.Any = js.native
  
  var mTransformation: js.Any = js.native
  
  def onProgressRefresh(scale: Double, fromUser: Boolean): Unit = js.native
  
  /* private */ def refreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any): js.Any = js.native
  
  def setIndeterminate(indeterminate: Boolean): Unit = js.native
  
  def setIndeterminateDrawable(d: Drawable): Unit = js.native
  
  def setInterpolator(interpolator: Interpolator): Unit = js.native
  
  def setMax(max: Double): Unit = js.native
  
  def setProgress(progress: Double): Unit = js.native
  def setProgress(progress: Double, fromUser: Boolean): Unit = js.native
  
  def setProgressDrawable(d: Drawable): Unit = js.native
  
  def setSecondaryProgress(secondaryProgress: Double): Unit = js.native
  
  def startAnimation(): Unit = js.native
  
  def stopAnimation(): Unit = js.native
  
  /* private */ def tileify(drawable: js.Any, clip: js.Any): js.Any = js.native
  
  /* private */ def tileifyIndeterminate(drawable: js.Any): js.Any = js.native
  
  /* private */ def updateDrawableBounds(w: js.Any, h: js.Any): js.Any = js.native
  
  /* private */ def updateDrawableState(): js.Any = js.native
}
object ProgressBar {
  
  @js.native
  trait RefreshData extends StObject {
    
    var fromUser: Boolean = js.native
    
    var id: String = js.native
    
    var progress: Double = js.native
    
    def recycle(): Unit = js.native
  }
  object RefreshData {
    
    @scala.inline
    def apply(fromUser: Boolean, id: String, progress: Double, recycle: () => Unit): RefreshData = {
      val __obj = js.Dynamic.literal(fromUser = fromUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle))
      __obj.asInstanceOf[RefreshData]
    }
    
    @scala.inline
    implicit class RefreshDataMutableBuilder[Self <: RefreshData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromUser(value: Boolean): Self = StObject.set(x, "fromUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
    }
  }
}
