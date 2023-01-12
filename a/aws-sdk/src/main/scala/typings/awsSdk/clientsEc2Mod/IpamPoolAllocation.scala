package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamPoolAllocation extends StObject {
  
  /**
    * The CIDR for the allocation. A CIDR is a representation of an IP address and its associated network mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is 10.24.34.0/23. An IPv6 CIDR example is 2001:DB8::/32.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the pool allocation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an allocation.
    */
  var IpamPoolAllocationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPoolAllocationId] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the resource.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region of the resource.
    */
  var ResourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[IpamPoolAllocationResourceType] = js.undefined
}
object IpamPoolAllocation {
  
  inline def apply(): IpamPoolAllocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamPoolAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamPoolAllocation] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIpamPoolAllocationId(value: IpamPoolAllocationId): Self = StObject.set(x, "IpamPoolAllocationId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolAllocationIdUndefined: Self = StObject.set(x, "IpamPoolAllocationId", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    inline def setResourceType(value: IpamPoolAllocationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
