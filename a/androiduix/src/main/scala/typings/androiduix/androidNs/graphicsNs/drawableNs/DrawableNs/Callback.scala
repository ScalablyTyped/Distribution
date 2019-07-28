package typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var drawableSizeChange: js.UndefOr[js.Function1[/* who */ Drawable, Unit]] = js.undefined
  def invalidateDrawable(who: Drawable): Unit
  def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit
  def unscheduleDrawable(who: Drawable, what: Runnable): Unit
}

object Callback {
  @scala.inline
  def apply(
    invalidateDrawable: Drawable => Unit,
    scheduleDrawable: (Drawable, Runnable, Double) => Unit,
    unscheduleDrawable: (Drawable, Runnable) => Unit,
    drawableSizeChange: /* who */ Drawable => Unit = null
  ): Callback = {
    val __obj = js.Dynamic.literal(invalidateDrawable = js.Any.fromFunction1(invalidateDrawable), scheduleDrawable = js.Any.fromFunction3(scheduleDrawable), unscheduleDrawable = js.Any.fromFunction2(unscheduleDrawable))
    if (drawableSizeChange != null) __obj.updateDynamic("drawableSizeChange")(js.Any.fromFunction1(drawableSizeChange))
    __obj.asInstanceOf[Callback]
  }
}

