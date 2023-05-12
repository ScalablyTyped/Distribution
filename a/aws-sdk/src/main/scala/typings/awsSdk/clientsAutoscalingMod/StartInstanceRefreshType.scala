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
    * The desired configuration. For example, the desired configuration can specify a new launch template or a new version of the current launch template. Once the instance refresh succeeds, Amazon EC2 Auto Scaling updates the settings of the Auto Scaling group to reflect the new desired configuration.   When you specify a new launch template or a new version of the current launch template for your desired configuration, consider enabling the SkipMatching property in preferences. If it's enabled, Amazon EC2 Auto Scaling skips replacing instances that already use the specified launch template and instance types. This can help you reduce the number of replacements that are required to apply updates.  
    */
  var DesiredConfiguration: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.DesiredConfiguration] = js.undefined
  
  /**
    * Sets your preferences for the instance refresh so that it performs as expected when you start it. Includes the instance warmup time, the minimum healthy percentage, and the behaviors that you want Amazon EC2 Auto Scaling to use if instances that are in Standby state or protected from scale in are found. You can also choose to enable additional features, such as the following:   Auto rollback   Checkpoints   Skip matching  
    */
  var Preferences: js.UndefOr[RefreshPreferences] = js.undefined
  
  /**
    * The strategy to use for the instance refresh. The only valid value is Rolling.
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
