package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentConfigurationRequest extends StObject {
  
  /**
    *  Automatically configures the component by applying the recommended configurations. 
    */
  var AutoConfigEnabled: js.UndefOr[typings.awsSdk.applicationinsightsMod.AutoConfigEnabled] = js.undefined
  
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration. For more information about the JSON format, see Working with JSON. You can send a request to DescribeComponentConfigurationRecommendation to see the recommended configuration for a component. For the complete format of the component configuration file, see Component Configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.undefined
  
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName
  
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
  
  /**
    * The tier of the application component.
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.undefined
}
object UpdateComponentConfigurationRequest {
  
  inline def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentConfigurationRequest]
  }
  
  extension [Self <: UpdateComponentConfigurationRequest](x: Self) {
    
    inline def setAutoConfigEnabled(value: AutoConfigEnabled): Self = StObject.set(x, "AutoConfigEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoConfigEnabledUndefined: Self = StObject.set(x, "AutoConfigEnabled", js.undefined)
    
    inline def setComponentConfiguration(value: ComponentConfiguration): Self = StObject.set(x, "ComponentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigurationUndefined: Self = StObject.set(x, "ComponentConfiguration", js.undefined)
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setMonitor(value: Monitor): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
