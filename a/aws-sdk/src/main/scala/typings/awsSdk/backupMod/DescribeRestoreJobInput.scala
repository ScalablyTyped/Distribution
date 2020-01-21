package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRestoreJobInput extends js.Object {
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: typings.awsSdk.backupMod.RestoreJobId = js.native
}

object DescribeRestoreJobInput {
  @scala.inline
  def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
}

