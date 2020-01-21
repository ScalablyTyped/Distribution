package typings.address.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var ip: String
  var ipv6: String
  var mac: String
}

object Address {
  @scala.inline
  def apply(ip: String, ipv6: String, mac: String): Address = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Address]
  }
}

