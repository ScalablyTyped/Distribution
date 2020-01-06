package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicationFactorRequest extends js.Object {
  /**
    * The Availability Zone(s) from which to remove nodes.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The name of the DAX cluster from which you want to remove nodes.
    */
  var ClusterName: String = js.native
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer = js.native
  /**
    * The unique identifiers of the nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.native
}

object DecreaseReplicationFactorRequest {
  @scala.inline
  def apply(
    ClusterName: String,
    NewReplicationFactor: Integer,
    AvailabilityZones: AvailabilityZoneList = null,
    NodeIdsToRemove: NodeIdentifierList = null
  ): DecreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (NodeIdsToRemove != null) __obj.updateDynamic("NodeIdsToRemove")(NodeIdsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicationFactorRequest]
  }
}

