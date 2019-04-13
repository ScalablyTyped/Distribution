package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRestoreJobInput extends js.Object {
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: awsDashSdkLib.clientsBackupMod.RestoreJobId
}

object DescribeRestoreJobInput {
  @scala.inline
  def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId)
  
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
}

