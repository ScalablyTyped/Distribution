package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStatusInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion] = js.undefined
  var JobId: awsDashSdkLib.clientsImportexportMod.JobId
}

object GetStatusInput {
  @scala.inline
  def apply(JobId: JobId, APIVersion: APIVersion = null): GetStatusInput = {
    val __obj = js.Dynamic.literal(JobId = JobId)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    __obj.asInstanceOf[GetStatusInput]
  }
}

