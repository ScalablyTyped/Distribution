package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRestoreJobInput extends js.Object {
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: typings.awsDashSdk.clientsBackupMod.RestoreJobId
}

object DescribeRestoreJobInput {
  @scala.inline
  def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId)
  
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
}

