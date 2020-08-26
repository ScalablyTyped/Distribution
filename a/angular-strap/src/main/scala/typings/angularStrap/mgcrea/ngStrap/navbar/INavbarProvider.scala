package typings.angularStrap.mgcrea.ngStrap.navbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavbarProvider extends js.Object {
  var defaults: INavbarOptions = js.native
}

object INavbarProvider {
  @scala.inline
  def apply(defaults: INavbarOptions): INavbarProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavbarProvider]
  }
  @scala.inline
  implicit class INavbarProviderOps[Self <: INavbarProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: INavbarOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

