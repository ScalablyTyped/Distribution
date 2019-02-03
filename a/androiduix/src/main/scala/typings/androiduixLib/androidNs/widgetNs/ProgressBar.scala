package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ProgressBar")
@js.native
class ProgressBar protected ()
  extends androiduixLib.androidNs.viewNs.View {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  var mMaxHeight: scala.Double = js.native
  var mMaxWidth: scala.Double = js.native
  var mMirrorForRtl: scala.Boolean = js.native
  var mNoInvalidate: js.Any = js.native
  var mOnlyIndeterminate: js.Any = js.native
  var mProgress: js.Any = js.native
  var mProgressDrawable: js.Any = js.native
  var mRefreshData: js.Any = js.native
  var mRefreshIsPosted: js.Any = js.native
  var mSampleTile: androiduixLib.androiduiNs.imageNs.NetDrawable = js.native
  var mSecondaryProgress: js.Any = js.native
  var mShouldStartAnimationDrawable: js.Any = js.native
  var mTransformation: js.Any = js.native
  /* private */ def doRefreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any, callBackToApp: js.Any): js.Any = js.native
  def getCurrentDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getIndeterminateDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getInterpolator(): androiduixLib.androidNs.viewNs.animationNs.Interpolator = js.native
  def getMax(): scala.Double = js.native
  def getProgress(): scala.Double = js.native
  def getProgressDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getSecondaryProgress(): scala.Double = js.native
  def incrementProgressBy(diff: scala.Double): scala.Unit = js.native
  def incrementSecondaryProgressBy(diff: scala.Double): scala.Unit = js.native
  /* private */ def initProgressBar(): js.Any = js.native
  def isIndeterminate(): scala.Boolean = js.native
  def onProgressRefresh(scale: scala.Double, fromUser: scala.Boolean): scala.Unit = js.native
  /* private */ def refreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any): js.Any = js.native
  def setIndeterminate(indeterminate: scala.Boolean): scala.Unit = js.native
  def setIndeterminateDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setInterpolator(interpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator): scala.Unit = js.native
  def setMax(max: scala.Double): scala.Unit = js.native
  def setProgress(progress: scala.Double): scala.Unit = js.native
  def setProgress(progress: scala.Double, fromUser: scala.Boolean): scala.Unit = js.native
  def setProgressDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setSecondaryProgress(secondaryProgress: scala.Double): scala.Unit = js.native
  def startAnimation(): scala.Unit = js.native
  def stopAnimation(): scala.Unit = js.native
  /* private */ def tileify(drawable: js.Any, clip: js.Any): js.Any = js.native
  /* private */ def tileifyIndeterminate(drawable: js.Any): js.Any = js.native
  /* private */ def updateDrawableBounds(w: js.Any, h: js.Any): js.Any = js.native
  /* private */ def updateDrawableState(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  var MAX_LEVEL: js.Any = js.native
  var TIMEOUT_SEND_ACCESSIBILITY_EVENT: js.Any = js.native
}

