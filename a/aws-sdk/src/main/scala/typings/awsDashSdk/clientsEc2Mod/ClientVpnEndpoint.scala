package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnEndpoint extends js.Object {
  /**
    * Information about the associated target networks. A target network is a subnet in a VPC.
    */
  var AssociatedTargetNetworks: js.UndefOr[AssociatedTargetNetworkSet] = js.undefined
  /**
    * Information about the authentication method used by the Client VPN endpoint.
    */
  var AuthenticationOptions: js.UndefOr[ClientVpnAuthenticationList] = js.undefined
  /**
    * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
    */
  var ClientCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  /**
    * Information about the client connection logging options for the Client VPN endpoint.
    */
  var ConnectionLogOptions: js.UndefOr[ConnectionLogResponseOptions] = js.undefined
  /**
    * The date and time the Client VPN endpoint was created.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  /**
    * The date and time the Client VPN endpoint was deleted, if applicable.
    */
  var DeletionTime: js.UndefOr[String] = js.undefined
  /**
    * A brief description of the endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The DNS name to be used by clients when connecting to the Client VPN endpoint.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  /**
    * Information about the DNS servers to be used for DNS resolution. 
    */
  var DnsServers: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ARN of the server certificate.
    */
  var ServerCertificateArn: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether split-tunnel is enabled in the AWS Client VPN endpoint endpoint. For information about split-tunnel VPN endpoints, see Split-Tunnel AWS Client VPN Endpoint in the AWS Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.undefined
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.undefined
  /**
    * Any tags assigned to the Client VPN endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The transport protocol used by the Client VPN endpoint.
    */
  var TransportProtocol: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransportProtocol] = js.undefined
  /**
    * The protocol used by the VPN session.
    */
  var VpnProtocol: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnProtocol] = js.undefined
}

object ClientVpnEndpoint {
  @scala.inline
  def apply(
    AssociatedTargetNetworks: AssociatedTargetNetworkSet = null,
    AuthenticationOptions: ClientVpnAuthenticationList = null,
    ClientCidrBlock: String = null,
    ClientVpnEndpointId: String = null,
    ConnectionLogOptions: ConnectionLogResponseOptions = null,
    CreationTime: String = null,
    DeletionTime: String = null,
    Description: String = null,
    DnsName: String = null,
    DnsServers: ValueStringList = null,
    ServerCertificateArn: String = null,
    SplitTunnel: js.UndefOr[Boolean] = js.undefined,
    Status: ClientVpnEndpointStatus = null,
    Tags: TagList = null,
    TransportProtocol: TransportProtocol = null,
    VpnProtocol: VpnProtocol = null
  ): ClientVpnEndpoint = {
    val __obj = js.Dynamic.literal()
    if (AssociatedTargetNetworks != null) __obj.updateDynamic("AssociatedTargetNetworks")(AssociatedTargetNetworks)
    if (AuthenticationOptions != null) __obj.updateDynamic("AuthenticationOptions")(AuthenticationOptions)
    if (ClientCidrBlock != null) __obj.updateDynamic("ClientCidrBlock")(ClientCidrBlock)
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId)
    if (ConnectionLogOptions != null) __obj.updateDynamic("ConnectionLogOptions")(ConnectionLogOptions)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName)
    if (DnsServers != null) __obj.updateDynamic("DnsServers")(DnsServers)
    if (ServerCertificateArn != null) __obj.updateDynamic("ServerCertificateArn")(ServerCertificateArn)
    if (!js.isUndefined(SplitTunnel)) __obj.updateDynamic("SplitTunnel")(SplitTunnel)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransportProtocol != null) __obj.updateDynamic("TransportProtocol")(TransportProtocol.asInstanceOf[js.Any])
    if (VpnProtocol != null) __obj.updateDynamic("VpnProtocol")(VpnProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnEndpoint]
  }
}

