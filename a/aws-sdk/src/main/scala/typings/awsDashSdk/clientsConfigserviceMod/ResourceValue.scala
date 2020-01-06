package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceValue extends js.Object {
  /**
    * The value is a resource ID.
    */
  var Value: ResourceValueType = js.native
}

object ResourceValue {
  @scala.inline
  def apply(Value: ResourceValueType): ResourceValue = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceValue]
  }
}

