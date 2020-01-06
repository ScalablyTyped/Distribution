package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseReplicaCountMessage extends js.Object {
  /**
    * If True, the number of replica nodes is increased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.native
  /**
    * The id of the replication group to which you want to add replica nodes.
    */
  var ReplicationGroupId: String = js.native
}

object IncreaseReplicaCountMessage {
  @scala.inline
  def apply(
    ApplyImmediately: Boolean,
    ReplicationGroupId: String,
    NewReplicaCount: Int | scala.Double = null,
    ReplicaConfiguration: ReplicaConfigurationList = null
  ): IncreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (NewReplicaCount != null) __obj.updateDynamic("NewReplicaCount")(NewReplicaCount.asInstanceOf[js.Any])
    if (ReplicaConfiguration != null) __obj.updateDynamic("ReplicaConfiguration")(ReplicaConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseReplicaCountMessage]
  }
}

