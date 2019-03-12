package typings
package angularDashGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  // whether the items are resizable
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  // location of the resize handles
  // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
  var handles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // optional callback fired when item is resized
  var resize: js.UndefOr[
    js.Function3[
      /* event */ angularLib.angularMod.angularNs.IAngularEvent, 
      /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, 
      /* options */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
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

object Anon_Element {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    handles: js.Array[java.lang.String] = null,
    resize: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null,
    start: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null,
    stop: (/* event */ angularLib.angularMod.angularNs.IAngularEvent, /* $element */ angularLib.angularMod.angularNs.IAugmentedJQuery, /* options */ js.Any) => scala.Unit = null
  ): Anon_Element = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (handles != null) __obj.updateDynamic("handles")(handles)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3(resize))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3(stop))
    __obj.asInstanceOf[Anon_Element]
  }
}

