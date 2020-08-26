package typings.antDesignProLayout.defaultSettingsMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderSetting extends js.Object {
  var footerRender: js.UndefOr[`false`] = js.native
  var headerRender: js.UndefOr[`false`] = js.native
  var menuHeaderRender: js.UndefOr[`false`] = js.native
  var menuRender: js.UndefOr[`false`] = js.native
}

object RenderSetting {
  @scala.inline
  def apply(): RenderSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSetting]
  }
  @scala.inline
  implicit class RenderSettingOps[Self <: RenderSetting] (val x: Self) extends AnyVal {
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
    def setFooterRender(value: `false`): Self = this.set("footerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterRender: Self = this.set("footerRender", js.undefined)
    @scala.inline
    def setHeaderRender(value: `false`): Self = this.set("headerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRender: Self = this.set("headerRender", js.undefined)
    @scala.inline
    def setMenuHeaderRender(value: `false`): Self = this.set("menuHeaderRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuHeaderRender: Self = this.set("menuHeaderRender", js.undefined)
    @scala.inline
    def setMenuRender(value: `false`): Self = this.set("menuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuRender: Self = this.set("menuRender", js.undefined)
  }
  
}

