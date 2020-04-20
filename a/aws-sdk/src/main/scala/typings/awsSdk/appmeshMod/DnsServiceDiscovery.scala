package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsServiceDiscovery extends js.Object {
  /**
    * Specifies the DNS service discovery hostname for the virtual node. 
    */
  var hostname: Hostname = js.native
}

object DnsServiceDiscovery {
  @scala.inline
  def apply(hostname: Hostname): DnsServiceDiscovery = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsServiceDiscovery]
  }
}

