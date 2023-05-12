package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingTargetTrackingScalingPolicyConfigurationUpdate extends StObject {
  
  /**
    * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. The cooldown period is used to block subsequent scale in requests until it has expired. You should scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, application auto scaling scales out your scalable target immediately. 
    */
  var ScaleInCooldown: js.UndefOr[IntegerObject] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You should continuously (but not excessively) scale out.
    */
  var ScaleOutCooldown: js.UndefOr[IntegerObject] = js.undefined
  
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: DoubleObject
}
object AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
  
  inline def apply(TargetValue: DoubleObject): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] (val x: Self) extends AnyVal {
    
    inline def setDisableScaleIn(value: BooleanObject): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    inline def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    inline def setScaleInCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleInCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleInCooldownUndefined: Self = StObject.set(x, "ScaleInCooldown", js.undefined)
    
    inline def setScaleOutCooldown(value: IntegerObject): Self = StObject.set(x, "ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    inline def setScaleOutCooldownUndefined: Self = StObject.set(x, "ScaleOutCooldown", js.undefined)
    
    inline def setTargetValue(value: DoubleObject): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
