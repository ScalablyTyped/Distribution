package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion] = js.undefined
  var JobId: awsDashSdkLib.clientsImportexportMod.JobId
}

object CancelJobInput {
  @scala.inline
  def apply(JobId: JobId, APIVersion: APIVersion = null): CancelJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    __obj.asInstanceOf[CancelJobInput]
  }
}

