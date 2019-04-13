package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryFilter extends js.Object {
  /**
    * The condition of the filter.
    */
  var Condition: InventoryFilterCondition
  /**
    * The name of the filter.
    */
  var Name: String
  /**
    * Value of the filter.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object InventoryFilter {
  @scala.inline
  def apply(Condition: InventoryFilterCondition, Name: String, Value: String = null): InventoryFilter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Name = Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[InventoryFilter]
  }
}

