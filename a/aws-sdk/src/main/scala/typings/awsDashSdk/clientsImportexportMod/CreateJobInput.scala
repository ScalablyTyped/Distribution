package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.native
  var JobType: typings.awsDashSdk.clientsImportexportMod.JobType = js.native
  var Manifest: typings.awsDashSdk.clientsImportexportMod.Manifest = js.native
  var ManifestAddendum: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ManifestAddendum] = js.native
  var ValidateOnly: typings.awsDashSdk.clientsImportexportMod.ValidateOnly = js.native
}

object CreateJobInput {
  @scala.inline
  def apply(
    JobType: JobType,
    Manifest: Manifest,
    ValidateOnly: ValidateOnly,
    APIVersion: APIVersion = null,
    ManifestAddendum: ManifestAddendum = null
  ): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion.asInstanceOf[js.Any])
    if (ManifestAddendum != null) __obj.updateDynamic("ManifestAddendum")(ManifestAddendum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
}

