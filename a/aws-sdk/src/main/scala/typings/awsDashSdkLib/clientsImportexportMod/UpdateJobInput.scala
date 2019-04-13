package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion] = js.undefined
  var JobId: awsDashSdkLib.clientsImportexportMod.JobId
  var JobType: awsDashSdkLib.clientsImportexportMod.JobType
  var Manifest: awsDashSdkLib.clientsImportexportMod.Manifest
  var ValidateOnly: awsDashSdkLib.clientsImportexportMod.ValidateOnly
}

object UpdateJobInput {
  @scala.inline
  def apply(
    JobId: JobId,
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion = null
  ): UpdateJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId, JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest, ValidateOnly = ValidateOnly)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    __obj.asInstanceOf[UpdateJobInput]
  }
}

