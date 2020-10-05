package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearIcon extends js.Object {
  var clearIcon: js.UndefOr[ReactNode] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var menuItemSelectedIcon: js.UndefOr[ReactNode] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var prefixCls: String = js.native
  var removeIcon: js.UndefOr[ReactNode] = js.native
  var suffixIcon: js.UndefOr[ReactNode] = js.native
}

object ClearIcon {
  @scala.inline
  def apply(prefixCls: String): ClearIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  @scala.inline
  implicit class ClearIconOps[Self <: ClearIcon] (val x: Self) extends AnyVal {
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMenuItemSelectedIcon(value: ReactNode): Self = this.set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemSelectedIcon: Self = this.set("menuItemSelectedIcon", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setRemoveIcon(value: ReactNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    @scala.inline
    def setSuffixIcon(value: ReactNode): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
  }
  
}

