package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeSnapshotAccessMessage extends js.Object {
  /**
    * The identifier of the AWS customer account that can no longer restore the specified snapshot.
    */
  var AccountWithRestoreAccess: String
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the snapshot that the account can no longer access.
    */
  var SnapshotIdentifier: String
}

object RevokeSnapshotAccessMessage {
  @scala.inline
  def apply(
    AccountWithRestoreAccess: String,
    SnapshotIdentifier: String,
    SnapshotClusterIdentifier: String = null
  ): RevokeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess, SnapshotIdentifier = SnapshotIdentifier)
    if (SnapshotClusterIdentifier != null) __obj.updateDynamic("SnapshotClusterIdentifier")(SnapshotClusterIdentifier)
    __obj.asInstanceOf[RevokeSnapshotAccessMessage]
  }
}

