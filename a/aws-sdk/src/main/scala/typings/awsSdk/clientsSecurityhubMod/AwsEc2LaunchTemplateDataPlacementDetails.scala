package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataPlacementDetails extends StObject {
  
  /**
    *  The affinity setting for an instance on an EC2 Dedicated Host. 
    */
  var Affinity: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Availability Zone for the instance. 
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the placement group for the instance. 
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ID of the Dedicated Host for the instance. 
    */
  var HostId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the host resource group in which to launch the instances. 
    */
  var HostResourceGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The number of the partition the instance should launch in. 
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Reserved for future use. 
    */
  var SpreadDomain: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. 
    */
  var Tenancy: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataPlacementDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataPlacementDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataPlacementDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataPlacementDetails] (val x: Self) extends AnyVal {
    
    inline def setAffinity(value: NonEmptyString): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setHostId(value: NonEmptyString): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setHostResourceGroupArn(value: NonEmptyString): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    inline def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    inline def setSpreadDomain(value: NonEmptyString): Self = StObject.set(x, "SpreadDomain", value.asInstanceOf[js.Any])
    
    inline def setSpreadDomainUndefined: Self = StObject.set(x, "SpreadDomain", js.undefined)
    
    inline def setTenancy(value: NonEmptyString): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
