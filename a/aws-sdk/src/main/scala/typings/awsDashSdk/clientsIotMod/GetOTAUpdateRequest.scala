package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOTAUpdateRequest extends js.Object {
  /**
    * The OTA update ID.
    */
  var otaUpdateId: OTAUpdateId = js.native
}

object GetOTAUpdateRequest {
  @scala.inline
  def apply(otaUpdateId: OTAUpdateId): GetOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOTAUpdateRequest]
  }
}

