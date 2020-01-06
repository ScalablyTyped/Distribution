package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetCapacity extends js.Object {
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
  /**
    * Current status of fleet capacity.
    */
  var InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.native
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.native
}

object FleetCapacity {
  @scala.inline
  def apply(
    FleetId: FleetId = null,
    InstanceCounts: EC2InstanceCounts = null,
    InstanceType: EC2InstanceType = null
  ): FleetCapacity = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (InstanceCounts != null) __obj.updateDynamic("InstanceCounts")(InstanceCounts.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetCapacity]
  }
}

