package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: java.lang.String
}

object DescribeBackupJobInput {
  @scala.inline
  def apply(BackupJobId: java.lang.String): DescribeBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId)
  
    __obj.asInstanceOf[DescribeBackupJobInput]
  }
}

