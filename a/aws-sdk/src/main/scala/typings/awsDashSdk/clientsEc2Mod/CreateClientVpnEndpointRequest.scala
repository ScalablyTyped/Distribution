package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientVpnEndpointRequest extends js.Object {
  /**
    * Information about the authentication method to be used to authenticate clients.
    */
  var AuthenticationOptions: ClientVpnAuthenticationRequestList = js.native
  /**
    * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
    */
  var ClientCidrBlock: String = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: typings.awsDashSdk.clientsEc2Mod.ConnectionLogOptions = js.native
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the server certificate. For more information, see the AWS Certificate Manager User Guide.
    */
  var ServerCertificateArn: String = js.native
  /**
    * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. By default, split-tunnel on a VPN endpoint is disabled. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.native
  /**
    * The tags to apply to the Client VPN endpoint during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The transport protocol to be used by the VPN session. Default value: udp 
    */
  var TransportProtocol: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransportProtocol] = js.native
}

object CreateClientVpnEndpointRequest {
  @scala.inline
  def apply(
    AuthenticationOptions: ClientVpnAuthenticationRequestList,
    ClientCidrBlock: String,
    ConnectionLogOptions: ConnectionLogOptions,
    ServerCertificateArn: String,
    ClientToken: String = null,
    Description: String = null,
    DnsServers: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    SplitTunnel: js.UndefOr[scala.Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null,
    TransportProtocol: TransportProtocol = null
  ): CreateClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(AuthenticationOptions = AuthenticationOptions.asInstanceOf[js.Any], ClientCidrBlock = ClientCidrBlock.asInstanceOf[js.Any], ConnectionLogOptions = ConnectionLogOptions.asInstanceOf[js.Any], ServerCertificateArn = ServerCertificateArn.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DnsServers != null) __obj.updateDynamic("DnsServers")(DnsServers.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(SplitTunnel)) __obj.updateDynamic("SplitTunnel")(SplitTunnel.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (TransportProtocol != null) __obj.updateDynamic("TransportProtocol")(TransportProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientVpnEndpointRequest]
  }
}

