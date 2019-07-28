package typings.antdDashMobile.libPopoverItemMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverItemProps extends js.Object {
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var firstItem: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PopoverItemProps {
  @scala.inline
  def apply(
    activeStyle: CSSProperties = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    firstItem: String = null,
    icon: ReactNode = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): PopoverItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PopoverItemProps]
  }
}

