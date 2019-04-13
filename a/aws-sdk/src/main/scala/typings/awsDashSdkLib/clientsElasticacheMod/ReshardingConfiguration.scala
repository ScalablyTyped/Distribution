package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshardingConfiguration extends js.Object {
  /**
    * The 4-digit id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.undefined
  /**
    * A list of preferred availability zones for the nodes in this cluster.
    */
  var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
}

object ReshardingConfiguration {
  @scala.inline
  def apply(NodeGroupId: AllowedNodeGroupId = null, PreferredAvailabilityZones: AvailabilityZonesList = null): ReshardingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId)
    if (PreferredAvailabilityZones != null) __obj.updateDynamic("PreferredAvailabilityZones")(PreferredAvailabilityZones)
    __obj.asInstanceOf[ReshardingConfiguration]
  }
}

