package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
class RotateDrawable ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(rotateState: androiduixLib.androidNs.graphicsNs.drawableNs.RotateDrawableNs.RotateState) = this()
  var mMutated: js.Any = js.native
  var mState: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MRotateDrawable(who: Drawable): scala.Unit = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
object RotateDrawable extends js.Object {
  var MAX_LEVEL: js.Any = js.native
}

