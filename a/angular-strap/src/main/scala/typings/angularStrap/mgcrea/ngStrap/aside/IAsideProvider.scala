package typings.angularStrap.mgcrea.ngStrap.aside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsideProvider extends js.Object {
  var defaults: IAsideOptions = js.native
}

object IAsideProvider {
  @scala.inline
  def apply(defaults: IAsideOptions): IAsideProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsideProvider]
  }
  @scala.inline
  implicit class IAsideProviderOps[Self <: IAsideProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IAsideOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

