package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshPreferences extends StObject {
  
  /**
    * The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if you specify a value for it, you must also specify a value for CheckpointPercentages. If you specify a value for CheckpointPercentages and not for CheckpointDelay, the CheckpointDelay defaults to 3600 (1 hour). 
    */
  var CheckpointDelay: js.UndefOr[typings.awsSdk.autoscalingMod.CheckpointDelay] = js.undefined
  
  /**
    * Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in the Auto Scaling group, the last number in the array must be 100. For usage examples, see Adding checkpoints to an instance refresh in the Amazon EC2 Auto Scaling User Guide.
    */
  var CheckpointPercentages: js.UndefOr[typings.awsSdk.autoscalingMod.CheckpointPercentages] = js.undefined
  
  /**
    *  Not needed if the default instance warmup is defined for the group.  The duration of the instance warmup, in seconds.  The default is to use the value for the default instance warmup defined for the group. If default instance warmup is null, then InstanceWarmup falls back to the value of the health check grace period. 
    */
  var InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.undefined
  
  /**
    * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up to the nearest integer). The default is 90. Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time. In contrast, setting it to 0 percent has the effect of replacing all instances at the same time. 
    */
  var MinHealthyPercentage: js.UndefOr[IntPercent] = js.undefined
  
  /**
    * A boolean value that indicates whether skip matching is enabled. If true, then Amazon EC2 Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified, then it skips replacing instances that have the same configuration that is already set on the group. The default is false.
    */
  var SkipMatching: js.UndefOr[typings.awsSdk.autoscalingMod.SkipMatching] = js.undefined
}
object RefreshPreferences {
  
  inline def apply(): RefreshPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshPreferences]
  }
  
  extension [Self <: RefreshPreferences](x: Self) {
    
    inline def setCheckpointDelay(value: CheckpointDelay): Self = StObject.set(x, "CheckpointDelay", value.asInstanceOf[js.Any])
    
    inline def setCheckpointDelayUndefined: Self = StObject.set(x, "CheckpointDelay", js.undefined)
    
    inline def setCheckpointPercentages(value: CheckpointPercentages): Self = StObject.set(x, "CheckpointPercentages", value.asInstanceOf[js.Any])
    
    inline def setCheckpointPercentagesUndefined: Self = StObject.set(x, "CheckpointPercentages", js.undefined)
    
    inline def setCheckpointPercentagesVarargs(value: NonZeroIntPercent*): Self = StObject.set(x, "CheckpointPercentages", js.Array(value*))
    
    inline def setInstanceWarmup(value: RefreshInstanceWarmup): Self = StObject.set(x, "InstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setInstanceWarmupUndefined: Self = StObject.set(x, "InstanceWarmup", js.undefined)
    
    inline def setMinHealthyPercentage(value: IntPercent): Self = StObject.set(x, "MinHealthyPercentage", value.asInstanceOf[js.Any])
    
    inline def setMinHealthyPercentageUndefined: Self = StObject.set(x, "MinHealthyPercentage", js.undefined)
    
    inline def setSkipMatching(value: SkipMatching): Self = StObject.set(x, "SkipMatching", value.asInstanceOf[js.Any])
    
    inline def setSkipMatchingUndefined: Self = StObject.set(x, "SkipMatching", js.undefined)
  }
}
