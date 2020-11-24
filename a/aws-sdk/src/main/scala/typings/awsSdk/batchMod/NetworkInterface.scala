package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends js.Object {
  
  /**
    * The attachment ID for the network interface.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * The private IPv6 address for the network interface.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  
  /**
    * The private IPv4 address for the network interface.
    */
  var privateIpv4Address: js.UndefOr[String] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
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
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setIpv6Address(value: String): Self = this.set("ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Address: Self = this.set("ipv6Address", js.undefined)
    
    @scala.inline
    def setPrivateIpv4Address(value: String): Self = this.set("privateIpv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpv4Address: Self = this.set("privateIpv4Address", js.undefined)
  }
}
