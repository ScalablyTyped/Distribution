package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: awsDashSdkLib.clientsDynamodbMod.BackupArn
}

object DescribeBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DescribeBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn)
  
    __obj.asInstanceOf[DescribeBackupInput]
  }
}

