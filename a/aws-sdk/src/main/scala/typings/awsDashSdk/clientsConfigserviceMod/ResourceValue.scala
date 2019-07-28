package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceValue extends js.Object {
  /**
    * The value is a resource ID.
    */
  var Value: js.UndefOr[ResourceValueType] = js.undefined
}

object ResourceValue {
  @scala.inline
  def apply(Value: ResourceValueType = null): ResourceValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceValue]
  }
}

