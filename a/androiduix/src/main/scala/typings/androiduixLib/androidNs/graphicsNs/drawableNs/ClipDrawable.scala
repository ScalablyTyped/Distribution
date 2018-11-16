package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
class ClipDrawable ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(state: androiduixLib.androidNs.graphicsNs.drawableNs.ClipDrawableNs.ClipState) = this()
  def this(drawable: Drawable, gravity: scala.Double, orientation: scala.Double) = this()
  var mClipState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MClipDrawable(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
object ClipDrawable extends js.Object {
  var HORIZONTAL: scala.Double = js.native
  var VERTICAL: scala.Double = js.native
}

