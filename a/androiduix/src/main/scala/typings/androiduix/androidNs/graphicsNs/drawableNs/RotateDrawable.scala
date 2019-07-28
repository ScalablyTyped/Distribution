package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.androidNs.graphicsNs.drawableNs.RotateDrawableNs.RotateState
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
class RotateDrawable ()
  extends Drawable
     with Callback {
  def this(rotateState: RotateState) = this()
  var mMutated: js.Any = js.native
  var mState: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MRotateDrawable(who: Drawable): Unit = js.native
  def getDrawable(): Drawable = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
object RotateDrawable extends js.Object {
  var MAX_LEVEL: js.Any = js.native
}

