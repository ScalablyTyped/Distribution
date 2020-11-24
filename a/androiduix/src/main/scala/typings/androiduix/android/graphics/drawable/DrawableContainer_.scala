package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.android.graphics.drawable.DrawableContainer.DrawableContainerState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawableContainer_
  extends Drawable
     with Callback {
  
  def animate(schedule: Boolean): Unit = js.native
  
  /* InferMemberOverrides */
  override def copyBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def copyBounds(bounds: Rect): Rect = js.native
  
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): js.Any = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MDrawableContainer_(who: Drawable): Unit = js.native
  
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
  
  var mAlpha: js.Any = js.native
  
  var mAnimationRunnable: js.Any = js.native
  
  var mCurIndex: js.Any = js.native
  
  var mCurrDrawable: js.Any = js.native
  
  var mDrawableContainerState: js.Any = js.native
  
  var mEnterAnimationEnd: js.Any = js.native
  
  var mExitAnimationEnd: js.Any = js.native
  
  var mLastDrawable: js.Any = js.native
  
  var mMutated: Boolean = js.native
  
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
  
  /* InferMemberOverrides */
  override def unscheduleSelf(what: js.Any): Unit = js.native
}
