package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.esButtonButtonMod.ButtonHTMLType
import typings.antd.esButtonButtonMod.ButtonSize
import typings.antd.esDropdownDropdownDashButtonMod.DropdownButtonProps
import typings.antd.esDropdownDropdownDashButtonMod.DropdownButtonType
import typings.antd.esDropdownDropdownDashButtonMod.default
import typings.antd.esDropdownDropdownMod.Align
import typings.antd.esDropdownDropdownMod.OverlayFunc
import typings.antd.esDropdownDropdownMod.Placement
import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, style, onClick, disabled, title, href */
object DropdownDashButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esDropdownDropdownDashButtonMod.default].asInstanceOf[String | js.Object]
  def apply(
    overlay: TagMod[Any] | OverlayFunc,
    align: Align = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    htmlType: ButtonHTMLType = null,
    icon: TagMod[Any] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement = null,
    prefixCls: String = null,
    size: ButtonSize = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    `type`: DropdownButtonType = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropdownButtonProps
}

