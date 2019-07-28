package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOTAUpdateResponse extends js.Object {
  /**
    * The OTA update info.
    */
  var otaUpdateInfo: js.UndefOr[OTAUpdateInfo] = js.undefined
}

object GetOTAUpdateResponse {
  @scala.inline
  def apply(otaUpdateInfo: OTAUpdateInfo = null): GetOTAUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (otaUpdateInfo != null) __obj.updateDynamic("otaUpdateInfo")(otaUpdateInfo)
    __obj.asInstanceOf[GetOTAUpdateResponse]
  }
}

