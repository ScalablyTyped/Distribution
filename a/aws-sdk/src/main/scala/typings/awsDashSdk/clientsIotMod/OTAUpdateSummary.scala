package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateSummary extends js.Object {
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.native
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.native
}

object OTAUpdateSummary {
  @scala.inline
  def apply(creationDate: DateType = null, otaUpdateArn: OTAUpdateArn = null, otaUpdateId: OTAUpdateId = null): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn.asInstanceOf[js.Any])
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OTAUpdateSummary]
  }
}

