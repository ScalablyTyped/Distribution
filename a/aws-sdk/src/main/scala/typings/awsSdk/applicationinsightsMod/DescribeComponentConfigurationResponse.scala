package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComponentConfigurationResponse extends StObject {
  
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.undefined
  
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.undefined
  
  /**
    * The tier of the application component. Supported tiers include DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT 
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.undefined
}
object DescribeComponentConfigurationResponse {
  
  inline def apply(): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
  
  extension [Self <: DescribeComponentConfigurationResponse](x: Self) {
    
    inline def setComponentConfiguration(value: ComponentConfiguration): Self = StObject.set(x, "ComponentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigurationUndefined: Self = StObject.set(x, "ComponentConfiguration", js.undefined)
    
    inline def setMonitor(value: Monitor): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
