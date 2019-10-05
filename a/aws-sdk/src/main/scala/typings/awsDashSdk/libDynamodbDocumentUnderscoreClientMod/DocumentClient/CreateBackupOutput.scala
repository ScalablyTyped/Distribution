package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupOutput extends js.Object {
  /**
    * Contains the details of the backup created for the table.
    */
  var BackupDetails: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupDetails
  ] = js.undefined
}

object CreateBackupOutput {
  @scala.inline
  def apply(BackupDetails: BackupDetails = null): CreateBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails)
    __obj.asInstanceOf[CreateBackupOutput]
  }
}

