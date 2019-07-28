package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancePortInfo extends js.Object {
  /**
    * The access direction (inbound or outbound).
    */
  var accessDirection: js.UndefOr[AccessDirection] = js.undefined
  /**
    * The location from which access is allowed (e.g., Anywhere (0.0.0.0/0)).
    */
  var accessFrom: js.UndefOr[String] = js.undefined
  /**
    * The type of access (Public or Private).
    */
  var accessType: js.UndefOr[PortAccessType] = js.undefined
  /**
    * The common name.
    */
  var commonName: js.UndefOr[String] = js.undefined
  /**
    * The first port in the range.
    */
  var fromPort: js.UndefOr[Port] = js.undefined
  /**
    * The protocol being used. Can be one of the following.    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.undefined
  /**
    * The last port in the range.
    */
  var toPort: js.UndefOr[Port] = js.undefined
}

object InstancePortInfo {
  @scala.inline
  def apply(
    accessDirection: AccessDirection = null,
    accessFrom: String = null,
    accessType: PortAccessType = null,
    commonName: String = null,
    fromPort: js.UndefOr[Port] = js.undefined,
    protocol: NetworkProtocol = null,
    toPort: js.UndefOr[Port] = js.undefined
  ): InstancePortInfo = {
    val __obj = js.Dynamic.literal()
    if (accessDirection != null) __obj.updateDynamic("accessDirection")(accessDirection.asInstanceOf[js.Any])
    if (accessFrom != null) __obj.updateDynamic("accessFrom")(accessFrom)
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort)
    __obj.asInstanceOf[InstancePortInfo]
  }
}

