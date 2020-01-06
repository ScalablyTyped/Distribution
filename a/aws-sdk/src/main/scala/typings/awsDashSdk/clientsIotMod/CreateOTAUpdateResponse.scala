package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOTAUpdateResponse extends js.Object {
  /**
    * The AWS IoT job ARN associated with the OTA update.
    */
  var awsIotJobArn: js.UndefOr[AwsIotJobArn] = js.native
  /**
    * The AWS IoT job ID associated with the OTA update.
    */
  var awsIotJobId: js.UndefOr[AwsIotJobId] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
  /**
    * The OTA update status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
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
    if (awsIotJobArn != null) __obj.updateDynamic("awsIotJobArn")(awsIotJobArn.asInstanceOf[js.Any])
    if (awsIotJobId != null) __obj.updateDynamic("awsIotJobId")(awsIotJobId.asInstanceOf[js.Any])
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn.asInstanceOf[js.Any])
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId.asInstanceOf[js.Any])
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateResponse]
  }
}

