package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplatePlacementRequest extends StObject {
  
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.undefined
  
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The Group Id of a placement group. You must specify the Placement Group Group Id to launch an instance in a shared placement group.
    */
  var GroupId: js.UndefOr[PlacementGroupId] = js.undefined
  
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.undefined
  
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The tenancy of the instance. An instance with a tenancy of dedicated runs on single-tenant hardware.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.clientsEc2Mod.Tenancy] = js.undefined
}
object LaunchTemplatePlacementRequest {
  
  inline def apply(): LaunchTemplatePlacementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplatePlacementRequest] (val x: Self) extends AnyVal {
    
    inline def setAffinity(value: String): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setGroupId(value: PlacementGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setHostId(value: DedicatedHostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    inline def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    inline def setSpreadDomain(value: String): Self = StObject.set(x, "SpreadDomain", value.asInstanceOf[js.Any])
    
    inline def setSpreadDomainUndefined: Self = StObject.set(x, "SpreadDomain", js.undefined)
    
    inline def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
