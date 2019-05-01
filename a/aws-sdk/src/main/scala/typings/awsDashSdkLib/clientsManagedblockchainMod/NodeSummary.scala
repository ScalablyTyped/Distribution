package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSummary extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The EC2 instance type for the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.undefined
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
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
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSummary]
  }
}

