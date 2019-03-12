package typings
package androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var drawableSizeChange: js.UndefOr[
    js.Function1[/* who */ androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, scala.Unit]
  ] = js.undefined
  def invalidateDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit
  def scheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable,
    when: scala.Double
  ): scala.Unit
  def unscheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable
  ): scala.Unit
}

object Callback {
  @scala.inline
  def apply(
    invalidateDrawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable => scala.Unit,
    scheduleDrawable: (androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, androiduixLib.javaNs.langNs.Runnable, scala.Double) => scala.Unit,
    unscheduleDrawable: (androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, androiduixLib.javaNs.langNs.Runnable) => scala.Unit,
    drawableSizeChange: /* who */ androiduixLib.androidNs.graphicsNs.drawableNs.Drawable => scala.Unit = null
  ): Callback = {
    val __obj = js.Dynamic.literal(invalidateDrawable = js.Any.fromFunction1(invalidateDrawable), scheduleDrawable = js.Any.fromFunction3(scheduleDrawable), unscheduleDrawable = js.Any.fromFunction2(unscheduleDrawable))
    if (drawableSizeChange != null) __obj.updateDynamic("drawableSizeChange")(js.Any.fromFunction1(drawableSizeChange))
    __obj.asInstanceOf[Callback]
  }
}

