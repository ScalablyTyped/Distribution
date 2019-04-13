package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostEntry extends js.Object {
  /**
    * The hostname to use in the /etc/hosts entry.
    */
  var hostname: String
  /**
    * The IP address to use in the /etc/hosts entry.
    */
  var ipAddress: String
}

object HostEntry {
  @scala.inline
  def apply(hostname: String, ipAddress: String): HostEntry = {
    val __obj = js.Dynamic.literal(hostname = hostname, ipAddress = ipAddress)
  
    __obj.asInstanceOf[HostEntry]
  }
}

