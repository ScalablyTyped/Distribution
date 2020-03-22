package typings.antd.breadcrumbItemMod

import typings.antd.dropdownDropdownMod.OverlayFunc
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.undefined
  var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    href: String = null,
    onClick: MouseEvent[HTMLAnchorElement | HTMLSpanElement, NativeMouseEvent] => Unit = null,
    overlay: ReactElement | OverlayFunc = null,
    prefixCls: String = null,
    separator: ReactNode = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

