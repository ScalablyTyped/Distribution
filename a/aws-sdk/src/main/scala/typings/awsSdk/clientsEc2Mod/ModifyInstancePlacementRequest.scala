package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstancePlacementRequest extends StObject {
  
  /**
    * The affinity setting for the instance.
    */
  var Affinity: js.UndefOr[typings.awsSdk.clientsEc2Mod.Affinity] = js.undefined
  
  /**
    * The Group Id of a placement group. You must specify the Placement Group Group Id to launch an instance in a shared placement group.
    */
  var GroupId: js.UndefOr[PlacementGroupId] = js.undefined
  
  /**
    * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of default. For cluster and partition placement groups, the instance must have a tenancy of default or dedicated. To remove an instance from a placement group, specify an empty string ("").
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
  
  /**
    * The ID of the Dedicated Host with which to associate the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.undefined
  
  /**
    * The ARN of the host resource group in which to place the instance.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance that you are modifying.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * The number of the partition in which to place the instance. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The tenancy for the instance.  For T3 instances, you can't change the tenancy from dedicated to host, or from host to dedicated. Attempting to make one of these unsupported tenancy changes results in the InvalidTenancy error code. 
    */
  var Tenancy: js.UndefOr[HostTenancy] = js.undefined
}
object ModifyInstancePlacementRequest {
  
  inline def apply(InstanceId: InstanceId): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
  
  extension [Self <: ModifyInstancePlacementRequest](x: Self) {
    
    inline def setAffinity(value: Affinity): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    inline def setGroupId(value: PlacementGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setHostId(value: DedicatedHostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    inline def setTenancy(value: HostTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
