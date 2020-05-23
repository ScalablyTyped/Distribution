package typings.angularGridster.anon

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drag extends js.Object {
  // optional callback fired when item is moved,
  var drag: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.undefined
  // optional selector for drag handle
  var handle: js.UndefOr[String] = js.undefined
  // Distance in pixels from the edge of the viewport after which the viewport should scroll, relative to pointer
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  // Speed at which the window should scroll once the mouse pointer gets within scrollSensitivity distance
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
}

object Drag {
  @scala.inline
  def apply(
    drag: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    start: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null,
    stop: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null
  ): Drag = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction3(drag))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3(stop))
    __obj.asInstanceOf[Drag]
  }
}

