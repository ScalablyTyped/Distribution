package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.native
  var Marker: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Marker] = js.native
  var MaxJobs: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.MaxJobs] = js.native
}

object ListJobsInput {
  @scala.inline
  def apply(APIVersion: APIVersion = null, Marker: Marker = null, MaxJobs: Int | Double = null): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxJobs != null) __obj.updateDynamic("MaxJobs")(MaxJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsInput]
  }
}

