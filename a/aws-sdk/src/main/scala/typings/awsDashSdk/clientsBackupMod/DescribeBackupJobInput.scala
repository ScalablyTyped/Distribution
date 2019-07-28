package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String
}

object DescribeBackupJobInput {
  @scala.inline
  def apply(BackupJobId: String): DescribeBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId)
  
    __obj.asInstanceOf[DescribeBackupJobInput]
  }
}

