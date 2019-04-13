package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OTAUpdateSummary extends js.Object {
  /**
    * The date when the OTA update was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The OTA update ARN.
    */
  var otaUpdateArn: js.UndefOr[OTAUpdateArn] = js.undefined
  /**
    * The OTA update ID.
    */
  var otaUpdateId: js.UndefOr[OTAUpdateId] = js.undefined
}

object OTAUpdateSummary {
  @scala.inline
  def apply(creationDate: DateType = null, otaUpdateArn: OTAUpdateArn = null, otaUpdateId: OTAUpdateId = null): OTAUpdateSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (otaUpdateArn != null) __obj.updateDynamic("otaUpdateArn")(otaUpdateArn)
    if (otaUpdateId != null) __obj.updateDynamic("otaUpdateId")(otaUpdateId)
    __obj.asInstanceOf[OTAUpdateSummary]
  }
}

