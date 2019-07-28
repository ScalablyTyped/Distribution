package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStatusInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.undefined
  var JobId: typings.awsDashSdk.clientsImportexportMod.JobId
}

object GetStatusInput {
  @scala.inline
  def apply(JobId: JobId, APIVersion: APIVersion = null): GetStatusInput = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    __obj.asInstanceOf[GetStatusInput]
  }
}

