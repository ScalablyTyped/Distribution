package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * The attachment ID for the network interface.
    */
  var attachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv6 address for the network interface.
    */
  var ipv6Address: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address for the network interface.
    */
  var privateIpv4Address: js.UndefOr[String] = js.undefined
}
object NetworkInterface {
  
  inline def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  extension [Self <: NetworkInterface](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    inline def setPrivateIpv4Address(value: String): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv4AddressUndefined: Self = StObject.set(x, "privateIpv4Address", js.undefined)
  }
}
