package typings.antd.breadcrumbItemMod

import typings.antd.dropdownDropdownMod.DropDownProps
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbItemProps extends js.Object {
  var dropdownProps: js.UndefOr[DropDownProps] = js.native
  var href: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
  var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var separator: js.UndefOr[ReactNode] = js.native
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
  @scala.inline
  implicit class BreadcrumbItemPropsOps[Self <: BreadcrumbItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDropdownProps(value: DropDownProps): Self = this.set("dropdownProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownProps: Self = this.set("dropdownProps", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLAnchorElement | HTMLSpanElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOverlayFunction0(value: () => ReactElement): Self = this.set("overlay", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlay(value: ReactElement | OverlayFunc): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setSeparator(value: ReactNode): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

