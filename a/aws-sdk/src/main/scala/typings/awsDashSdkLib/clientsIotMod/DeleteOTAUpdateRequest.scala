package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOTAUpdateRequest extends js.Object {
  /**
    * Specifies if the stream associated with an OTA update should be deleted when the OTA update is deleted.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.undefined
  /**
    * Specifies if the AWS Job associated with the OTA update should be deleted with the OTA update is deleted.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
  /**
    * The OTA update ID to delete.
    */
  var otaUpdateId: OTAUpdateId
}

object DeleteOTAUpdateRequest {
  @scala.inline
  def apply(
    otaUpdateId: OTAUpdateId,
    deleteStream: js.UndefOr[DeleteStream] = js.undefined,
    forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
  ): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId)
    if (!js.isUndefined(deleteStream)) __obj.updateDynamic("deleteStream")(deleteStream)
    if (!js.isUndefined(forceDeleteAWSJob)) __obj.updateDynamic("forceDeleteAWSJob")(forceDeleteAWSJob)
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
}

