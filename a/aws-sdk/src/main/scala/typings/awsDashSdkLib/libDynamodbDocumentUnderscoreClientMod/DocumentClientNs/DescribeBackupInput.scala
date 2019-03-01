package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: BackupArn
}

object DescribeBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DescribeBackupInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackupArn")(BackupArn)
    __obj.asInstanceOf[DescribeBackupInput]
  }
}

