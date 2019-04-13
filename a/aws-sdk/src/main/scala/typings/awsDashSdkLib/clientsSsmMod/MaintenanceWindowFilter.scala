package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined
  /**
    * The filter values.
    */
  var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
}

object MaintenanceWindowFilter {
  @scala.inline
  def apply(Key: MaintenanceWindowFilterKey = null, Values: MaintenanceWindowFilterValues = null): MaintenanceWindowFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[MaintenanceWindowFilter]
  }
}

