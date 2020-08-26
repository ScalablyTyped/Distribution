package typings.angularStrap.mgcrea.ngStrap.navbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavbarOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var routeAttr: js.UndefOr[String] = js.native
}

object INavbarOptions {
  @scala.inline
  def apply(): INavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavbarOptions]
  }
  @scala.inline
  implicit class INavbarOptionsOps[Self <: INavbarOptions] (val x: Self) extends AnyVal {
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
    def setRouteAttr(value: String): Self = this.set("routeAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteAttr: Self = this.set("routeAttr", js.undefined)
  }
  
}

