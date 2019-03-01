package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupOutput extends js.Object {
  /**
    * Contains the description of the backup created for the table.
    */
  var BackupDescription: js.UndefOr[BackupDescription] = js.undefined
}

object DescribeBackupOutput {
  @scala.inline
  def apply(BackupDescription: BackupDescription = null): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription)
    __obj.asInstanceOf[DescribeBackupOutput]
  }
}

