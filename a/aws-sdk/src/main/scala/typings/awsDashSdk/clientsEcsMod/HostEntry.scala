package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostEntry extends js.Object {
  /**
    * The hostname to use in the /etc/hosts entry.
    */
  var hostname: String = js.native
  /**
    * The IP address to use in the /etc/hosts entry.
    */
  var ipAddress: String = js.native
}

object HostEntry {
  @scala.inline
  def apply(hostname: String, ipAddress: String): HostEntry = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostEntry]
  }
}

