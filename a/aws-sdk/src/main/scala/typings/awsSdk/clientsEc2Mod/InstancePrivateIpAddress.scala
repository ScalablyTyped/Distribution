package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancePrivateIpAddress extends StObject {
  
  /**
    * The association information for an Elastic IP address for the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined
  
  /**
    * Indicates whether this IPv4 address is the primary private IP address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The private IPv4 DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}
object InstancePrivateIpAddress {
  
  inline def apply(): InstancePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePrivateIpAddress]
  }
  
  extension [Self <: InstancePrivateIpAddress](x: Self) {
    
    inline def setAssociation(value: InstanceNetworkInterfaceAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
