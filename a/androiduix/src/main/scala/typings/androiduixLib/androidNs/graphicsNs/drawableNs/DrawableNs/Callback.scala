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

