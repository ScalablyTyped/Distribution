package typings.androiduix.android.view.animation

import typings.androiduix.android.graphics.RectF
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.animation.Animation.AnimationListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  /* protected */ def applyTransformation(interpolatedTime: Double, t: Transformation): Unit = js.native
  
  def cancel(): Unit = js.native
  
  def computeDurationHint(): Double = js.native
  
  def detach(): Unit = js.native
  
  /* protected */ def ensureInterpolator(): Unit = js.native
  
  /* private */ def fireAnimationEnd(): js.Any = js.native
  
  /* private */ def fireAnimationRepeat(): js.Any = js.native
  
  /* private */ def fireAnimationStart(): js.Any = js.native
  
  def getBackgroundColor(): Double = js.native
  
  def getDetachWallpaper(): Boolean = js.native
  
  def getDuration(): Double = js.native
  
  def getFillAfter(): Boolean = js.native
  
  def getFillBefore(): Boolean = js.native
  
  def getInterpolator(): Interpolator = js.native
  
  def getInvalidateRegion(
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    invalidate: RectF,
    transformation: Transformation
  ): Unit = js.native
  
  def getRepeatCount(): Double = js.native
  
  def getRepeatMode(): Double = js.native
  
  /* protected */ def getScaleFactor(): Double = js.native
  
  def getStartOffset(): Double = js.native
  
  def getStartTime(): Double = js.native
  
  def getTransformation(currentTime: Double, outTransformation: Transformation): Boolean = js.native
  def getTransformation(currentTime: Double, outTransformation: Transformation, scale: Double): Boolean = js.native
  
  def getZAdjustment(): Double = js.native
  
  def hasAlpha(): Boolean = js.native
  
  def hasEnded(): Boolean = js.native
  
  def hasStarted(): Boolean = js.native
  
  def initialize(width: Double, height: Double, parentWidth: Double, parentHeight: Double): Unit = js.native
  
  def initializeInvalidateRegion(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  def isFillEnabled(): Boolean = js.native
  
  def isInitialized(): Boolean = js.native
  
  var mBackgroundColor: js.Any = js.native
  
  var mCycleFlip: Boolean = js.native
  
  var mDetachWallpaper: js.Any = js.native
  
  var mDuration: Double = js.native
  
  var mEnded: Boolean = js.native
  
  var mFillAfter: Boolean = js.native
  
  var mFillBefore: Boolean = js.native
  
  var mFillEnabled: Boolean = js.native
  
  var mInitialized: Boolean = js.native
  
  var mInterpolator: Interpolator = js.native
  
  var mListener: AnimationListener = js.native
  
  var mListenerHandler: js.Any = js.native
  
  var mMore: js.Any = js.native
  
  var mOnEnd: js.Any = js.native
  
  var mOnRepeat: js.Any = js.native
  
  var mOnStart: js.Any = js.native
  
  var mOneMoreTime: js.Any = js.native
  
  var mPreviousRegion: RectF = js.native
  
  var mPreviousTransformation: Transformation = js.native
  
  var mRegion: RectF = js.native
  
  var mRepeatCount: Double = js.native
  
  var mRepeatMode: Double = js.native
  
  var mRepeated: Double = js.native
  
  var mScaleFactor: js.Any = js.native
  
  var mStartOffset: Double = js.native
  
  var mStartTime: Double = js.native
  
  var mStarted: Boolean = js.native
  
  var mTransformation: Transformation = js.native
  
  var mZAdjustment: js.Any = js.native
  
  def reset(): Unit = js.native
  
  /* protected */ def resolveSize(`type`: Double, value: Double, size: Double, parentSize: Double): Double = js.native
  
  def restrictDuration(durationMillis: Double): Unit = js.native
  
  def scaleCurrentDuration(scale: Double): Unit = js.native
  
  def setAnimationListener(listener: AnimationListener): Unit = js.native
  
  def setBackgroundColor(bg: Double): Unit = js.native
  
  def setDetachWallpaper(detachWallpaper: Boolean): Unit = js.native
  
  def setDuration(durationMillis: Double): Unit = js.native
  
  def setFillAfter(fillAfter: Boolean): Unit = js.native
  
  def setFillBefore(fillBefore: Boolean): Unit = js.native
  
  def setFillEnabled(fillEnabled: Boolean): Unit = js.native
  
  def setInterpolator(i: Interpolator): Unit = js.native
  
  def setListenerHandler(handler: Handler): Unit = js.native
  
  def setRepeatCount(repeatCount: Double): Unit = js.native
  
  def setRepeatMode(repeatMode: Double): Unit = js.native
  
  def setStartOffset(startOffset: Double): Unit = js.native
  
  def setStartTime(startTimeMillis: Double): Unit = js.native
  
  def setZAdjustment(zAdjustment: Double): Unit = js.native
  
  def start(): Unit = js.native
  
  def startNow(): Unit = js.native
  
  def willChangeBounds(): Boolean = js.native
  
  def willChangeTransformationMatrix(): Boolean = js.native
}
object Animation {
  
  @js.native
  trait AnimationListener extends StObject {
    
    def onAnimationEnd(animation: Animation): Unit = js.native
    
    def onAnimationRepeat(animation: Animation): Unit = js.native
    
    def onAnimationStart(animation: Animation): Unit = js.native
  }
  object AnimationListener {
    
    @scala.inline
    def apply(
      onAnimationEnd: Animation => Unit,
      onAnimationRepeat: Animation => Unit,
      onAnimationStart: Animation => Unit
    ): AnimationListener = {
      val __obj = js.Dynamic.literal(onAnimationEnd = js.Any.fromFunction1(onAnimationEnd), onAnimationRepeat = js.Any.fromFunction1(onAnimationRepeat), onAnimationStart = js.Any.fromFunction1(onAnimationStart))
      __obj.asInstanceOf[AnimationListener]
    }
    
    @scala.inline
    implicit class AnimationListenerMutableBuilder[Self <: AnimationListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAnimationEnd(value: Animation => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationRepeat(value: Animation => Unit): Self = StObject.set(x, "onAnimationRepeat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStart(value: Animation => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var `type`: Double = js.native
    
    var value: Double = js.native
  }
  object Description {
    
    @scala.inline
    def apply(`type`: Double, value: Double): Description = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
