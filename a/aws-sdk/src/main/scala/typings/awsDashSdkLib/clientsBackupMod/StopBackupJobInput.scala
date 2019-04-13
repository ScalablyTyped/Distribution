package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBackupJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: java.lang.String
}

object StopBackupJobInput {
  @scala.inline
  def apply(BackupJobId: java.lang.String): StopBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId)
  
    __obj.asInstanceOf[StopBackupJobInput]
  }
}

