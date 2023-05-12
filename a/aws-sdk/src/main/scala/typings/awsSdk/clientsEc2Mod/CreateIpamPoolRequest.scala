package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamPoolRequest extends StObject {
  
  /**
    * The IP protocol assigned to this IPAM pool. You must choose either IPv4 or IPv6 protocol for a pool.
    */
  var AddressFamily: typings.awsSdk.clientsEc2Mod.AddressFamily
  
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
  var AllocationResourceTags: js.UndefOr[RequestIpamResourceTagList] = js.undefined
  
  /**
    * If selected, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.  A locale must be set on the pool for this feature to work.
    */
  var AutoImport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limits which service in Amazon Web Services that the pool can be used in. "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
    */
  var AwsService: js.UndefOr[IpamPoolAwsService] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the IPAM pool.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the scope in which you would like to create the IPAM pool.
    */
  var IpamScopeId: typings.awsSdk.clientsEc2Mod.IpamScopeId
  
  /**
    * In IPAM, the locale is the Amazon Web Services Region where you want to make an IPAM pool available for allocations. Only resources in the same Region as the locale of the pool can get IP address allocations from the pool. You can only allocate a CIDR for a VPC, for example, from an IPAM pool that shares a locale with the VPC’s Region. Note that once you choose a Locale for a pool, you cannot modify it. If you do not choose a locale, resources in Regions others than the IPAM's home region cannot use CIDRs from this pool. Possible values: Any Amazon Web Services Region, such as us-east-1.
    */
  var Locale: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Default is byoip. For more information, see Create IPv6 pools in the Amazon VPC IPAM User Guide. By default, you can add only one Amazon-provided IPv6 CIDR block to a top-level IPv6 pool if PublicIpSource is amazon. For information on increasing the default limit, see  Quotas for your IPAM in the Amazon VPC IPAM User Guide.
    */
  var PublicIpSource: js.UndefOr[IpamPoolPublicIpSource] = js.undefined
  
  /**
    * Determines if the pool is publicly advertisable. This option is not available for pools with AddressFamily set to ipv4.
    */
  var PubliclyAdvertisable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the source IPAM pool. Use this option to create a pool within an existing pool. Note that the CIDR you provision for the pool within the source pool must be available in the source pool's CIDR range.
    */
  var SourceIpamPoolId: js.UndefOr[IpamPoolId] = js.undefined
  
  /**
    * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateIpamPoolRequest {
  
  inline def apply(AddressFamily: AddressFamily, IpamScopeId: IpamScopeId): CreateIpamPoolRequest = {
    val __obj = js.Dynamic.literal(AddressFamily = AddressFamily.asInstanceOf[js.Any], IpamScopeId = IpamScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpamPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIpamPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setAddressFamily(value: AddressFamily): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    inline def setAllocationDefaultNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationDefaultNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationDefaultNetmaskLengthUndefined: Self = StObject.set(x, "AllocationDefaultNetmaskLength", js.undefined)
    
    inline def setAllocationMaxNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMaxNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMaxNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMaxNetmaskLength", js.undefined)
    
    inline def setAllocationMinNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMinNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMinNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMinNetmaskLength", js.undefined)
    
    inline def setAllocationResourceTags(value: RequestIpamResourceTagList): Self = StObject.set(x, "AllocationResourceTags", value.asInstanceOf[js.Any])
    
    inline def setAllocationResourceTagsUndefined: Self = StObject.set(x, "AllocationResourceTags", js.undefined)
    
    inline def setAllocationResourceTagsVarargs(value: RequestIpamResourceTag*): Self = StObject.set(x, "AllocationResourceTags", js.Array(value*))
    
    inline def setAutoImport(value: Boolean): Self = StObject.set(x, "AutoImport", value.asInstanceOf[js.Any])
    
    inline def setAutoImportUndefined: Self = StObject.set(x, "AutoImport", js.undefined)
    
    inline def setAwsService(value: IpamPoolAwsService): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setPublicIpSource(value: IpamPoolPublicIpSource): Self = StObject.set(x, "PublicIpSource", value.asInstanceOf[js.Any])
    
    inline def setPublicIpSourceUndefined: Self = StObject.set(x, "PublicIpSource", js.undefined)
    
    inline def setPubliclyAdvertisable(value: Boolean): Self = StObject.set(x, "PubliclyAdvertisable", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAdvertisableUndefined: Self = StObject.set(x, "PubliclyAdvertisable", js.undefined)
    
    inline def setSourceIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "SourceIpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setSourceIpamPoolIdUndefined: Self = StObject.set(x, "SourceIpamPoolId", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
