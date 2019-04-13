package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncreaseReplicationFactorRequest extends js.Object {
  /**
    * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The name of the DAX cluster that will receive additional nodes.
    */
  var ClusterName: String
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer
}

object IncreaseReplicationFactorRequest {
  @scala.inline
  def apply(ClusterName: String, NewReplicationFactor: Integer, AvailabilityZones: AvailabilityZoneList = null): IncreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName, NewReplicationFactor = NewReplicationFactor)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[IncreaseReplicationFactorRequest]
  }
}

