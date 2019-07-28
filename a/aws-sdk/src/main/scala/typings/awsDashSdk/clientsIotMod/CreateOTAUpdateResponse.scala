package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOTAUpdateResponse extends js.Object {
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.undefined
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.undefined
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
}

object CreateOTAUpdateResponse {
  @scala.inline
  def apply(
    awsIotJobArn: AwsIotJobArn = null,
    awsIotJobId: AwsIotJobId = null,
    otaUpdateArn: OTAUpdateArn = null,
    otaUpdateId: OTAUpdateId = null,
    otaUpdateStatus: OTAUpdateStatus = null
  ): CreateOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (awsIotJobArn != null) __obj.updateDynamic("awsIotJobArn")(awsIotJobArn)
    if (awsIotJobId != null) __obj.updateDynamic("awsIotJobId")(awsIotJobId)
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn)
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId)
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
}

