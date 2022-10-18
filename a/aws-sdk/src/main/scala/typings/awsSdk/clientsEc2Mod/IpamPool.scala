package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamPool extends StObject {
  
  /**
    * The address family of the pool.
    */
  var AddressFamily: js.UndefOr[typings.awsSdk.clientsEc2Mod.AddressFamily] = js.undefined
  
  /**
    * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
    */
  var AllocationDefaultNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. The maximum netmask length must be greater than the minimum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
    */
  var AllocationMaxNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. The minimum netmask length must be less than the maximum netmask length. Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
    */
  var AllocationMinNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
    */
  var AllocationResourceTags: js.UndefOr[IpamResourceTagList] = js.undefined
  
  /**
    * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.  A locale must be set on the pool for this feature to work.
    */
  var AutoImport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
    */
  var AwsService: js.UndefOr[IpamPoolAwsService] = js.undefined
  
  /**
    * The description of the IPAM pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IPAM.
    */
  var IpamArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the IPAM pool.
    */
  var IpamPoolArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the IPAM pool.
    */
  var IpamPoolId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPoolId] = js.undefined
  
  /**
    * The Amazon Web Services Region of the IPAM pool.
    */
  var IpamRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the scope of the IPAM pool.
    */
  var IpamScopeArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * In IPAM, a scope is the highest-level container within IPAM. An IPAM contains two default scopes. Each scope represents the IP space for a single network. The private scope is intended for all private IP address space. The public scope is intended for all public IP address space. Scopes enable you to reuse IP addresses across multiple unconnected networks without causing IP address overlap or conflict.
    */
  var IpamScopeType: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamScopeType] = js.undefined
  
  /**
    * The locale of the IPAM pool. In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you choose an Amazon Web Services Region for locale that has not been configured as an operating Region for the IPAM, you'll get an error.
    */
  var Locale: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the IPAM pool.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The depth of pools in your IPAM pool. The pool depth quota is 10. For more information, see Quotas in IPAM in the Amazon VPC IPAM User Guide. 
    */
  var PoolDepth: js.UndefOr[Integer] = js.undefined
  
  /**
    * Determines if a pool is publicly advertisable. This option is not available for pools with AddressFamily set to ipv4.
    */
  var PubliclyAdvertisable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the source IPAM pool. You can use this option to create an IPAM pool within an existing source pool.
    */
  var SourceIpamPoolId: js.UndefOr[IpamPoolId] = js.undefined
  
  /**
    * The state of the IPAM pool.
    */
  var State: js.UndefOr[IpamPoolState] = js.undefined
  
  /**
    * A message related to the failed creation of an IPAM pool.
    */
  var StateMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object IpamPool {
  
  inline def apply(): IpamPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamPool]
  }
  
  extension [Self <: IpamPool](x: Self) {
    
    inline def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    inline def setAddressFamilyUndefined: Self = StObject.set(x, "AddressFamily", js.undefined)
    
    inline def setAllocationDefaultNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationDefaultNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationDefaultNetmaskLengthUndefined: Self = StObject.set(x, "AllocationDefaultNetmaskLength", js.undefined)
    
    inline def setAllocationMaxNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMaxNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMaxNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMaxNetmaskLength", js.undefined)
    
    inline def setAllocationMinNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMinNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMinNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMinNetmaskLength", js.undefined)
    
    inline def setAllocationResourceTags(value: IpamResourceTagList): Self = StObject.set(x, "AllocationResourceTags", value.asInstanceOf[js.Any])
    
    inline def setAllocationResourceTagsUndefined: Self = StObject.set(x, "AllocationResourceTags", js.undefined)
    
    inline def setAllocationResourceTagsVarargs(value: IpamResourceTag*): Self = StObject.set(x, "AllocationResourceTags", js.Array(value*))
    
    inline def setAutoImport(value: Boolean): Self = StObject.set(x, "AutoImport", value.asInstanceOf[js.Any])
    
    inline def setAutoImportUndefined: Self = StObject.set(x, "AutoImport", js.undefined)
    
    inline def setAwsService(value: IpamPoolAwsService): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIpamArn(value: ResourceArn): Self = StObject.set(x, "IpamArn", value.asInstanceOf[js.Any])
    
    inline def setIpamArnUndefined: Self = StObject.set(x, "IpamArn", js.undefined)
    
    inline def setIpamPoolArn(value: ResourceArn): Self = StObject.set(x, "IpamPoolArn", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolArnUndefined: Self = StObject.set(x, "IpamPoolArn", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolIdUndefined: Self = StObject.set(x, "IpamPoolId", js.undefined)
    
    inline def setIpamRegion(value: String): Self = StObject.set(x, "IpamRegion", value.asInstanceOf[js.Any])
    
    inline def setIpamRegionUndefined: Self = StObject.set(x, "IpamRegion", js.undefined)
    
    inline def setIpamScopeArn(value: ResourceArn): Self = StObject.set(x, "IpamScopeArn", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeArnUndefined: Self = StObject.set(x, "IpamScopeArn", js.undefined)
    
    inline def setIpamScopeType(value: IpamScopeType): Self = StObject.set(x, "IpamScopeType", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeTypeUndefined: Self = StObject.set(x, "IpamScopeType", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPoolDepth(value: Integer): Self = StObject.set(x, "PoolDepth", value.asInstanceOf[js.Any])
    
    inline def setPoolDepthUndefined: Self = StObject.set(x, "PoolDepth", js.undefined)
    
    inline def setPubliclyAdvertisable(value: Boolean): Self = StObject.set(x, "PubliclyAdvertisable", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAdvertisableUndefined: Self = StObject.set(x, "PubliclyAdvertisable", js.undefined)
    
    inline def setSourceIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "SourceIpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setSourceIpamPoolIdUndefined: Self = StObject.set(x, "SourceIpamPoolId", js.undefined)
    
    inline def setState(value: IpamPoolState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
