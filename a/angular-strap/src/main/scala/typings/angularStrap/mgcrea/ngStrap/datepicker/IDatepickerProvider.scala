package typings.angularStrap.mgcrea.ngStrap.datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerProvider extends js.Object {
  var defaults: IDatepickerOptions = js.native
}

object IDatepickerProvider {
  @scala.inline
  def apply(defaults: IDatepickerOptions): IDatepickerProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerProvider]
  }
  @scala.inline
  implicit class IDatepickerProviderOps[Self <: IDatepickerProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IDatepickerOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

