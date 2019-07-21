package typings
package atAntDashDesignReactDashNativeLib.esStepsStepsItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsItemProps extends js.Object {
  var current: js.UndefOr[scala.Double] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var errorTail: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* params */ RenderIconParams, reactLib.reactMod.ReactNode]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object StepsItemProps {
  @scala.inline
  def apply(
    current: scala.Int | scala.Double = null,
    description: reactLib.reactMod.ReactNode = null,
    direction: java.lang.String = null,
    errorTail: scala.Int | scala.Double = null,
    icon: reactLib.reactMod.ReactNode = null,
    index: scala.Int | scala.Double = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    renderIcon: /* params */ RenderIconParams => reactLib.reactMod.ReactNode = null,
    size: java.lang.String = null,
    status: java.lang.String = null,
    styles: js.Any = null,
    title: reactLib.reactMod.ReactNode = null,
    width: scala.Int | scala.Double = null
  ): StepsItemProps = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (errorTail != null) __obj.updateDynamic("errorTail")(errorTail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsItemProps]
  }
}

