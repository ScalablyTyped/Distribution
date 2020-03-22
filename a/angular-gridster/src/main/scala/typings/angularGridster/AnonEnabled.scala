package typings.angularGridster

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.undefined
  // location of the resize handles
  // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
  var handles: js.UndefOr[js.Array[String]] = js.undefined
  // optional callback fired when item is resized
  var resize: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
}

object AnonEnabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    handles: js.Array[String] = null,
    resize: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null,
    start: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null,
    stop: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Unit = null
  ): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3(resize))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3(stop))
    __obj.asInstanceOf[AnonEnabled]
  }
}

