package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState
import typings.androiduix.java.lang.Runnable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.DrawableContainer")
@js.native
class DrawableContainer ()
  extends Drawable
     with Callback {
  var mAlpha: js.Any = js.native
  var mAnimationRunnable: js.Any = js.native
  var mCurIndex: js.Any = js.native
  var mCurrDrawable: js.Any = js.native
  var mDrawableContainerState: js.Any = js.native
  var mEnterAnimationEnd: js.Any = js.native
  var mExitAnimationEnd: js.Any = js.native
  var mLastDrawable: js.Any = js.native
  var mMutated: Boolean = js.native
  def animate(schedule: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def copyBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def copyBounds(bounds: Rect): Rect = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MDrawableContainer(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def getAlpha(): Double = js.native
  /* InferMemberOverrides */
  override def getBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def getCallback(): Callback = js.native
  /* InferMemberOverrides */
  override def getConstantState(): ConstantState = js.native
  /* InferMemberOverrides */
  override def getCurrent(): Drawable = js.native
  /* InferMemberOverrides */
  override def getIntrinsicHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getIntrinsicWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getLevel(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getOpacity(): Double = js.native
  /* InferMemberOverrides */
  override def getPadding(padding: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def getState(): js.Array[Double] = js.native
  /* InferMemberOverrides */
  override def inflate(r: Resources, parser: HTMLElement): Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def invalidateSelf(): Unit = js.native
  /* InferMemberOverrides */
  override def isAutoMirrored(): Boolean = js.native
  /* InferMemberOverrides */
  override def isStateful(): Boolean = js.native
  /* InferMemberOverrides */
  override def isVisible(): Boolean = js.native
  /* InferMemberOverrides */
  override def jumpToCurrentState(): Unit = js.native
  /* InferMemberOverrides */
  override def mutate(): Drawable = js.native
  /* private */ def needsMirroring(): js.Any = js.native
  /* InferMemberOverrides */
  override def notifySizeChangeSelf(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onBoundsChange(bounds: Rect): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onLevelChange(level: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def onStateChange(state: js.Array[Double]): Boolean = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* InferMemberOverrides */
  override def scheduleSelf(what: js.Any, when: js.Any): Unit = js.native
  def selectDrawable(idx: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def setAlpha(alpha: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setAutoMirrored(mirrored: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setBounds(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def setBounds(rect: Rect): js.Any = js.native
  /* InferMemberOverrides */
  override def setCallback(cb: Callback): Unit = js.native
  def setConstantState(state: DrawableContainerState): Unit = js.native
  /* InferMemberOverrides */
  override def setDither(dither: Boolean): Unit = js.native
  def setEnterFadeDuration(ms: Double): Unit = js.native
  def setExitFadeDuration(ms: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setLevel(level: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def setState(stateSet: js.Array[Double]): Boolean = js.native
  /* InferMemberOverrides */
  override def setVisible(visible: Boolean, restart: Boolean): Boolean = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
  /* InferMemberOverrides */
  override def unscheduleSelf(what: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.DrawableContainer")
@js.native
object DrawableContainer extends js.Object {
  @js.native
  class DrawableContainerState protected () extends ConstantState {
    def this(orig: DrawableContainerState, owner: DrawableContainer) = this()
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
    var mOwner: DrawableContainer = js.native
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
    /* CompleteClass */
    override def newDrawable(): Drawable = js.native
    def setConstantSize(constant: Boolean): Unit = js.native
    def setEnterFadeDuration(duration: Double): Unit = js.native
    def setExitFadeDuration(duration: Double): Unit = js.native
    def setVariablePadding(variable: Boolean): Unit = js.native
  }
  
  var DEBUG: js.Any = js.native
  var DEFAULT_DITHER: Boolean = js.native
  var TAG: js.Any = js.native
}

