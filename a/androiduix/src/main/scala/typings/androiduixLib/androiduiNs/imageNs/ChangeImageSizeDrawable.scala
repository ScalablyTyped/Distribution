package typings
package androiduixLib.androiduiNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.image.ChangeImageSizeDrawable")
@js.native
class ChangeImageSizeDrawable protected ()
  extends androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, overrideWidth: scala.Double) = this()
  def this(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, overrideWidth: scala.Double, overrideHeight: scala.Double) = this()
  var mMutated: js.Any = js.native
  var mState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MChangeImageSizeDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): js.Any = js.native
  def getDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable,
    when: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable
  ): scala.Unit = js.native
}

