package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScalingPolicyInput extends js.Object {
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId = js.native
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString = js.native
}

object DeleteScalingPolicyInput {
  @scala.inline
  def apply(FleetId: FleetId, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
}

