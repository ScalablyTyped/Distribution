package typings.androiduix.android.graphics.drawable.DrawableContainer

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawableContainerState extends ConstantState {
  var mAutoMirrored: Boolean = js.native
  var mCanConstantState: Boolean = js.native
  var mCheckedConstantState: Boolean = js.native
  var mCheckedOpacity: Boolean = js.native
  var mCheckedStateful: Boolean = js.native
  var mComputedConstantSize: Boolean = js.native
  var mConstantHeight: Double = js.native
  var mConstantMinimumHeight: Double = js.native
  var mConstantMinimumWidth: Double = js.native
  var mConstantPadding: Rect = js.native
  var mConstantSize: Boolean = js.native
  var mConstantWidth: Double = js.native
  var mDither: Boolean = js.native
  var mDrawableFutures: js.Any = js.native
  var mDrawables: js.Array[Drawable] = js.native
  var mEnterFadeDuration: Double = js.native
  var mExitFadeDuration: Double = js.native
  var mMutated: Boolean = js.native
  val mNumChildren: Double = js.native
  var mOpacity: Double = js.native
  var mOwner: typings.androiduix.android.graphics.drawable.DrawableContainer = js.native
  var mPaddingChecked: Boolean = js.native
  var mStateful: Boolean = js.native
  var mVariablePadding: Boolean = js.native
  def addChild(dr: Drawable): Double = js.native
  def canConstantState(): Boolean = js.native
  def computeConstantSize(): Unit = js.native
  /* private */ def createAllFutures(): js.Any = js.native
  def getCapacity(): Double = js.native
  def getChild(index: Double): Drawable = js.native
  def getChildCount(): Double = js.native
  def getChildren(): js.Array[Drawable] = js.native
  def getConstantHeight(): Double = js.native
  def getConstantMinimumHeight(): Double = js.native
  def getConstantMinimumWidth(): Double = js.native
  def getConstantPadding(): Rect = js.native
  def getConstantWidth(): Double = js.native
  def getEnterFadeDuration(): Double = js.native
  def getExitFadeDuration(): Double = js.native
  def getOpacity(): Double = js.native
  def isConstantSize(): Boolean = js.native
  def isStateful(): Boolean = js.native
  def mutate(): Unit = js.native
  def setConstantSize(constant: Boolean): Unit = js.native
  def setEnterFadeDuration(duration: Double): Unit = js.native
  def setExitFadeDuration(duration: Double): Unit = js.native
  def setVariablePadding(variable: Boolean): Unit = js.native
}

