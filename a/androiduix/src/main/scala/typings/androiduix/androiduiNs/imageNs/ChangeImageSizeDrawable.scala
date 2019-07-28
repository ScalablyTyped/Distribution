package typings.androiduix.androiduiNs.imageNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.image.ChangeImageSizeDrawable")
@js.native
class ChangeImageSizeDrawable protected ()
  extends Drawable
     with Callback {
  def this(drawable: Drawable, overrideWidth: Double) = this()
  def this(drawable: Drawable, overrideWidth: Double, overrideHeight: Double) = this()
  var mMutated: js.Any = js.native
  var mState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MChangeImageSizeDrawable(who: Drawable): js.Any = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

