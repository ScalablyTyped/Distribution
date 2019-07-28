package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOTAUpdateRequest extends js.Object {
  /**
    * The OTA update ID.
    */
  var otaUpdateId: OTAUpdateId
}

object GetOTAUpdateRequest {
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): GetOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId)
  
    __obj.asInstanceOf[GetOTAUpdateRequest]
  }
}

