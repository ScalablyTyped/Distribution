package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.DrawableContainer")
@js.native
class DrawableContainer ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  var mAlpha: js.Any = js.native
  var mAnimationRunnable: js.Any = js.native
  var mCurIndex: js.Any = js.native
  var mCurrDrawable: js.Any = js.native
  var mDrawableContainerState: js.Any = js.native
  var mEnterAnimationEnd: js.Any = js.native
  var mExitAnimationEnd: js.Any = js.native
  var mLastDrawable: js.Any = js.native
  var mMutated: scala.Boolean = js.native
  def animate(schedule: scala.Boolean): scala.Unit = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MDrawableContainer(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* private */ def needsMirroring(): js.Any = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  def selectDrawable(idx: scala.Double): scala.Boolean = js.native
  def setConstantState(state: androiduixLib.androidNs.graphicsNs.drawableNs.DrawableContainerNs.DrawableContainerState): scala.Unit = js.native
  def setEnterFadeDuration(ms: scala.Double): scala.Unit = js.native
  def setExitFadeDuration(ms: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

@JSGlobal("android.graphics.drawable.DrawableContainer")
@js.native
object DrawableContainer extends js.Object {
  var DEBUG: js.Any = js.native
  var DEFAULT_DITHER: scala.Boolean = js.native
  var TAG: js.Any = js.native
}

