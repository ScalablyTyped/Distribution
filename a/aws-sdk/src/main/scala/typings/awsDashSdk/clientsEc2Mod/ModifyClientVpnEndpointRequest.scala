package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClientVpnEndpointRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint to modify.
    */
  var ClientVpnEndpointId: typings.awsDashSdk.clientsEc2Mod.ClientVpnEndpointId = js.native
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ConnectionLogOptions] = js.native
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two DNS servers.
    */
  var DnsServers: js.UndefOr[DnsServersOptionsModifyStructure] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate Manager (ACM).
    */
  var ServerCertificateArn: js.UndefOr[String] = js.native
  /**
    * Indicates whether the VPN is split-tunnel. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
}

object ModifyClientVpnEndpointRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    ConnectionLogOptions: ConnectionLogOptions = null,
    Description: String = null,
    DnsServers: DnsServersOptionsModifyStructure = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ServerCertificateArn: String = null,
    SplitTunnel: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    if (ConnectionLogOptions != null) __obj.updateDynamic("ConnectionLogOptions")(ConnectionLogOptions.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DnsServers != null) __obj.updateDynamic("DnsServers")(DnsServers.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (ServerCertificateArn != null) __obj.updateDynamic("ServerCertificateArn")(ServerCertificateArn.asInstanceOf[js.Any])
    if (!js.isUndefined(SplitTunnel)) __obj.updateDynamic("SplitTunnel")(SplitTunnel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientVpnEndpointRequest]
  }
}

