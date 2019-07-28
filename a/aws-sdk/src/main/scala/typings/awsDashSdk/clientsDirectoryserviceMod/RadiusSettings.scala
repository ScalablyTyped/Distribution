package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusSettings extends js.Object {
  /**
    * The protocol specified for your RADIUS endpoints.
    */
  var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.undefined
  /**
    * Not currently used.
    */
  var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.undefined
  /**
    * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic over this port from the AWS Directory Service servers.
    */
  var RadiusPort: js.UndefOr[PortNumber] = js.undefined
  /**
    * The maximum number of times that communication with the RADIUS server is attempted.
    */
  var RadiusRetries: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.RadiusRetries] = js.undefined
  /**
    * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your RADIUS server load balancer.
    */
  var RadiusServers: js.UndefOr[Servers] = js.undefined
  /**
    * The amount of time, in seconds, to wait for the RADIUS server to respond.
    */
  var RadiusTimeout: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.RadiusTimeout] = js.undefined
  /**
    * Required for enabling RADIUS on the directory.
    */
  var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.undefined
  /**
    * Not currently used.
    */
  var UseSameUsername: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.UseSameUsername] = js.undefined
}

object RadiusSettings {
  @scala.inline
  def apply(
    AuthenticationProtocol: RadiusAuthenticationProtocol = null,
    DisplayLabel: RadiusDisplayLabel = null,
    RadiusPort: js.UndefOr[PortNumber] = js.undefined,
    RadiusRetries: js.UndefOr[RadiusRetries] = js.undefined,
    RadiusServers: Servers = null,
    RadiusTimeout: js.UndefOr[RadiusTimeout] = js.undefined,
    SharedSecret: RadiusSharedSecret = null,
    UseSameUsername: js.UndefOr[UseSameUsername] = js.undefined
  ): RadiusSettings = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationProtocol != null) __obj.updateDynamic("AuthenticationProtocol")(AuthenticationProtocol.asInstanceOf[js.Any])
    if (DisplayLabel != null) __obj.updateDynamic("DisplayLabel")(DisplayLabel)
    if (!js.isUndefined(RadiusPort)) __obj.updateDynamic("RadiusPort")(RadiusPort)
    if (!js.isUndefined(RadiusRetries)) __obj.updateDynamic("RadiusRetries")(RadiusRetries)
    if (RadiusServers != null) __obj.updateDynamic("RadiusServers")(RadiusServers)
    if (!js.isUndefined(RadiusTimeout)) __obj.updateDynamic("RadiusTimeout")(RadiusTimeout)
    if (SharedSecret != null) __obj.updateDynamic("SharedSecret")(SharedSecret)
    if (!js.isUndefined(UseSameUsername)) __obj.updateDynamic("UseSameUsername")(UseSameUsername)
    __obj.asInstanceOf[RadiusSettings]
  }
}

