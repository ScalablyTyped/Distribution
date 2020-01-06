package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupUpdate extends js.Object {
  /**
    * The parameters required for creating a replica for the table.
    */
  var Create: js.UndefOr[CreateReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for deleting a replica for the table.
    */
  var Delete: js.UndefOr[DeleteReplicationGroupMemberAction] = js.native
  /**
    * The parameters required for updating a replica for the table.
    */
  var Update: js.UndefOr[UpdateReplicationGroupMemberAction] = js.native
}

object ReplicationGroupUpdate {
  @scala.inline
  def apply(
    Create: CreateReplicationGroupMemberAction = null,
    Delete: DeleteReplicationGroupMemberAction = null,
    Update: UpdateReplicationGroupMemberAction = null
  ): ReplicationGroupUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    if (Update != null) __obj.updateDynamic("Update")(Update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupUpdate]
  }
}

