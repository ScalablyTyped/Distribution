package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamDiscoveredResourceCidr extends StObject {
  
  /**
    * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100. Note the following:   For resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet CIDRs.    For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4 address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be calculated.    For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been allocated to Elastic IP addresses (EIPs).   
    */
  var IpUsage: js.UndefOr[BoxedDouble] = js.undefined
  
  /**
    * The resource discovery ID.
    */
  var IpamResourceDiscoveryId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId] = js.undefined
  
  /**
    * The resource CIDR.
    */
  var ResourceCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource owner ID.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource Region.
    */
  var ResourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The resource tags.
    */
  var ResourceTags: js.UndefOr[IpamResourceTagList] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[IpamResourceType] = js.undefined
  
  /**
    * The last successful resource discovery time.
    */
  var SampleTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The VPC ID.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object IpamDiscoveredResourceCidr {
  
  inline def apply(): IpamDiscoveredResourceCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamDiscoveredResourceCidr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamDiscoveredResourceCidr] (val x: Self) extends AnyVal {
    
    inline def setIpUsage(value: BoxedDouble): Self = StObject.set(x, "IpUsage", value.asInstanceOf[js.Any])
    
    inline def setIpUsageUndefined: Self = StObject.set(x, "IpUsage", js.undefined)
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryIdUndefined: Self = StObject.set(x, "IpamResourceDiscoveryId", js.undefined)
    
    inline def setResourceCidr(value: String): Self = StObject.set(x, "ResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setResourceCidrUndefined: Self = StObject.set(x, "ResourceCidr", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    inline def setResourceTags(value: IpamResourceTagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: IpamResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: IpamResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSampleTime(value: js.Date): Self = StObject.set(x, "SampleTime", value.asInstanceOf[js.Any])
    
    inline def setSampleTimeUndefined: Self = StObject.set(x, "SampleTime", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
