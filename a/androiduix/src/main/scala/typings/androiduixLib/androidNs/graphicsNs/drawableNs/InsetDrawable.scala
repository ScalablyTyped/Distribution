package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.InsetDrawable")
@js.native
class InsetDrawable protected ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(drawable: Drawable, insetLeft: scala.Double) = this()
  def this(drawable: Drawable, insetLeft: scala.Double, insetTop: scala.Double) = this()
  def this(drawable: Drawable, insetLeft: scala.Double, insetTop: scala.Double, insetRight: scala.Double) = this()
  def this(drawable: Drawable, insetLeft: scala.Double, insetTop: scala.Double, insetRight: scala.Double, insetBottom: scala.Double) = this()
  var mInsetState: js.Any = js.native
  var mMutated: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MInsetDrawable(who: Drawable): js.Any = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

