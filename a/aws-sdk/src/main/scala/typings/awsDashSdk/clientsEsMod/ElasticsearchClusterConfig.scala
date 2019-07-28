package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchClusterConfig extends js.Object {
  /**
    * Total number of dedicated master nodes, active and on standby, for the cluster.
    */
  var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined
  /**
    * A boolean value to indicate whether a dedicated master node is enabled. See About Dedicated Master Nodes for more information.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance type for a dedicated master node.
    */
  var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.undefined
  /**
    * The number of instances in the specified domain cluster.
    */
  var InstanceCount: js.UndefOr[IntegerClass] = js.undefined
  /**
    * The instance type for an Elasticsearch cluster.
    */
  var InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
  /**
    * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
    */
  var ZoneAwarenessConfig: js.UndefOr[typings.awsDashSdk.clientsEsMod.ZoneAwarenessConfig] = js.undefined
  /**
    * A boolean value to indicate whether zone awareness is enabled. See About Zone Awareness for more information.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}

object ElasticsearchClusterConfig {
  @scala.inline
  def apply(
    DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
    DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
    DedicatedMasterType: ESPartitionInstanceType = null,
    InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
    InstanceType: ESPartitionInstanceType = null,
    ZoneAwarenessConfig: ZoneAwarenessConfig = null,
    ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
  ): ElasticsearchClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DedicatedMasterCount)) __obj.updateDynamic("DedicatedMasterCount")(DedicatedMasterCount)
    if (!js.isUndefined(DedicatedMasterEnabled)) __obj.updateDynamic("DedicatedMasterEnabled")(DedicatedMasterEnabled)
    if (DedicatedMasterType != null) __obj.updateDynamic("DedicatedMasterType")(DedicatedMasterType.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (ZoneAwarenessConfig != null) __obj.updateDynamic("ZoneAwarenessConfig")(ZoneAwarenessConfig)
    if (!js.isUndefined(ZoneAwarenessEnabled)) __obj.updateDynamic("ZoneAwarenessEnabled")(ZoneAwarenessEnabled)
    __obj.asInstanceOf[ElasticsearchClusterConfig]
  }
}

