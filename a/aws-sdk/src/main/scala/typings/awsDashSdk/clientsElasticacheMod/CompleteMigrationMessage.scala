package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMigrationMessage extends js.Object {
  /**
    * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to abort the migration and not recommended when application wants to continue migration to ElastiCache.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the replication group to which data is being migrated.
    */
  var ReplicationGroupId: String = js.native
}

object CompleteMigrationMessage {
  @scala.inline
  def apply(ReplicationGroupId: String, Force: js.UndefOr[scala.Boolean] = js.undefined): CompleteMigrationMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMigrationMessage]
  }
}

