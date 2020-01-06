package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOTAUpdateResponse extends js.Object {
  /**
    * The OTA update info.
    */
  var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.native
}

object GetOTAUpdateResponse {
  @scala.inline
  def apply(otaUpdateInfo: OTAUpdateInfo = null): GetOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (otaUpdateInfo != null) __obj.updateDynamic("otaUpdateInfo")(otaUpdateInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOTAUpdateResponse]
  }
}

