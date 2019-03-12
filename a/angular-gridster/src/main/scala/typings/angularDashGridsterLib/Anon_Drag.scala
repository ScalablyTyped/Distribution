package typings
package angularDashGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Drag extends js.Object {
  // optional callback fired when item is moved,
  var drag: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  // whether the items are resizable
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  // optional selector for drag handle
  var handle: js.UndefOr[java.lang.String] = js.undefined
  // Distance in pixels from the edge of the viewport after which the viewport should scroll, relative to pointer
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  // Speed at which the window should scroll once the mouse pointer gets within scrollSensitivity distance
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_Drag {
  @scala.inline
  def apply(
    drag: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    handle: java.lang.String = null,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    start: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null,
    stop: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null
  ): Anon_Drag = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction3(drag))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3(stop))
    __obj.asInstanceOf[Anon_Drag]
  }
}

