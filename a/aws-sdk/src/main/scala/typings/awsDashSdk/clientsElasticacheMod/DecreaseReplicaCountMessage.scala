package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseReplicaCountMessage extends js.Object {
  /**
    * If True, the number of replica nodes is decreased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ with Automatic Failover is enabled: 1   If Multi-AZ with Automatic Failover is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
  /**
    * A list of the node ids to remove from the replication group or node group (shard).
    */
  var ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.undefined
  /**
    * The id of the replication group from which you want to remove replica nodes.
    */
  var ReplicationGroupId: String
}

object DecreaseReplicaCountMessage {
  @scala.inline
  def apply(
    ApplyImmediately: Boolean,
    ReplicationGroupId: String,
    NewReplicaCount: Int | scala.Double = null,
    ReplicaConfiguration: ReplicaConfigurationList = null,
    ReplicasToRemove: RemoveReplicasList = null
  ): DecreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately, ReplicationGroupId = ReplicationGroupId)
    if (NewReplicaCount != null) __obj.updateDynamic("NewReplicaCount")(NewReplicaCount.asInstanceOf[js.Any])
    if (ReplicaConfiguration != null) __obj.updateDynamic("ReplicaConfiguration")(ReplicaConfiguration)
    if (ReplicasToRemove != null) __obj.updateDynamic("ReplicasToRemove")(ReplicasToRemove)
    __obj.asInstanceOf[DecreaseReplicaCountMessage]
  }
}

