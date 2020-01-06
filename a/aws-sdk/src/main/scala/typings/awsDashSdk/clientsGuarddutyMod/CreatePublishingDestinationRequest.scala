package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublishingDestinationRequest extends js.Object {
  /**
    * The idempotency token for the request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ClientToken] = js.native
  /**
    * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for encryption.
    */
  var DestinationProperties: typings.awsDashSdk.clientsGuarddutyMod.DestinationProperties = js.native
  /**
    * The type of resource for the publishing destination. Currently only S3 is supported.
    */
  var DestinationType: typings.awsDashSdk.clientsGuarddutyMod.DestinationType = js.native
  /**
    * The ID of the GuardDuty detector associated with the publishing destination.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId = js.native
}

object CreatePublishingDestinationRequest {
  @scala.inline
  def apply(
    DestinationProperties: DestinationProperties,
    DestinationType: DestinationType,
    DetectorId: DetectorId,
    ClientToken: ClientToken = null
  ): CreatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationProperties = DestinationProperties.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationRequest]
  }
}

