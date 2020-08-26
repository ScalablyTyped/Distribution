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
  @scala.inline
  implicit class DnsServiceDiscoveryOps[Self <: DnsServiceDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostname(value: Hostname): Self = this.set("hostname", value.asInstanceOf[js.Any])
  }
  
}

