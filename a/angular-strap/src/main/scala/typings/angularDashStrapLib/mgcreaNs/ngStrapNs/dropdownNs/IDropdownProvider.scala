package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.dropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownProvider extends js.Object {
  var defaults: IDropdownOptions
}

object IDropdownProvider {
  @scala.inline
  def apply(defaults: IDropdownOptions): IDropdownProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[IDropdownProvider]
  }
}

