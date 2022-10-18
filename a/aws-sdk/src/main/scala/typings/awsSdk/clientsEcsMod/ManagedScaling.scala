package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedScaling extends StObject {
  
  /**
    * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to CloudWatch metrics for Auto Scaling group. If this parameter is omitted, the default value of 300 seconds is used.
    */
  var instanceWarmupPeriod: js.UndefOr[ManagedScalingInstanceWarmupPeriod] = js.undefined
  
  /**
    * The maximum number of Amazon EC2 instances that Amazon ECS will scale out at one time. The scale in process is not affected by this parameter. If this parameter is omitted, the default value of 10000 is used.
    */
  var maximumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.undefined
  
  /**
    * The minimum number of Amazon EC2 instances that Amazon ECS will scale out at one time. The scale in process is not affected by this parameter If this parameter is omitted, the default value of 1 is used. When additional capacity is required, Amazon ECS will scale up the minimum scaling step size even if the actual demand is less than the minimum scaling step size. If you use a capacity provider with an Auto Scaling group configured with more than one Amazon EC2 instance type or Availability Zone, Amazon ECS will scale up by the exact minimum scaling step size value and will ignore both the maximum scaling step size as well as the capacity demand.
    */
  var minimumScalingStepSize: js.UndefOr[ManagedScalingStepSize] = js.undefined
  
  /**
    * Determines whether to use managed scaling for the capacity provider.
    */
  var status: js.UndefOr[ManagedScalingStatus] = js.undefined
  
  /**
    * The target capacity value for the capacity provider. The specified value must be greater than 0 and less than or equal to 100. A value of 100 results in the Amazon EC2 instances in your Auto Scaling group being completely used.
    */
  var targetCapacity: js.UndefOr[ManagedScalingTargetCapacity] = js.undefined
}
object ManagedScaling {
  
  inline def apply(): ManagedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedScaling]
  }
  
  extension [Self <: ManagedScaling](x: Self) {
    
    inline def setInstanceWarmupPeriod(value: ManagedScalingInstanceWarmupPeriod): Self = StObject.set(x, "instanceWarmupPeriod", value.asInstanceOf[js.Any])
    
    inline def setInstanceWarmupPeriodUndefined: Self = StObject.set(x, "instanceWarmupPeriod", js.undefined)
    
    inline def setMaximumScalingStepSize(value: ManagedScalingStepSize): Self = StObject.set(x, "maximumScalingStepSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumScalingStepSizeUndefined: Self = StObject.set(x, "maximumScalingStepSize", js.undefined)
    
    inline def setMinimumScalingStepSize(value: ManagedScalingStepSize): Self = StObject.set(x, "minimumScalingStepSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumScalingStepSizeUndefined: Self = StObject.set(x, "minimumScalingStepSize", js.undefined)
    
    inline def setStatus(value: ManagedScalingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetCapacity(value: ManagedScalingTargetCapacity): Self = StObject.set(x, "targetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUndefined: Self = StObject.set(x, "targetCapacity", js.undefined)
  }
}
