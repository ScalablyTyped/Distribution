package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails extends StObject {
  
  /**
    * How to allocate instance types to fulfill On-Demand capacity. The valid value is prioritized.
    */
  var OnDemandAllocationStrategy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances.
    */
  var OnDemandBaseCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The percentage of On-Demand Instances and Spot Instances for additional capacity beyond OnDemandBaseCapacity.
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * How to allocate instances across Spot Instance pools. Valid values are as follows:    lowest-price     capacity-optimized     capacity-optimized-prioritized   
    */
  var SpotAllocationStrategy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances.
    */
  var SpotInstancePools: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var SpotMaxPrice: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails] (val x: Self) extends AnyVal {
    
    inline def setOnDemandAllocationStrategy(value: NonEmptyString): Self = StObject.set(x, "OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "OnDemandAllocationStrategy", js.undefined)
    
    inline def setOnDemandBaseCapacity(value: Integer): Self = StObject.set(x, "OnDemandBaseCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandBaseCapacityUndefined: Self = StObject.set(x, "OnDemandBaseCapacity", js.undefined)
    
    inline def setOnDemandPercentageAboveBaseCapacity(value: Integer): Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandPercentageAboveBaseCapacityUndefined: Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", js.undefined)
    
    inline def setSpotAllocationStrategy(value: NonEmptyString): Self = StObject.set(x, "SpotAllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setSpotAllocationStrategyUndefined: Self = StObject.set(x, "SpotAllocationStrategy", js.undefined)
    
    inline def setSpotInstancePools(value: Integer): Self = StObject.set(x, "SpotInstancePools", value.asInstanceOf[js.Any])
    
    inline def setSpotInstancePoolsUndefined: Self = StObject.set(x, "SpotInstancePools", js.undefined)
    
    inline def setSpotMaxPrice(value: NonEmptyString): Self = StObject.set(x, "SpotMaxPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxPriceUndefined: Self = StObject.set(x, "SpotMaxPrice", js.undefined)
  }
}
