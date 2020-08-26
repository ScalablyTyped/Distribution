package typings.angularStrap.mgcrea.ngStrap.collapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapseOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var allowMultiple: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[String] = js.native
  var disallowToggle: js.UndefOr[Boolean] = js.native
  var startCollapsed: js.UndefOr[Boolean] = js.native
}

object ICollapseOptions {
  @scala.inline
  def apply(): ICollapseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollapseOptions]
  }
  @scala.inline
  implicit class ICollapseOptionsOps[Self <: ICollapseOptions] (val x: Self) extends AnyVal {
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setDisallowToggle(value: Boolean): Self = this.set("disallowToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisallowToggle: Self = this.set("disallowToggle", js.undefined)
    @scala.inline
    def setStartCollapsed(value: Boolean): Self = this.set("startCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCollapsed: Self = this.set("startCollapsed", js.undefined)
  }
  
}

