package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseReplicationFactorRequest extends js.Object {
  /**
    * The Availability Zone(s) from which to remove nodes.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The name of the DAX cluster from which you want to remove nodes.
    */
  var ClusterName: String
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer
  /**
    * The unique identifiers of the nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
}

object DecreaseReplicationFactorRequest {
  @scala.inline
  def apply(
    ClusterName: String,
    NewReplicationFactor: Integer,
    AvailabilityZones: AvailabilityZoneList = null,
    NodeIdsToRemove: NodeIdentifierList = null
  ): DecreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName, NewReplicationFactor = NewReplicationFactor)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (NodeIdsToRemove != null) __obj.updateDynamic("NodeIdsToRemove")(NodeIdsToRemove)
    __obj.asInstanceOf[DecreaseReplicationFactorRequest]
  }
}

