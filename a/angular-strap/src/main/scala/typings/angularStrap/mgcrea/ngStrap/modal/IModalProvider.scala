package typings.angularStrap.mgcrea.ngStrap.modal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalProvider extends js.Object {
  var defaults: IModalOptions = js.native
}

object IModalProvider {
  @scala.inline
  def apply(defaults: IModalOptions): IModalProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalProvider]
  }
  @scala.inline
  implicit class IModalProviderOps[Self <: IModalProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IModalOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

