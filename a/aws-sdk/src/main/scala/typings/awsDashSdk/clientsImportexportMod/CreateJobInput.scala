package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobInput extends js.Object {
  var APIVersion: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.APIVersion] = js.undefined
  var JobType: typings.awsDashSdk.clientsImportexportMod.JobType
  var Manifest: typings.awsDashSdk.clientsImportexportMod.Manifest
  var ManifestAddendum: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ManifestAddendum] = js.undefined
  var ValidateOnly: typings.awsDashSdk.clientsImportexportMod.ValidateOnly
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
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest, ValidateOnly = ValidateOnly)
    if (APIVersion != null) __obj.updateDynamic("APIVersion")(APIVersion)
    if (ManifestAddendum != null) __obj.updateDynamic("ManifestAddendum")(ManifestAddendum)
    __obj.asInstanceOf[CreateJobInput]
  }
}

