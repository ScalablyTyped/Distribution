package typings
package antdLib.esBreadcrumbBreadcrumbItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement | stdLib.HTMLSpanElement]
  ] = js.undefined
  var overlay: js.UndefOr[reactLib.reactMod.ReactNode | antdLib.esDropdownDropdownMod.OverlayFunc] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    href: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement | stdLib.HTMLSpanElement] = null,
    overlay: reactLib.reactMod.ReactNode | antdLib.esDropdownDropdownMod.OverlayFunc = null,
    prefixCls: java.lang.String = null,
    separator: reactLib.reactMod.ReactNode = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

