package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState
import typings.androiduix.java_.lang.Runnable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDrawable
  extends DrawableContainer
     with Runnable
     with Animatable {
  
  def addFrame(frame: Drawable, duration: Double): Unit = js.native
  
  def getDuration(i: Double): Double = js.native
  
  def getFrame(index: Double): Drawable = js.native
  
  def getNumberOfFrames(): Double = js.native
  
  def isOneShot(): Boolean = js.native
  
  var mAnimationState: js.Any = js.native
  
  var mCurFrame: js.Any = js.native
  
  /* private */ def nextFrame(unschedule: js.Any): js.Any = js.native
  
  /* private */ def setFrame(frame: js.Any, unschedule: js.Any, animate: js.Any): js.Any = js.native
  
  def setOneShot(oneShot: Boolean): Unit = js.native
  
  def unscheduleSelf(what: Runnable): Unit = js.native
}
object AnimationDrawable {
  
  @js.native
  trait AnimationState extends DrawableContainerState {
    
    def addFrame(dr: Drawable, dur: Double): Unit = js.native
    
    var mDurations: js.Any = js.native
    
    var mOneShot: js.Any = js.native
  }
  object AnimationState {
    
    @scala.inline
    def apply(
      addChild: Drawable => Double,
      addFrame: (Drawable, Double) => Unit,
      canConstantState: () => Boolean,
      computeConstantSize: () => Unit,
      createAllFutures: () => js.Any,
      getCapacity: () => Double,
      getChild: Double => Drawable,
      getChildCount: () => Double,
      getChildren: () => js.Array[Drawable],
      getConstantHeight: () => Double,
      getConstantMinimumHeight: () => Double,
      getConstantMinimumWidth: () => Double,
      getConstantPadding: () => Rect,
      getConstantWidth: () => Double,
      getEnterFadeDuration: () => Double,
      getExitFadeDuration: () => Double,
      getOpacity: () => Double,
      isConstantSize: () => Boolean,
      isStateful: () => Boolean,
      mAutoMirrored: Boolean,
      mCanConstantState: Boolean,
      mCheckedConstantState: Boolean,
      mCheckedOpacity: Boolean,
      mCheckedStateful: Boolean,
      mComputedConstantSize: Boolean,
      mConstantHeight: Double,
      mConstantMinimumHeight: Double,
      mConstantMinimumWidth: Double,
      mConstantPadding: Rect,
      mConstantSize: Boolean,
      mConstantWidth: Double,
      mDither: Boolean,
      mDrawableFutures: js.Any,
      mDrawables: js.Array[Drawable],
      mDurations: js.Any,
      mEnterFadeDuration: Double,
      mExitFadeDuration: Double,
      mMutated: Boolean,
      mNumChildren: Double,
      mOneShot: js.Any,
      mOpacity: Double,
      mOwner: DrawableContainer,
      mPaddingChecked: Boolean,
      mStateful: Boolean,
      mVariablePadding: Boolean,
      mutate: () => Unit,
      newDrawable: () => Drawable,
      setConstantSize: Boolean => Unit,
      setEnterFadeDuration: Double => Unit,
      setExitFadeDuration: Double => Unit,
      setVariablePadding: Boolean => Unit
    ): AnimationState = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), addFrame = js.Any.fromFunction2(addFrame), canConstantState = js.Any.fromFunction0(canConstantState), computeConstantSize = js.Any.fromFunction0(computeConstantSize), createAllFutures = js.Any.fromFunction0(createAllFutures), getCapacity = js.Any.fromFunction0(getCapacity), getChild = js.Any.fromFunction1(getChild), getChildCount = js.Any.fromFunction0(getChildCount), getChildren = js.Any.fromFunction0(getChildren), getConstantHeight = js.Any.fromFunction0(getConstantHeight), getConstantMinimumHeight = js.Any.fromFunction0(getConstantMinimumHeight), getConstantMinimumWidth = js.Any.fromFunction0(getConstantMinimumWidth), getConstantPadding = js.Any.fromFunction0(getConstantPadding), getConstantWidth = js.Any.fromFunction0(getConstantWidth), getEnterFadeDuration = js.Any.fromFunction0(getEnterFadeDuration), getExitFadeDuration = js.Any.fromFunction0(getExitFadeDuration), getOpacity = js.Any.fromFunction0(getOpacity), isConstantSize = js.Any.fromFunction0(isConstantSize), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCheckedOpacity = mCheckedOpacity.asInstanceOf[js.Any], mCheckedStateful = mCheckedStateful.asInstanceOf[js.Any], mComputedConstantSize = mComputedConstantSize.asInstanceOf[js.Any], mConstantHeight = mConstantHeight.asInstanceOf[js.Any], mConstantMinimumHeight = mConstantMinimumHeight.asInstanceOf[js.Any], mConstantMinimumWidth = mConstantMinimumWidth.asInstanceOf[js.Any], mConstantPadding = mConstantPadding.asInstanceOf[js.Any], mConstantSize = mConstantSize.asInstanceOf[js.Any], mConstantWidth = mConstantWidth.asInstanceOf[js.Any], mDither = mDither.asInstanceOf[js.Any], mDrawableFutures = mDrawableFutures.asInstanceOf[js.Any], mDrawables = mDrawables.asInstanceOf[js.Any], mDurations = mDurations.asInstanceOf[js.Any], mEnterFadeDuration = mEnterFadeDuration.asInstanceOf[js.Any], mExitFadeDuration = mExitFadeDuration.asInstanceOf[js.Any], mMutated = mMutated.asInstanceOf[js.Any], mNumChildren = mNumChildren.asInstanceOf[js.Any], mOneShot = mOneShot.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mOwner = mOwner.asInstanceOf[js.Any], mPaddingChecked = mPaddingChecked.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], mVariablePadding = mVariablePadding.asInstanceOf[js.Any], mutate = js.Any.fromFunction0(mutate), newDrawable = js.Any.fromFunction0(newDrawable), setConstantSize = js.Any.fromFunction1(setConstantSize), setEnterFadeDuration = js.Any.fromFunction1(setEnterFadeDuration), setExitFadeDuration = js.Any.fromFunction1(setExitFadeDuration), setVariablePadding = js.Any.fromFunction1(setVariablePadding))
      __obj.asInstanceOf[AnimationState]
    }
    
    @scala.inline
    implicit class AnimationStateMutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFrame(value: (Drawable, Double) => Unit): Self = StObject.set(x, "addFrame", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMDurations(value: js.Any): Self = StObject.set(x, "mDurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOneShot(value: js.Any): Self = StObject.set(x, "mOneShot", value.asInstanceOf[js.Any])
    }
  }
}
