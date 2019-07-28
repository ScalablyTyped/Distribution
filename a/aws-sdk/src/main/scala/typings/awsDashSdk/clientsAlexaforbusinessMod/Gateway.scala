package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gateway extends js.Object {
  /**
    * The ARN of the gateway.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Arn] = js.undefined
  /**
    * The description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.undefined
  /**
    * The ARN of the gateway group that the gateway is associated to.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.undefined
  /**
    * The software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
}

object Gateway {
  @scala.inline
  def apply(
    Arn: Arn = null,
    Description: GatewayDescription = null,
    GatewayGroupArn: Arn = null,
    Name: GatewayName = null,
    SoftwareVersion: GatewayVersion = null
  ): Gateway = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GatewayGroupArn != null) __obj.updateDynamic("GatewayGroupArn")(GatewayGroupArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion)
    __obj.asInstanceOf[Gateway]
  }
}

