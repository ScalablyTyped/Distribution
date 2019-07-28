package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ArtifactList] = js.undefined
  var JobId: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobId] = js.undefined
  var JobType: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobType] = js.undefined
  var Signature: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Signature] = js.undefined
  var SignatureFileContents: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.SignatureFileContents] = js.undefined
  var WarningMessage: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.WarningMessage] = js.undefined
}

object CreateJobOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    JobId: JobId = null,
    JobType: JobType = null,
    Signature: Signature = null,
    SignatureFileContents: SignatureFileContents = null,
    WarningMessage: WarningMessage = null
  ): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    if (SignatureFileContents != null) __obj.updateDynamic("SignatureFileContents")(SignatureFileContents)
    if (WarningMessage != null) __obj.updateDynamic("WarningMessage")(WarningMessage)
    __obj.asInstanceOf[CreateJobOutput]
  }
}

