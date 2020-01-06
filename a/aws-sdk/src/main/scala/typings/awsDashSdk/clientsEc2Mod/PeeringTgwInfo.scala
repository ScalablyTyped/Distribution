package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringTgwInfo extends js.Object {
  /**
    * The AWS account ID of the owner of the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The Region of the transit gateway.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
}

object PeeringTgwInfo {
  @scala.inline
  def apply(OwnerId: String = null, Region: String = null, TransitGatewayId: String = null): PeeringTgwInfo = {
    val __obj = js.Dynamic.literal()
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringTgwInfo]
  }
}

