package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: BackupArn
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName
}

