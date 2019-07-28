package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRestoreJobOutput extends js.Object {
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[typings.awsDashSdk.clientsBackupMod.RestoreJobId] = js.undefined
}

object StartRestoreJobOutput {
  @scala.inline
  def apply(RestoreJobId: RestoreJobId = null): StartRestoreJobOutput = {
    val __obj = js.Dynamic.literal()
    if (RestoreJobId != null) __obj.updateDynamic("RestoreJobId")(RestoreJobId)
    __obj.asInstanceOf[StartRestoreJobOutput]
  }
}

