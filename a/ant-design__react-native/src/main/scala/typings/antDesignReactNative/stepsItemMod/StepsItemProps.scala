package typings.antDesignReactNative.stepsItemMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsItemProps extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[ReactNode] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var errorTail: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* params */ RenderIconParams, ReactNode]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StepsItemProps {
  @scala.inline
  def apply(
    current: js.UndefOr[Double] = js.undefined,
    description: ReactNode = null,
    direction: String = null,
    errorTail: js.UndefOr[Double] = js.undefined,
    icon: ReactNode = null,
    index: js.UndefOr[Double] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    renderIcon: /* params */ RenderIconParams => ReactNode = null,
    size: String = null,
    status: String = null,
    styles: js.Any = null,
    title: ReactNode = null,
    width: js.UndefOr[Double] = js.undefined
  ): StepsItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(errorTail)) __obj.updateDynamic("errorTail")(errorTail.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.get.asInstanceOf[js.Any])
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsItemProps]
  }
}

