package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableContainerNs.DrawableContainerState
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.javaNs.langNs.Runnable
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
  @JSName("drawableSizeChange")
  def drawableSizeChange_MDrawableContainer(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* private */ def needsMirroring(): js.Any = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  def selectDrawable(idx: Double): Boolean = js.native
  def setConstantState(state: DrawableContainerState): Unit = js.native
  def setEnterFadeDuration(ms: Double): Unit = js.native
  def setExitFadeDuration(ms: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.DrawableContainer")
@js.native
object DrawableContainer extends js.Object {
  var DEBUG: js.Any = js.native
  var DEFAULT_DITHER: Boolean = js.native
  var TAG: js.Any = js.native
}

