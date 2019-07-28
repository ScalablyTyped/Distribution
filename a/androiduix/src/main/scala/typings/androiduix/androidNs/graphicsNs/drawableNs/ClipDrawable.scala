package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.ClipDrawableNs.ClipState
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
class ClipDrawable ()
  extends Drawable
     with Callback {
  def this(state: ClipState) = this()
  def this(drawable: Drawable, gravity: Double, orientation: Double) = this()
  var mClipState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MClipDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
object ClipDrawable extends js.Object {
  var HORIZONTAL: Double = js.native
  var VERTICAL: Double = js.native
}

