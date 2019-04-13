package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnConnection extends js.Object {
  /**
    * The IP address of the client.
    */
  var ClientIp: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The common name associated with the client. This is either the name of the client certificate, or the Active Directory user name.
    */
  var CommonName: js.UndefOr[String] = js.undefined
  /**
    * The date and time the client connection was terminated.
    */
  var ConnectionEndTime: js.UndefOr[String] = js.undefined
  /**
    * The date and time the client connection was established.
    */
  var ConnectionEstablishedTime: js.UndefOr[String] = js.undefined
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes received by the client.
    */
  var EgressBytes: js.UndefOr[String] = js.undefined
  /**
    * The number of packets received by the client.
    */
  var EgressPackets: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes sent by the client.
    */
  var IngressBytes: js.UndefOr[String] = js.undefined
  /**
    * The number of packets sent by the client.
    */
  var IngressPackets: js.UndefOr[String] = js.undefined
  /**
    * The current state of the client connection.
    */
  var Status: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
  /**
    * The current date and time.
    */
  var Timestamp: js.UndefOr[String] = js.undefined
  /**
    * The username of the client who established the client connection. This information is only provided if Active Directory client authentication is used.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object ClientVpnConnection {
  @scala.inline
  def apply(
    ClientIp: String = null,
    ClientVpnEndpointId: String = null,
    CommonName: String = null,
    ConnectionEndTime: String = null,
    ConnectionEstablishedTime: String = null,
    ConnectionId: String = null,
    EgressBytes: String = null,
    EgressPackets: String = null,
    IngressBytes: String = null,
    IngressPackets: String = null,
    Status: ClientVpnConnectionStatus = null,
    Timestamp: String = null,
    Username: String = null
  ): ClientVpnConnection = {
    val __obj = js.Dynamic.literal()
    if (ClientIp != null) __obj.updateDynamic("ClientIp")(ClientIp)
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId)
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName)
    if (ConnectionEndTime != null) __obj.updateDynamic("ConnectionEndTime")(ConnectionEndTime)
    if (ConnectionEstablishedTime != null) __obj.updateDynamic("ConnectionEstablishedTime")(ConnectionEstablishedTime)
    if (ConnectionId != null) __obj.updateDynamic("ConnectionId")(ConnectionId)
    if (EgressBytes != null) __obj.updateDynamic("EgressBytes")(EgressBytes)
    if (EgressPackets != null) __obj.updateDynamic("EgressPackets")(EgressPackets)
    if (IngressBytes != null) __obj.updateDynamic("IngressBytes")(IngressBytes)
    if (IngressPackets != null) __obj.updateDynamic("IngressPackets")(IngressPackets)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[ClientVpnConnection]
  }
}

