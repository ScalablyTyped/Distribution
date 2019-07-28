package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStatusOutput extends js.Object {
  var ArtifactList: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ArtifactList] = js.undefined
  var Carrier: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Carrier] = js.undefined
  var CreationDate: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.CreationDate] = js.undefined
  var CurrentManifest: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.CurrentManifest] = js.undefined
  var ErrorCount: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ErrorCount] = js.undefined
  var JobId: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobId] = js.undefined
  var JobType: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobType] = js.undefined
  var LocationCode: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.LocationCode] = js.undefined
  var LocationMessage: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.LocationMessage] = js.undefined
  var LogBucket: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.LogBucket] = js.undefined
  var LogKey: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.LogKey] = js.undefined
  var ProgressCode: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ProgressCode] = js.undefined
  var ProgressMessage: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ProgressMessage] = js.undefined
  var Signature: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Signature] = js.undefined
  var SignatureFileContents: js.UndefOr[Signature] = js.undefined
  var TrackingNumber: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.TrackingNumber] = js.undefined
}

object GetStatusOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    Carrier: Carrier = null,
    CreationDate: CreationDate = null,
    CurrentManifest: CurrentManifest = null,
    ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
    JobId: JobId = null,
    JobType: JobType = null,
    LocationCode: LocationCode = null,
    LocationMessage: LocationMessage = null,
    LogBucket: LogBucket = null,
    LogKey: LogKey = null,
    ProgressCode: ProgressCode = null,
    ProgressMessage: ProgressMessage = null,
    Signature: Signature = null,
    SignatureFileContents: Signature = null,
    TrackingNumber: TrackingNumber = null
  ): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList)
    if (Carrier != null) __obj.updateDynamic("Carrier")(Carrier)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CurrentManifest != null) __obj.updateDynamic("CurrentManifest")(CurrentManifest)
    if (!js.isUndefined(ErrorCount)) __obj.updateDynamic("ErrorCount")(ErrorCount)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (LocationCode != null) __obj.updateDynamic("LocationCode")(LocationCode)
    if (LocationMessage != null) __obj.updateDynamic("LocationMessage")(LocationMessage)
    if (LogBucket != null) __obj.updateDynamic("LogBucket")(LogBucket)
    if (LogKey != null) __obj.updateDynamic("LogKey")(LogKey)
    if (ProgressCode != null) __obj.updateDynamic("ProgressCode")(ProgressCode)
    if (ProgressMessage != null) __obj.updateDynamic("ProgressMessage")(ProgressMessage)
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    if (SignatureFileContents != null) __obj.updateDynamic("SignatureFileContents")(SignatureFileContents)
    if (TrackingNumber != null) __obj.updateDynamic("TrackingNumber")(TrackingNumber)
    __obj.asInstanceOf[GetStatusOutput]
  }
}

