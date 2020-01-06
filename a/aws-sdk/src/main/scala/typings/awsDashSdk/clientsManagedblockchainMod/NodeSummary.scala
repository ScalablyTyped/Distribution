package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSummary extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.native
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The EC2 instance type for the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.native
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.native
}

object NodeSummary {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZoneString = null,
    CreationDate: Timestamp = null,
    Id: ResourceIdString = null,
    InstanceType: InstanceTypeString = null,
    Status: NodeStatus = null
  ): NodeSummary = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSummary]
  }
}

