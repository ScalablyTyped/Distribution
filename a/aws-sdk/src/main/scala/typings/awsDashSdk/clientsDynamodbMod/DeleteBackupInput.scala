package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: typings.awsDashSdk.clientsDynamodbMod.BackupArn
}

object DeleteBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DeleteBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn)
  
    __obj.asInstanceOf[DeleteBackupInput]
  }
}

