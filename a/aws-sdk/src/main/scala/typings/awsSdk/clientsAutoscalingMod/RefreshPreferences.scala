package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshPreferences extends StObject {
  
  /**
    * (Optional) Indicates whether to roll back the Auto Scaling group to its previous configuration if the instance refresh fails. The default is false. A rollback is not supported in the following situations:    There is no desired configuration specified for the instance refresh.   The Auto Scaling group has a launch template that uses an Amazon Web Services Systems Manager parameter instead of an AMI ID for the ImageId property.   The Auto Scaling group uses the launch template's $Latest or $Default version.  
    */
  var AutoRollback: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AutoRollback] = js.undefined
  
  /**
    * (Optional) The amount of time, in seconds, to wait after a checkpoint before continuing. This property is optional, but if you specify a value for it, you must also specify a value for CheckpointPercentages. If you specify a value for CheckpointPercentages and not for CheckpointDelay, the CheckpointDelay defaults to 3600 (1 hour). 
    */
  var CheckpointDelay: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.CheckpointDelay] = js.undefined
  
  /**
    * (Optional) Threshold values for each checkpoint in ascending order. Each number must be unique. To replace all instances in the Auto Scaling group, the last number in the array must be 100. For usage examples, see Adding checkpoints to an instance refresh in the Amazon EC2 Auto Scaling User Guide.
    */
  var CheckpointPercentages: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.CheckpointPercentages] = js.undefined
  
  /**
    * A time period, in seconds, during which an instance refresh waits before moving on to replacing the next instance after a new instance enters the InService state. This property is not required for normal usage. Instead, use the DefaultInstanceWarmup property of the Auto Scaling group. The InstanceWarmup and DefaultInstanceWarmup properties work the same way. Only specify this property if you must override the DefaultInstanceWarmup property.   If you do not specify this property, the instance warmup by default is the value of the DefaultInstanceWarmup property, if defined (which is recommended in all cases), or the HealthCheckGracePeriod property otherwise.
    */
  var InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.undefined
  
  /**
    * The amount of capacity in the Auto Scaling group that must pass your group's health checks to allow the operation to continue. The value is expressed as a percentage of the desired capacity of the Auto Scaling group (rounded up to the nearest integer). The default is 90. Setting the minimum healthy percentage to 100 percent limits the rate of replacement to one instance at a time. In contrast, setting it to 0 percent has the effect of replacing all instances at the same time. 
    */
  var MinHealthyPercentage: js.UndefOr[IntPercent] = js.undefined
  
  /**
    * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances protected from scale in are found.  The following lists the valid values:  Refresh  Amazon EC2 Auto Scaling replaces instances that are protected from scale in.  Ignore  Amazon EC2 Auto Scaling ignores instances that are protected from scale in and continues to replace instances that are not protected.  Wait (default)  Amazon EC2 Auto Scaling waits one hour for you to remove scale-in protection. Otherwise, the instance refresh will fail.  
    */
  var ScaleInProtectedInstances: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.ScaleInProtectedInstances] = js.undefined
  
  /**
    * (Optional) Indicates whether skip matching is enabled. If enabled (true), then Amazon EC2 Auto Scaling skips replacing instances that match the desired configuration. If no desired configuration is specified, then it skips replacing instances that have the same launch template and instance types that the Auto Scaling group was using before the start of the instance refresh. The default is false. For more information, see Use an instance refresh with skip matching in the Amazon EC2 Auto Scaling User Guide.
    */
  var SkipMatching: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SkipMatching] = js.undefined
  
  /**
    * Choose the behavior that you want Amazon EC2 Auto Scaling to use if instances in Standby state are found. The following lists the valid values:  Terminate  Amazon EC2 Auto Scaling terminates instances that are in Standby.  Ignore  Amazon EC2 Auto Scaling ignores instances that are in Standby and continues to replace instances that are in the InService state.  Wait (default)  Amazon EC2 Auto Scaling waits one hour for you to return the instances to service. Otherwise, the instance refresh will fail.  
    */
  var StandbyInstances: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.StandbyInstances] = js.undefined
}
object RefreshPreferences {
  
  inline def apply(): RefreshPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshPreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshPreferences] (val x: Self) extends AnyVal {
    
    inline def setAutoRollback(value: AutoRollback): Self = StObject.set(x, "AutoRollback", value.asInstanceOf[js.Any])
    
    inline def setAutoRollbackUndefined: Self = StObject.set(x, "AutoRollback", js.undefined)
    
    inline def setCheckpointDelay(value: CheckpointDelay): Self = StObject.set(x, "CheckpointDelay", value.asInstanceOf[js.Any])
    
    inline def setCheckpointDelayUndefined: Self = StObject.set(x, "CheckpointDelay", js.undefined)
    
    inline def setCheckpointPercentages(value: CheckpointPercentages): Self = StObject.set(x, "CheckpointPercentages", value.asInstanceOf[js.Any])
    
    inline def setCheckpointPercentagesUndefined: Self = StObject.set(x, "CheckpointPercentages", js.undefined)
    
    inline def setCheckpointPercentagesVarargs(value: NonZeroIntPercent*): Self = StObject.set(x, "CheckpointPercentages", js.Array(value*))
    
    inline def setInstanceWarmup(value: RefreshInstanceWarmup): Self = StObject.set(x, "InstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setInstanceWarmupUndefined: Self = StObject.set(x, "InstanceWarmup", js.undefined)
    
    inline def setMinHealthyPercentage(value: IntPercent): Self = StObject.set(x, "MinHealthyPercentage", value.asInstanceOf[js.Any])
    
    inline def setMinHealthyPercentageUndefined: Self = StObject.set(x, "MinHealthyPercentage", js.undefined)
    
    inline def setScaleInProtectedInstances(value: ScaleInProtectedInstances): Self = StObject.set(x, "ScaleInProtectedInstances", value.asInstanceOf[js.Any])
    
    inline def setScaleInProtectedInstancesUndefined: Self = StObject.set(x, "ScaleInProtectedInstances", js.undefined)
    
    inline def setSkipMatching(value: SkipMatching): Self = StObject.set(x, "SkipMatching", value.asInstanceOf[js.Any])
    
    inline def setSkipMatchingUndefined: Self = StObject.set(x, "SkipMatching", js.undefined)
    
    inline def setStandbyInstances(value: StandbyInstances): Self = StObject.set(x, "StandbyInstances", value.asInstanceOf[js.Any])
    
    inline def setStandbyInstancesUndefined: Self = StObject.set(x, "StandbyInstances", js.undefined)
  }
}
