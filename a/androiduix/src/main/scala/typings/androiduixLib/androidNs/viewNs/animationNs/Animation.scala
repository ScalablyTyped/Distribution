package typings
package androiduixLib.androidNs.viewNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.Animation")
@js.native
abstract class Animation () extends js.Object {
  var mBackgroundColor: js.Any = js.native
  var mCycleFlip: scala.Boolean = js.native
  var mDetachWallpaper: js.Any = js.native
  var mDuration: scala.Double = js.native
  var mEnded: scala.Boolean = js.native
  var mFillAfter: scala.Boolean = js.native
  var mFillBefore: scala.Boolean = js.native
  var mFillEnabled: scala.Boolean = js.native
  var mInitialized: scala.Boolean = js.native
  var mInterpolator: Interpolator = js.native
  var mListener: androiduixLib.androidNs.viewNs.animationNs.AnimationNs.AnimationListener = js.native
  var mListenerHandler: js.Any = js.native
  var mMore: js.Any = js.native
  var mOnEnd: js.Any = js.native
  var mOnRepeat: js.Any = js.native
  var mOnStart: js.Any = js.native
  var mOneMoreTime: js.Any = js.native
  var mPreviousRegion: androiduixLib.androidNs.graphicsNs.RectF = js.native
  var mPreviousTransformation: Transformation = js.native
  var mRegion: androiduixLib.androidNs.graphicsNs.RectF = js.native
  var mRepeatCount: scala.Double = js.native
  var mRepeatMode: scala.Double = js.native
  var mRepeated: scala.Double = js.native
  var mScaleFactor: js.Any = js.native
  var mStartOffset: scala.Double = js.native
  var mStartTime: scala.Double = js.native
  var mStarted: scala.Boolean = js.native
  var mTransformation: Transformation = js.native
  var mZAdjustment: js.Any = js.native
  /* protected */ def applyTransformation(interpolatedTime: scala.Double, t: Transformation): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def computeDurationHint(): scala.Double = js.native
  def detach(): scala.Unit = js.native
  /* protected */ def ensureInterpolator(): scala.Unit = js.native
  /* private */ def fireAnimationEnd(): js.Any = js.native
  /* private */ def fireAnimationRepeat(): js.Any = js.native
  /* private */ def fireAnimationStart(): js.Any = js.native
  def getBackgroundColor(): scala.Double = js.native
  def getDetachWallpaper(): scala.Boolean = js.native
  def getDuration(): scala.Double = js.native
  def getFillAfter(): scala.Boolean = js.native
  def getFillBefore(): scala.Boolean = js.native
  def getInterpolator(): Interpolator = js.native
  def getInvalidateRegion(
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    invalidate: androiduixLib.androidNs.graphicsNs.RectF,
    transformation: Transformation
  ): scala.Unit = js.native
  def getRepeatCount(): scala.Double = js.native
  def getRepeatMode(): scala.Double = js.native
  /* protected */ def getScaleFactor(): scala.Double = js.native
  def getStartOffset(): scala.Double = js.native
  def getStartTime(): scala.Double = js.native
  def getTransformation(currentTime: scala.Double, outTransformation: Transformation): scala.Boolean = js.native
  def getTransformation(currentTime: scala.Double, outTransformation: Transformation, scale: scala.Double): scala.Boolean = js.native
  def getZAdjustment(): scala.Double = js.native
  def hasAlpha(): scala.Boolean = js.native
  def hasEnded(): scala.Boolean = js.native
  def hasStarted(): scala.Boolean = js.native
  def initialize(width: scala.Double, height: scala.Double, parentWidth: scala.Double, parentHeight: scala.Double): scala.Unit = js.native
  def initializeInvalidateRegion(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  def isFillEnabled(): scala.Boolean = js.native
  def isInitialized(): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  /* protected */ def resolveSize(`type`: scala.Double, value: scala.Double, size: scala.Double, parentSize: scala.Double): scala.Double = js.native
  def restrictDuration(durationMillis: scala.Double): scala.Unit = js.native
  def scaleCurrentDuration(scale: scala.Double): scala.Unit = js.native
  def setAnimationListener(listener: androiduixLib.androidNs.viewNs.animationNs.AnimationNs.AnimationListener): scala.Unit = js.native
  def setBackgroundColor(bg: scala.Double): scala.Unit = js.native
  def setDetachWallpaper(detachWallpaper: scala.Boolean): scala.Unit = js.native
  def setDuration(durationMillis: scala.Double): scala.Unit = js.native
  def setFillAfter(fillAfter: scala.Boolean): scala.Unit = js.native
  def setFillBefore(fillBefore: scala.Boolean): scala.Unit = js.native
  def setFillEnabled(fillEnabled: scala.Boolean): scala.Unit = js.native
  def setInterpolator(i: Interpolator): scala.Unit = js.native
  def setListenerHandler(handler: androiduixLib.androidNs.osNs.Handler): scala.Unit = js.native
  def setRepeatCount(repeatCount: scala.Double): scala.Unit = js.native
  def setRepeatMode(repeatMode: scala.Double): scala.Unit = js.native
  def setStartOffset(startOffset: scala.Double): scala.Unit = js.native
  def setStartTime(startTimeMillis: scala.Double): scala.Unit = js.native
  def setZAdjustment(zAdjustment: scala.Double): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def startNow(): scala.Unit = js.native
  def willChangeBounds(): scala.Boolean = js.native
  def willChangeTransformationMatrix(): scala.Boolean = js.native
}

@JSGlobal("android.view.animation.Animation")
@js.native
object Animation extends js.Object {
  var ABSOLUTE: scala.Double = js.native
  var INFINITE: scala.Double = js.native
  var RELATIVE_TO_PARENT: scala.Double = js.native
  var RELATIVE_TO_SELF: scala.Double = js.native
  var RESTART: scala.Double = js.native
  var REVERSE: scala.Double = js.native
  var START_ON_FIRST_FRAME: scala.Double = js.native
  var USE_CLOSEGUARD: js.Any = js.native
  var ZORDER_BOTTOM: scala.Double = js.native
  var ZORDER_NORMAL: scala.Double = js.native
  var ZORDER_TOP: scala.Double = js.native
}

