package typings
package addressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ip extends js.Object {
  var ip: java.lang.String
  var ipv6: java.lang.String
  var mac: java.lang.String
}

object Anon_Ip {
  @scala.inline
  def apply(ip: java.lang.String, ipv6: java.lang.String, mac: java.lang.String): Anon_Ip = {
    val __obj = js.Dynamic.literal(ip = ip, ipv6 = ipv6, mac = mac)
  
    __obj.asInstanceOf[Anon_Ip]
  }
}

