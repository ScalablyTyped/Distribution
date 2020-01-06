package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuntimeConfigurationInput extends js.Object {
  /**
    * A unique identifier for a fleet to get the runtime configuration for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId = js.native
}

object DescribeRuntimeConfigurationInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRuntimeConfigurationInput]
  }
}

