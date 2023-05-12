package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverEndpointRequest extends StObject {
  
  /**
    * The name of the Resolver endpoint that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the Resolver endpoint that you want to update.
    */
  var ResolverEndpointId: ResourceId
  
  /**
    *  Specifies the endpoint type for what type of IP address the endpoint uses to forward DNS queries. 
    */
  var ResolverEndpointType: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverEndpointType] = js.undefined
  
  /**
    *  Updates the Resolver endpoint type to IpV4, Ipv6, or dual-stack. 
    */
  var UpdateIpAddresses: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.UpdateIpAddresses] = js.undefined
}
object UpdateResolverEndpointRequest {
  
  inline def apply(ResolverEndpointId: ResourceId): UpdateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointType(value: ResolverEndpointType): Self = StObject.set(x, "ResolverEndpointType", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointTypeUndefined: Self = StObject.set(x, "ResolverEndpointType", js.undefined)
    
    inline def setUpdateIpAddresses(value: UpdateIpAddresses): Self = StObject.set(x, "UpdateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setUpdateIpAddressesUndefined: Self = StObject.set(x, "UpdateIpAddresses", js.undefined)
    
    inline def setUpdateIpAddressesVarargs(value: UpdateIpAddress*): Self = StObject.set(x, "UpdateIpAddresses", js.Array(value*))
  }
}
