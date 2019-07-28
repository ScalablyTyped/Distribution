package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * GuardDuty Finding activity type.
    */
  var ActionType: js.UndefOr[String] = js.undefined
  /**
    * Information about the AWS_API_CALL action described in this finding.
    */
  var AwsApiCallAction: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.AwsApiCallAction] = js.undefined
  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  var DnsRequestAction: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.DnsRequestAction] = js.undefined
  /**
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  var NetworkConnectionAction: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.NetworkConnectionAction] = js.undefined
  /**
    * Information about the PORT_PROBE action described in this finding.
    */
  var PortProbeAction: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.PortProbeAction] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    ActionType: String = null,
    AwsApiCallAction: AwsApiCallAction = null,
    DnsRequestAction: DnsRequestAction = null,
    NetworkConnectionAction: NetworkConnectionAction = null,
    PortProbeAction: PortProbeAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType)
    if (AwsApiCallAction != null) __obj.updateDynamic("AwsApiCallAction")(AwsApiCallAction)
    if (DnsRequestAction != null) __obj.updateDynamic("DnsRequestAction")(DnsRequestAction)
    if (NetworkConnectionAction != null) __obj.updateDynamic("NetworkConnectionAction")(NetworkConnectionAction)
    if (PortProbeAction != null) __obj.updateDynamic("PortProbeAction")(PortProbeAction)
    __obj.asInstanceOf[Action]
  }
}

