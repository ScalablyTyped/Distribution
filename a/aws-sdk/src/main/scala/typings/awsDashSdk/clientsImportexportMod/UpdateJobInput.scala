package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.undefined
  var JobId: typings.awsDashSdk.clientsImportexportMod.JobId
  var JobType: typings.awsDashSdk.clientsImportexportMod.JobType
  var Manifest: typings.awsDashSdk.clientsImportexportMod.Manifest
  var ValidateOnly: typings.awsDashSdk.clientsImportexportMod.ValidateOnly
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

