package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringConnectionsInput extends js.Object {
  /**
    * A unique identifier for a fleet. You can use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
}

object DescribeVpcPeeringConnectionsInput {
  @scala.inline
  def apply(FleetId: FleetId = null): DescribeVpcPeeringConnectionsInput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsInput]
  }
}

