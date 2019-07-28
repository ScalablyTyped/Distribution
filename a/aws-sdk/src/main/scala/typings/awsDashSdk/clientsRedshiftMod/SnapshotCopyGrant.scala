package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyGrant extends js.Object {
  /**
    * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object SnapshotCopyGrant {
  @scala.inline
  def apply(KmsKeyId: String = null, SnapshotCopyGrantName: String = null, Tags: TagList = null): SnapshotCopyGrant = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (SnapshotCopyGrantName != null) __obj.updateDynamic("SnapshotCopyGrantName")(SnapshotCopyGrantName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[SnapshotCopyGrant]
  }
}

