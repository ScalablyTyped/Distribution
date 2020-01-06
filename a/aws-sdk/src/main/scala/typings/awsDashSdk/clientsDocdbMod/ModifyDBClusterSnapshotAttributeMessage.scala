package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
  /**
    * The name of the DB cluster snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual DB cluster snapshot, set this value to restore.
    */
  var AttributeName: String = js.native
  /**
    * The identifier for the DB cluster snapshot to modify the attributes for.
    */
  var DBClusterSnapshotIdentifier: String = js.native
  /**
    * A list of DB cluster snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account IDs. To make the manual DB cluster snapshot restorable by any AWS account, set it to all. Do not add the all value for any manual DB cluster snapshots that contain private information that you don't want to be available to all AWS accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.native
  /**
    * A list of DB cluster snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual DB cluster snapshot, set this list to include one or more AWS account identifiers. To remove authorization for any AWS account to copy or restore the DB cluster snapshot, set it to all . If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore a manual DB cluster snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.native
}

object ModifyDBClusterSnapshotAttributeMessage {
  @scala.inline
  def apply(
    AttributeName: String,
    DBClusterSnapshotIdentifier: String,
    ValuesToAdd: AttributeValueList = null,
    ValuesToRemove: AttributeValueList = null
  ): ModifyDBClusterSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (ValuesToAdd != null) __obj.updateDynamic("ValuesToAdd")(ValuesToAdd.asInstanceOf[js.Any])
    if (ValuesToRemove != null) __obj.updateDynamic("ValuesToRemove")(ValuesToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
  }
}

