package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRefreshType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * Set of preferences associated with the instance refresh request. If not provided, the default values are used. For MinHealthyPercentage, the default value is 90. For InstanceWarmup, the default is to use the value specified for the health check grace period for the Auto Scaling group. For more information, see RefreshPreferences in the Amazon EC2 Auto Scaling API Reference.
    */
  var Preferences: js.UndefOr[RefreshPreferences] = js.undefined
  
  /**
    * The strategy to use for the instance refresh. The only valid value is Rolling. A rolling update is an update that is applied to all instances in an Auto Scaling group until all instances have been updated. A rolling update can fail due to failed health checks or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances that were already replaced are not rolled back to their previous configuration. 
    */
  var Strategy: js.UndefOr[RefreshStrategy] = js.undefined
}
object StartInstanceRefreshType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): StartInstanceRefreshType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRefreshType]
  }
  
  extension [Self <: StartInstanceRefreshType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setPreferences(value: RefreshPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
    
    inline def setStrategy(value: RefreshStrategy): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
  }
}
