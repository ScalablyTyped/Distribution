package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderableClusterOption extends js.Object {
  /**
    * A list of availability zones for the orderable cluster.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * The cluster type, for example multi-node. 
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  /**
    * The version of the orderable cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  /**
    * The node type for the orderable cluster.
    */
  var NodeType: js.UndefOr[String] = js.undefined
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
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    __obj.asInstanceOf[OrderableClusterOption]
  }
}

