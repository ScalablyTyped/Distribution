package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecordsRequest extends js.Object {
  /**
    * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The ClientContext field is not yet implemented.
    */
  var ClientContext: js.UndefOr[ClientContext] = js.undefined
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: awsDashSdkLib.clientsCognitosyncMod.DatasetName
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[DeviceId] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: awsDashSdkLib.clientsCognitosyncMod.IdentityId
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
  /**
    * A list of patch operations.
    */
  var RecordPatches: js.UndefOr[RecordPatchList] = js.undefined
  /**
    * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
    */
  var SyncSessionToken: awsDashSdkLib.clientsCognitosyncMod.SyncSessionToken
}

object UpdateRecordsRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId,
    SyncSessionToken: SyncSessionToken,
    ClientContext: ClientContext = null,
    DeviceId: DeviceId = null,
    RecordPatches: RecordPatchList = null
  ): UpdateRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName, IdentityId = IdentityId, IdentityPoolId = IdentityPoolId, SyncSessionToken = SyncSessionToken)
    if (ClientContext != null) __obj.updateDynamic("ClientContext")(ClientContext)
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (RecordPatches != null) __obj.updateDynamic("RecordPatches")(RecordPatches)
    __obj.asInstanceOf[UpdateRecordsRequest]
  }
}

