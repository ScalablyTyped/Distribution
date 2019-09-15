package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.error
import typings.antd.antdStrings.info
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.antd.esAlertMod.AlertProps
import typings.antd.esAlertMod.default
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Alert
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esAlertMod.default].asInstanceOf[String | js.Object]
  def apply(
    message: TagMod[Any],
    afterClose: () => Unit = null,
    banner: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeText: TagMod[Any] = null,
    description: TagMod[Any] = null,
    icon: TagMod[Any] = null,
    iconType: String = null,
    onClose: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    `type`: success | info | warning | error = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(message = message)
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(banner)) __obj.updateDynamic("banner")(banner)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AlertProps
}

