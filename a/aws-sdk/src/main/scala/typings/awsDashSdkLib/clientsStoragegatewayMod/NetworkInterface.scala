package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * The Internet Protocol version 4 (IPv4) address of the interface.
    */
  var Ipv4Address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Internet Protocol version 6 (IPv6) address of the interface. Currently not supported.
    */
  var Ipv6Address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Media Access Control (MAC) address of the interface.  This is currently unsupported and will not be returned in output. 
    */
  var MacAddress: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(
    Ipv4Address: java.lang.String = null,
    Ipv6Address: java.lang.String = null,
    MacAddress: java.lang.String = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (Ipv4Address != null) __obj.updateDynamic("Ipv4Address")(Ipv4Address)
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address)
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress)
    __obj.asInstanceOf[NetworkInterface]
  }
}

