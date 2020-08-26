package typings.angularStrap.mgcrea.ngStrap.affix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAffixProvider extends js.Object {
  var defaults: IAffixOptions = js.native
}

object IAffixProvider {
  @scala.inline
  def apply(defaults: IAffixOptions): IAffixProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAffixProvider]
  }
  @scala.inline
  implicit class IAffixProviderOps[Self <: IAffixProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: IAffixOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

