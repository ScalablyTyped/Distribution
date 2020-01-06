package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetPortSettingsInput extends js.Object {
  /**
    * A unique identifier for a fleet to retrieve port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId = js.native
}

object DescribeFleetPortSettingsInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
}

