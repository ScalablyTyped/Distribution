package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewaySummary extends js.Object {
  /**
    * The ARN of the gateway.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Arn] = js.native
  /**
    * The description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.native
  /**
    * The ARN of the gateway group that the gateway is associated to.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.native
  /**
    * The software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.native
}

object GatewaySummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    Description: GatewayDescription = null,
    GatewayGroupArn: Arn = null,
    Name: GatewayName = null,
    SoftwareVersion: GatewayVersion = null
  ): GatewaySummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GatewayGroupArn != null) __obj.updateDynamic("GatewayGroupArn")(GatewayGroupArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySummary]
  }
}

