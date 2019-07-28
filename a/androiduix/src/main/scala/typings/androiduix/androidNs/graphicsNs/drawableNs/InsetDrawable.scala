package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.InsetDrawable")
@js.native
class InsetDrawable protected ()
  extends Drawable
     with Callback {
  def this(drawable: Drawable, insetLeft: Double) = this()
  def this(drawable: Drawable, insetLeft: Double, insetTop: Double) = this()
  def this(drawable: Drawable, insetLeft: Double, insetTop: Double, insetRight: Double) = this()
  def this(drawable: Drawable, insetLeft: Double, insetTop: Double, insetRight: Double, insetBottom: Double) = this()
  var mInsetState: js.Any = js.native
  var mMutated: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MInsetDrawable(who: Drawable): js.Any = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

