package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationGroupPendingModifiedValues extends js.Object {
  /**
    * Indicates the status of Multi-AZ with automatic failover for this Redis replication group. Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
    */
  var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined
  /**
    * The primary cluster ID that is applied immediately (if --apply-immediately was specified), or during the next maintenance window.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.undefined
  /**
    * The status of an online resharding operation.
    */
  var Resharding: js.UndefOr[ReshardingStatus] = js.undefined
}

object ReplicationGroupPendingModifiedValues {
  @scala.inline
  def apply(
    AutomaticFailoverStatus: PendingAutomaticFailoverStatus = null,
    PrimaryClusterId: String = null,
    Resharding: ReshardingStatus = null
  ): ReplicationGroupPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (AutomaticFailoverStatus != null) __obj.updateDynamic("AutomaticFailoverStatus")(AutomaticFailoverStatus.asInstanceOf[js.Any])
    if (PrimaryClusterId != null) __obj.updateDynamic("PrimaryClusterId")(PrimaryClusterId)
    if (Resharding != null) __obj.updateDynamic("Resharding")(Resharding)
    __obj.asInstanceOf[ReplicationGroupPendingModifiedValues]
  }
}

