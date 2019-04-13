package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * Name of the filter. Filter names are case-sensitive.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  /**
    * One or more filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[FilterValues] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: FilterName = null, Values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Filter]
  }
}

