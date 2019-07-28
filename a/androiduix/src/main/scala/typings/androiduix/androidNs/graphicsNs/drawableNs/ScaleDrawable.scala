package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.androidNs.graphicsNs.drawableNs.ScaleDrawableNs.ScaleState
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ScaleDrawable")
@js.native
class ScaleDrawable ()
  extends Drawable
     with Callback {
  def this(state: ScaleState) = this()
  def this(drawable: Drawable, gravity: Double, scaleWidth: Double, scaleHeight: Double) = this()
  var mMutated: js.Any = js.native
  var mScaleState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MScaleDrawable(who: Drawable): Unit = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

