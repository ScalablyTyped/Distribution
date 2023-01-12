package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRefreshType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The desired configuration. For example, the desired configuration can specify a new launch template or a new version of the current launch template. Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to reflect the new desired configuration.   When you specify a new launch template or a new version of the current launch template for your desired configuration, consider enabling the SkipMatching property in preferences. If it's enabled, Amazon EC2 Auto Scaling skips replacing instances that already use the specified launch template and version. This can help you reduce the number of replacements that are required to apply updates.  
    */
  var DesiredConfiguration: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.DesiredConfiguration] = js.undefined
  
  /**
    * Set of preferences associated with the instance refresh request. If not provided, the default values are used.
    */
  var Preferences: js.UndefOr[RefreshPreferences] = js.undefined
  
  /**
    * The strategy to use for the instance refresh. The only valid value is Rolling. A rolling update helps you update your instances gradually. A rolling update can fail due to failed health checks or if instances are on standby or are protected from scale in. If the rolling update process fails, any instances that are replaced are not rolled back to their previous configuration. 
    */
  var Strategy: js.UndefOr[RefreshStrategy] = js.undefined
}
object StartInstanceRefreshType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): StartInstanceRefreshType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRefreshType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartInstanceRefreshType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setDesiredConfiguration(value: DesiredConfiguration): Self = StObject.set(x, "DesiredConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDesiredConfigurationUndefined: Self = StObject.set(x, "DesiredConfiguration", js.undefined)
    
    inline def setPreferences(value: RefreshPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
    
    inline def setStrategy(value: RefreshStrategy): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
  }
}
