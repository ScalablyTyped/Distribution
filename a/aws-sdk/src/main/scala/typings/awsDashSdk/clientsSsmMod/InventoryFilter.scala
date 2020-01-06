package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryFilter extends js.Object {
  /**
    * The name of the filter key.
    */
  var Key: InventoryFilterKey = js.native
  /**
    * The type of filter. Valid values include the following: "Equal"|"NotEqual"|"BeginWith"|"LessThan"|"GreaterThan"
    */
  var Type: js.UndefOr[InventoryQueryOperatorType] = js.native
  /**
    * Inventory filter values. Example: inventory filter where instance IDs are specified as values Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal 
    */
  var Values: InventoryFilterValueList = js.native
}

object InventoryFilter {
  @scala.inline
  def apply(Key: InventoryFilterKey, Values: InventoryFilterValueList, Type: InventoryQueryOperatorType = null): InventoryFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
}

