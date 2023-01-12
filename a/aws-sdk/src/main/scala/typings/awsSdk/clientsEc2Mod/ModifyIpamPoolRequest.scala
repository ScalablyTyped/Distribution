package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyIpamPoolRequest extends StObject {
  
  /**
    * Add tag allocation rules to a pool. For more information about allocation rules, see Create a top-level pool in the Amazon VPC IPAM User Guide.
    */
  var AddAllocationResourceTags: js.UndefOr[RequestIpamResourceTagList] = js.undefined
  
  /**
    * The default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
    */
  var AllocationDefaultNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * The maximum netmask length possible for CIDR allocations in this IPAM pool to be compliant. Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.The maximum netmask length must be greater than the minimum netmask length.
    */
  var AllocationMaxNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * The minimum netmask length required for CIDR allocations in this IPAM pool to be compliant. Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128. The minimum netmask length must be less than the maximum netmask length.
    */
  var AllocationMinNetmaskLength: js.UndefOr[IpamNetmaskLength] = js.undefined
  
  /**
    * If true, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM. The CIDRs that will be allocated for these resources must not already be allocated to other resources in order for the import to succeed. IPAM will import a CIDR regardless of its compliance with the pool's allocation rules, so a resource might be imported and subsequently marked as noncompliant. If IPAM discovers multiple CIDRs that overlap, IPAM will import the largest CIDR only. If IPAM discovers multiple CIDRs with matching CIDRs, IPAM will randomly import one of them only.  A locale must be set on the pool for this feature to work.
    */
  var AutoImport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Clear the default netmask length allocation rule for this pool.
    */
  var ClearAllocationDefaultNetmaskLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The description of the IPAM pool you want to modify.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM pool you want to modify.
    */
  var IpamPoolId: typings.awsSdk.clientsEc2Mod.IpamPoolId
  
  /**
    * Remove tag allocation rules from a pool.
    */
  var RemoveAllocationResourceTags: js.UndefOr[RequestIpamResourceTagList] = js.undefined
}
object ModifyIpamPoolRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): ModifyIpamPoolRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyIpamPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyIpamPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setAddAllocationResourceTags(value: RequestIpamResourceTagList): Self = StObject.set(x, "AddAllocationResourceTags", value.asInstanceOf[js.Any])
    
    inline def setAddAllocationResourceTagsUndefined: Self = StObject.set(x, "AddAllocationResourceTags", js.undefined)
    
    inline def setAddAllocationResourceTagsVarargs(value: RequestIpamResourceTag*): Self = StObject.set(x, "AddAllocationResourceTags", js.Array(value*))
    
    inline def setAllocationDefaultNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationDefaultNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationDefaultNetmaskLengthUndefined: Self = StObject.set(x, "AllocationDefaultNetmaskLength", js.undefined)
    
    inline def setAllocationMaxNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMaxNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMaxNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMaxNetmaskLength", js.undefined)
    
    inline def setAllocationMinNetmaskLength(value: IpamNetmaskLength): Self = StObject.set(x, "AllocationMinNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setAllocationMinNetmaskLengthUndefined: Self = StObject.set(x, "AllocationMinNetmaskLength", js.undefined)
    
    inline def setAutoImport(value: Boolean): Self = StObject.set(x, "AutoImport", value.asInstanceOf[js.Any])
    
    inline def setAutoImportUndefined: Self = StObject.set(x, "AutoImport", js.undefined)
    
    inline def setClearAllocationDefaultNetmaskLength(value: Boolean): Self = StObject.set(x, "ClearAllocationDefaultNetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setClearAllocationDefaultNetmaskLengthUndefined: Self = StObject.set(x, "ClearAllocationDefaultNetmaskLength", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllocationResourceTags(value: RequestIpamResourceTagList): Self = StObject.set(x, "RemoveAllocationResourceTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllocationResourceTagsUndefined: Self = StObject.set(x, "RemoveAllocationResourceTags", js.undefined)
    
    inline def setRemoveAllocationResourceTagsVarargs(value: RequestIpamResourceTag*): Self = StObject.set(x, "RemoveAllocationResourceTags", js.Array(value*))
  }
}
