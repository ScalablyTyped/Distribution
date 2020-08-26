package typings.angularStrap.mgcrea.ngStrap.alert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlertProvider extends js.Object {
  var defaults: IAlertOptions = js.native
}

object IAlertProvider {
  @scala.inline
  def apply(defaults: IAlertOptions): IAlertProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProvider]
  }
  @scala.inline
  implicit class IAlertProviderOps[Self <: IAlertProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IAlertOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

