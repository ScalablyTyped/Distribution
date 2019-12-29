package typings.atAntvG2.atAntvG2Mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base type
  */
trait EventParams extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var geom: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
  var target: js.UndefOr[HTMLCanvasElement] = js.undefined
  var toElement: js.UndefOr[HTMLElement] = js.undefined
  var views: js.UndefOr[js.Array[View]] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object EventParams {
  @scala.inline
  def apply(
    data: js.Any = null,
    geom: js.Any = null,
    shape: Shape = null,
    target: HTMLCanvasElement = null,
    toElement: HTMLElement = null,
    views: js.Array[View] = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): EventParams = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (geom != null) __obj.updateDynamic("geom")(geom.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (toElement != null) __obj.updateDynamic("toElement")(toElement.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
}

