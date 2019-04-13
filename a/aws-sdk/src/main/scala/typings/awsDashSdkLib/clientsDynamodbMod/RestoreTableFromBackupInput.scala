package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: awsDashSdkLib.clientsDynamodbMod.BackupArn
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName
}

object RestoreTableFromBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn, TargetTableName = TargetTableName)
  
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
}

