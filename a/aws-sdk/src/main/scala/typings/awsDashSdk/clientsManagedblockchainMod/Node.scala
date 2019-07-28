package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * Attributes of the blockchain framework being used.
    */
  var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.undefined
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The instance type of the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.undefined
  /**
    * The unique identifier of the member to which the node belongs.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The unique identifier of the network that the node is in.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZoneString = null,
    CreationDate: Timestamp = null,
    FrameworkAttributes: NodeFrameworkAttributes = null,
    Id: ResourceIdString = null,
    InstanceType: InstanceTypeString = null,
    MemberId: ResourceIdString = null,
    NetworkId: ResourceIdString = null,
    Status: NodeStatus = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (FrameworkAttributes != null) __obj.updateDynamic("FrameworkAttributes")(FrameworkAttributes)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId)
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