object DrawableContainerState {
  @scala.inline
  def apply(
    addChild: Drawable => Double,
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
    mEnterFadeDuration: Double,
    mExitFadeDuration: Double,
    mMutated: Boolean,
    mNumChildren: Double,
    mOpacity: Double,
    mOwner: typings.androiduix.android.graphics.drawable.DrawableContainer,
    mPaddingChecked: Boolean,
    mStateful: Boolean,
    mVariablePadding: Boolean,
    mutate: () => Unit,
    newDrawable: () => Drawable,
    setConstantSize: Boolean => Unit,
    setEnterFadeDuration: Double => Unit,
    setExitFadeDuration: Double => Unit,
    setVariablePadding: Boolean => Unit
  ): DrawableContainerState = {
    val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), canConstantState = js.Any.fromFunction0(canConstantState), computeConstantSize = js.Any.fromFunction0(computeConstantSize), createAllFutures = js.Any.fromFunction0(createAllFutures), getCapacity = js.Any.fromFunction0(getCapacity), getChild = js.Any.fromFunction1(getChild), getChildCount = js.Any.fromFunction0(getChildCount), getChildren = js.Any.fromFunction0(getChildren), getConstantHeight = js.Any.fromFunction0(getConstantHeight), getConstantMinimumHeight = js.Any.fromFunction0(getConstantMinimumHeight), getConstantMinimumWidth = js.Any.fromFunction0(getConstantMinimumWidth), getConstantPadding = js.Any.fromFunction0(getConstantPadding), getConstantWidth = js.Any.fromFunction0(getConstantWidth), getEnterFadeDuration = js.Any.fromFunction0(getEnterFadeDuration), getExitFadeDuration = js.Any.fromFunction0(getExitFadeDuration), getOpacity = js.Any.fromFunction0(getOpacity), isConstantSize = js.Any.fromFunction0(isConstantSize), isStateful = js.Any.fromFunction0(isStateful), mAutoMirrored = mAutoMirrored.asInstanceOf[js.Any], mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mCheckedOpacity = mCheckedOpacity.asInstanceOf[js.Any], mCheckedStateful = mCheckedStateful.asInstanceOf[js.Any], mComputedConstantSize = mComputedConstantSize.asInstanceOf[js.Any], mConstantHeight = mConstantHeight.asInstanceOf[js.Any], mConstantMinimumHeight = mConstantMinimumHeight.asInstanceOf[js.Any], mConstantMinimumWidth = mConstantMinimumWidth.asInstanceOf[js.Any], mConstantPadding = mConstantPadding.asInstanceOf[js.Any], mConstantSize = mConstantSize.asInstanceOf[js.Any], mConstantWidth = mConstantWidth.asInstanceOf[js.Any], mDither = mDither.asInstanceOf[js.Any], mDrawableFutures = mDrawableFutures.asInstanceOf[js.Any], mDrawables = mDrawables.asInstanceOf[js.Any], mEnterFadeDuration = mEnterFadeDuration.asInstanceOf[js.Any], mExitFadeDuration = mExitFadeDuration.asInstanceOf[js.Any], mMutated = mMutated.asInstanceOf[js.Any], mNumChildren = mNumChildren.asInstanceOf[js.Any], mOpacity = mOpacity.asInstanceOf[js.Any], mOwner = mOwner.asInstanceOf[js.Any], mPaddingChecked = mPaddingChecked.asInstanceOf[js.Any], mStateful = mStateful.asInstanceOf[js.Any], mVariablePadding = mVariablePadding.asInstanceOf[js.Any], mutate = js.Any.fromFunction0(mutate), newDrawable = js.Any.fromFunction0(newDrawable), setConstantSize = js.Any.fromFunction1(setConstantSize), setEnterFadeDuration = js.Any.fromFunction1(setEnterFadeDuration), setExitFadeDuration = js.Any.fromFunction1(setExitFadeDuration), setVariablePadding = js.Any.fromFunction1(setVariablePadding))
    __obj.asInstanceOf[DrawableContainerState]
  }
  @scala.inline
  implicit class DrawableContainerStateOps[Self <: DrawableContainerState] (val x: Self) extends AnyVal {
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
    def setAddChild(value: Drawable => Double): Self = this.set("addChild", js.Any.fromFunction1(value))
    @scala.inline
    def setCanConstantState(value: () => Boolean): Self = this.set("canConstantState", js.Any.fromFunction0(value))
    @scala.inline
    def setComputeConstantSize(value: () => Unit): Self = this.set("computeConstantSize", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateAllFutures(value: () => js.Any): Self = this.set("createAllFutures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCapacity(value: () => Double): Self = this.set("getCapacity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChild(value: Double => Drawable): Self = this.set("getChild", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildCount(value: () => Double): Self = this.set("getChildCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChildren(value: () => js.Array[Drawable]): Self = this.set("getChildren", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstantHeight(value: () => Double): Self = this.set("getConstantHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstantMinimumHeight(value: () => Double): Self = this.set("getConstantMinimumHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstantMinimumWidth(value: () => Double): Self = this.set("getConstantMinimumWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstantPadding(value: () => Rect): Self = this.set("getConstantPadding", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConstantWidth(value: () => Double): Self = this.set("getConstantWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnterFadeDuration(value: () => Double): Self = this.set("getEnterFadeDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExitFadeDuration(value: () => Double): Self = this.set("getExitFadeDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOpacity(value: () => Double): Self = this.set("getOpacity", js.Any.fromFunction0(value))
    @scala.inline
    def setIsConstantSize(value: () => Boolean): Self = this.set("isConstantSize", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStateful(value: () => Boolean): Self = this.set("isStateful", js.Any.fromFunction0(value))
    @scala.inline
    def setMAutoMirrored(value: Boolean): Self = this.set("mAutoMirrored", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCanConstantState(value: Boolean): Self = this.set("mCanConstantState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCheckedConstantState(value: Boolean): Self = this.set("mCheckedConstantState", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCheckedOpacity(value: Boolean): Self = this.set("mCheckedOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMCheckedStateful(value: Boolean): Self = this.set("mCheckedStateful", value.asInstanceOf[js.Any])
    @scala.inline
    def setMComputedConstantSize(value: Boolean): Self = this.set("mComputedConstantSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantHeight(value: Double): Self = this.set("mConstantHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantMinimumHeight(value: Double): Self = this.set("mConstantMinimumHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantMinimumWidth(value: Double): Self = this.set("mConstantMinimumWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantPadding(value: Rect): Self = this.set("mConstantPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantSize(value: Boolean): Self = this.set("mConstantSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMConstantWidth(value: Double): Self = this.set("mConstantWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDither(value: Boolean): Self = this.set("mDither", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawableFutures(value: js.Any): Self = this.set("mDrawableFutures", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDrawablesVarargs(value: Drawable*): Self = this.set("mDrawables", js.Array(value :_*))
    @scala.inline
    def setMDrawables(value: js.Array[Drawable]): Self = this.set("mDrawables", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEnterFadeDuration(value: Double): Self = this.set("mEnterFadeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMExitFadeDuration(value: Double): Self = this.set("mExitFadeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMMutated(value: Boolean): Self = this.set("mMutated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMNumChildren(value: Double): Self = this.set("mNumChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOpacity(value: Double): Self = this.set("mOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMOwner(value: typings.androiduix.android.graphics.drawable.DrawableContainer): Self = this.set("mOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPaddingChecked(value: Boolean): Self = this.set("mPaddingChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMStateful(value: Boolean): Self = this.set("mStateful", value.asInstanceOf[js.Any])
    @scala.inline
    def setMVariablePadding(value: Boolean): Self = this.set("mVariablePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutate(value: () => Unit): Self = this.set("mutate", js.Any.fromFunction0(value))
    @scala.inline
    def setSetConstantSize(value: Boolean => Unit): Self = this.set("setConstantSize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnterFadeDuration(value: Double => Unit): Self = this.set("setEnterFadeDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExitFadeDuration(value: Double => Unit): Self = this.set("setExitFadeDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVariablePadding(value: Boolean => Unit): Self = this.set("setVariablePadding", js.Any.fromFunction1(value))
  }
  
}

