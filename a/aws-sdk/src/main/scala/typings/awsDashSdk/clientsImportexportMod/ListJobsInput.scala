package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.undefined
  var Marker: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Marker] = js.undefined
  var MaxJobs: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.MaxJobs] = js.undefined
}

object ListJobsInput {
  @scala.inline
  def apply(APIVersion: APIVersion = null, Marker: Marker = null, MaxJobs: Int | Double = null): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxJobs != null) __obj.updateDynamic("MaxJobs")(MaxJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsInput]
  }
}

