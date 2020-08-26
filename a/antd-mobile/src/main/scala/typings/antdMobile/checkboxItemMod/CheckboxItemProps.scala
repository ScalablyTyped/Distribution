package typings.antdMobile.checkboxItemMod

import typings.antdMobile.checkboxCheckboxMod.CheckboxProps
import typings.antdMobile.checkboxPropsTypeMod.CheckboxItemPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxItemProps extends CheckboxItemPropsType {
  var checkboxProps: js.UndefOr[CheckboxProps] = js.native
  var className: js.UndefOr[String] = js.native
  var listPrefixCls: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var wrapLabel: js.UndefOr[Boolean] = js.native
}

object CheckboxItemProps {
  @scala.inline
  def apply(): CheckboxItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxItemProps]
  }
  @scala.inline
  implicit class CheckboxItemPropsOps[Self <: CheckboxItemProps] (val x: Self) extends AnyVal {
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
    def setCheckboxProps(value: CheckboxProps): Self = this.set("checkboxProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxProps: Self = this.set("checkboxProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setListPrefixCls(value: String): Self = this.set("listPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListPrefixCls: Self = this.set("listPrefixCls", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setWrapLabel(value: Boolean): Self = this.set("wrapLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapLabel: Self = this.set("wrapLabel", js.undefined)
  }
  
}

