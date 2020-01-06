package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableClusterOption extends js.Object {
  /**
    * A list of availability zones for the orderable cluster.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The cluster type, for example multi-node. 
    */
  var ClusterType: js.UndefOr[String] = js.native
  /**
    * The version of the orderable cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The node type for the orderable cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
}

object OrderableClusterOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    ClusterType: String = null,
    ClusterVersion: String = null,
    NodeType: String = null
  ): OrderableClusterOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType.asInstanceOf[js.Any])
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableClusterOption]
  }
}

