package typings.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiderContextProps extends js.Object {
  var collapsedWidth: js.UndefOr[String | Double] = js.native
  var siderCollapsed: js.UndefOr[Boolean] = js.native
}

object SiderContextProps {
  @scala.inline
  def apply(): SiderContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderContextProps]
  }
  @scala.inline
  implicit class SiderContextPropsOps[Self <: SiderContextProps] (val x: Self) extends AnyVal {
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
    def setCollapsedWidth(value: String | Double): Self = this.set("collapsedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedWidth: Self = this.set("collapsedWidth", js.undefined)
    @scala.inline
    def setSiderCollapsed(value: Boolean): Self = this.set("siderCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiderCollapsed: Self = this.set("siderCollapsed", js.undefined)
  }
  
}

