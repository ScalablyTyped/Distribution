package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIpAddressTypeRequest extends StObject {
  
  /**
    * The IP address type to set for the specified resource. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6.
    */
  var ipAddressType: IpAddressType
  
  /**
    * The name of the resource for which to set the IP address type.
    */
  var resourceName: ResourceName
  
  /**
    * The resource type. The possible values are Distribution, Instance, and LoadBalancer.  Distribution-related APIs are available only in the N. Virginia (us-east-1) Amazon Web Services Region. Set your Amazon Web Services Region configuration to us-east-1 to create, view, or edit distributions. 
    */
  var resourceType: ResourceType
}
object SetIpAddressTypeRequest {
  
  inline def apply(ipAddressType: IpAddressType, resourceName: ResourceName, resourceType: ResourceType): SetIpAddressTypeRequest = {
    val __obj = js.Dynamic.literal(ipAddressType = ipAddressType.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIpAddressTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetIpAddressTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
