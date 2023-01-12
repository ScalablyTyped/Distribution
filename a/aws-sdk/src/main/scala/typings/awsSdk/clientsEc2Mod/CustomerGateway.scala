package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerGateway extends StObject {
  
  /**
    * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  var BgpAsn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of customer gateway device.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of the customer gateway device's outside interface.
    */
  var IpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the customer gateway (pending | available | deleting | deleted).
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the customer gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of VPN connection the customer gateway supports (ipsec.1).
    */
  var Type: js.UndefOr[String] = js.undefined
}
object CustomerGateway {
  
  inline def apply(): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerGateway] (val x: Self) extends AnyVal {
    
    inline def setBgpAsn(value: String): Self = StObject.set(x, "BgpAsn", value.asInstanceOf[js.Any])
    
    inline def setBgpAsnUndefined: Self = StObject.set(x, "BgpAsn", js.undefined)
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCustomerGatewayId(value: String): Self = StObject.set(x, "CustomerGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayIdUndefined: Self = StObject.set(x, "CustomerGatewayId", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
