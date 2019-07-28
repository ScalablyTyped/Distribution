package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGatewayRequest extends js.Object {
  /**
    * The updated description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.undefined
  /**
    * The ARN of the gateway to update.
    */
  var GatewayArn: Arn
  /**
    * The updated name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.undefined
  /**
    * The updated software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
}

object UpdateGatewayRequest {
  @scala.inline
  def apply(
    GatewayArn: Arn,
    Description: GatewayDescription = null,
    Name: GatewayName = null,
    SoftwareVersion: GatewayVersion = null
  ): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion)
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
}

