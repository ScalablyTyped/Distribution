package typings.androiduix.android.graphics.drawable.AnimationDrawable

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.DrawableContainer
import typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationState extends DrawableContainerState {
  var mDurations: js.Any = js.native
  var mOneShot: js.Any = js.native
  def addFrame(dr: Drawable, dur: Double): Unit = js.native
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
  implicit class AnimationStateOps[Self <: AnimationState] (val x: Self) extends AnyVal {
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
    def setAddFrame(value: (Drawable, Double) => Unit): Self = this.set("addFrame", js.Any.fromFunction2(value))
    @scala.inline
    def setMDurations(value: js.Any): Self = this.set("mDurations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOneShot(value: js.Any): Self = this.set("mOneShot", value.asInstanceOf[js.Any])
  }
  
}

