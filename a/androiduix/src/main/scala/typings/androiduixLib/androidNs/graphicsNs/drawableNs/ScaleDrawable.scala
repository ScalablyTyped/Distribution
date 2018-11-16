package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ScaleDrawable")
@js.native
class ScaleDrawable ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(state: androiduixLib.androidNs.graphicsNs.drawableNs.ScaleDrawableNs.ScaleState) = this()
  def this(drawable: Drawable, gravity: scala.Double, scaleWidth: scala.Double, scaleHeight: scala.Double) = this()
  var mMutated: js.Any = js.native
  var mScaleState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MScaleDrawable(who: Drawable): scala.Unit = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

