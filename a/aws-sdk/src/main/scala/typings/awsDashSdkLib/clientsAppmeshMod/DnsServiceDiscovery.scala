package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsServiceDiscovery extends js.Object {
  /**
    * Specifies the DNS service discovery hostname for the virtual node. 
    */
  var hostname: Hostname
}

object DnsServiceDiscovery {
  @scala.inline
  def apply(hostname: Hostname): DnsServiceDiscovery = {
    val __obj = js.Dynamic.literal(hostname = hostname)
  
    __obj.asInstanceOf[DnsServiceDiscovery]
  }
}

