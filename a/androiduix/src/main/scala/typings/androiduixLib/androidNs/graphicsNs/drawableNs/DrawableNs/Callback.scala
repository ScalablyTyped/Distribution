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
    invalidateDrawable: js.Function1[androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, scala.Unit],
    scheduleDrawable: js.Function3[
      androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, 
      androiduixLib.javaNs.langNs.Runnable, 
      scala.Double, 
      scala.Unit
    ],
    unscheduleDrawable: js.Function2[
      androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, 
      androiduixLib.javaNs.langNs.Runnable, 
      scala.Unit
    ],
    drawableSizeChange: js.Function1[/* who */ androiduixLib.androidNs.graphicsNs.drawableNs.Drawable, scala.Unit] = null
  ): Callback = {
    val __obj = js.Dynamic.literal(invalidateDrawable = invalidateDrawable, scheduleDrawable = scheduleDrawable, unscheduleDrawable = unscheduleDrawable)
    if (drawableSizeChange != null) __obj.updateDynamic("drawableSizeChange")(drawableSizeChange)
    __obj.asInstanceOf[Callback]
  }
}

