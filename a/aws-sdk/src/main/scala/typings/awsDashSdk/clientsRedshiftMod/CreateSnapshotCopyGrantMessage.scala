package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotCopyGrantMessage extends js.Object {
  /**
    * The unique identifier of the customer master key (CMK) to which to grant Amazon Redshift permission. If no key is specified, the default key is used.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The name of the snapshot copy grant. This name must be unique in the region for the AWS account. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
    */
  var SnapshotCopyGrantName: String
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateSnapshotCopyGrantMessage {
  @scala.inline
  def apply(SnapshotCopyGrantName: String, KmsKeyId: String = null, Tags: TagList = null): CreateSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateSnapshotCopyGrantMessage]
  }
}

