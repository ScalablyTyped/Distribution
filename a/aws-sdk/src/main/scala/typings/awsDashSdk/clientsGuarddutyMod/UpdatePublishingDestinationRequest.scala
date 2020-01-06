package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublishingDestinationRequest extends js.Object {
  /**
    * The ID of the detector associated with the publishing destinations to update.
    */
  var DestinationId: String = js.native
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.DestinationProperties] = js.native
  /**
    * The ID of the 
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
}

object UpdatePublishingDestinationRequest {
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId, DestinationProperties: DestinationProperties = null): UpdatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    if (DestinationProperties != null) __obj.updateDynamic("DestinationProperties")(DestinationProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublishingDestinationRequest]
  }
}

