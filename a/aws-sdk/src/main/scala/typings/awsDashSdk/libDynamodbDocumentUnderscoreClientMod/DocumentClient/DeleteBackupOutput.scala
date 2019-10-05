package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupDescription
  ] = js.undefined
}

object DeleteBackupOutput {
  @scala.inline
  def apply(BackupDescription: BackupDescription = null): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription)
    __obj.asInstanceOf[DeleteBackupOutput]
  }
}

