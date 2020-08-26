package typings.antd.filterWrapperMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDropdownMenuWrapperProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
}

object FilterDropdownMenuWrapperProps {
  @scala.inline
  def apply(): FilterDropdownMenuWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropdownMenuWrapperProps]
  }
  @scala.inline
  implicit class FilterDropdownMenuWrapperPropsOps[Self <: FilterDropdownMenuWrapperProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

