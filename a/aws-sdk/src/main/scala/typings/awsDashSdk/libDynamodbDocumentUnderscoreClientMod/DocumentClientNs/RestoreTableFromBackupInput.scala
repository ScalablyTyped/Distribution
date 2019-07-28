package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromBackupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.BackupArn
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

