package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies the backup plan to be associated with the selection of resources.
    */
  var BackupPlanId: java.lang.String
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan. It includes an array of resources, an optional array of patterns to exclude resources, an optional role to provide access to the AWS service the resource belongs to, and an optional array of tags used to identify a set of resources.
    */
  var BackupSelection: awsDashSdkLib.clientsBackupMod.BackupSelection
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateBackupSelectionInput {
  @scala.inline
  def apply(
    BackupPlanId: java.lang.String,
    BackupSelection: BackupSelection,
    CreatorRequestId: java.lang.String = null
  ): CreateBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId, BackupSelection = BackupSelection)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    __obj.asInstanceOf[CreateBackupSelectionInput]
  }
}

