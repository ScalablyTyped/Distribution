package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSubnetGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the cache subnet group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache subnet group.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of subnets associated with the cache subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * Either ipv4 | ipv6 | dual_stack. IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the Nitro system.
    */
  var SupportedNetworkTypes: js.UndefOr[NetworkTypeList] = js.undefined
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object CacheSubnetGroup {
  
  inline def apply(): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheSubnetGroup] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCacheSubnetGroupDescription(value: String): Self = StObject.set(x, "CacheSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupDescriptionUndefined: Self = StObject.set(x, "CacheSubnetGroupDescription", js.undefined)
    
    inline def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupNameUndefined: Self = StObject.set(x, "CacheSubnetGroupName", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setSupportedNetworkTypes(value: NetworkTypeList): Self = StObject.set(x, "SupportedNetworkTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworkTypesUndefined: Self = StObject.set(x, "SupportedNetworkTypes", js.undefined)
    
    inline def setSupportedNetworkTypesVarargs(value: NetworkType*): Self = StObject.set(x, "SupportedNetworkTypes", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
