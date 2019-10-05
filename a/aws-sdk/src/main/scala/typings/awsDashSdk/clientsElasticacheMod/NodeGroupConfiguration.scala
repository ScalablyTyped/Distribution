package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeGroupConfiguration extends js.Object {
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
  /**
    * The Availability Zone where the primary node of this node group (shard) is launched.
    */
  var PrimaryAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must match the value of ReplicaCount or ReplicasPerNodeGroup if not specified.
    */
  var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
  /**
    * The number of read replica nodes in this node group (shard).
    */
  var ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey. Example: "0-3999" 
    */
  var Slots: js.UndefOr[String] = js.undefined
}

object NodeGroupConfiguration {
  @scala.inline
  def apply(
    NodeGroupId: AllowedNodeGroupId = null,
    PrimaryAvailabilityZone: String = null,
    ReplicaAvailabilityZones: AvailabilityZonesList = null,
    ReplicaCount: Int | scala.Double = null,
    Slots: String = null
  ): NodeGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId)
    if (PrimaryAvailabilityZone != null) __obj.updateDynamic("PrimaryAvailabilityZone")(PrimaryAvailabilityZone)
    if (ReplicaAvailabilityZones != null) __obj.updateDynamic("ReplicaAvailabilityZones")(ReplicaAvailabilityZones)
    if (ReplicaCount != null) __obj.updateDynamic("ReplicaCount")(ReplicaCount.asInstanceOf[js.Any])
    if (Slots != null) __obj.updateDynamic("Slots")(Slots)
    __obj.asInstanceOf[NodeGroupConfiguration]
  }
}

