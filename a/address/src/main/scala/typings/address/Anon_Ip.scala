package typings.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ip extends js.Object {
  var ip: String
  var ipv6: String
  var mac: String
}

object Anon_Ip {
  @scala.inline
  def apply(ip: String, ipv6: String, mac: String): Anon_Ip = {
    val __obj = js.Dynamic.literal(ip = ip, ipv6 = ipv6, mac = mac)
  
    __obj.asInstanceOf[Anon_Ip]
  }
}

