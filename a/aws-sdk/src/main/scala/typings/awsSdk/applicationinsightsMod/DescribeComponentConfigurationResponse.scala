package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComponentConfigurationResponse extends StObject {
  
  /**
    * The configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
  
  /**
    * Indicates whether the application component is monitored.
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.native
  
  /**
    * The tier of the application component. Supported tiers include DOT_NET_CORE, DOT_NET_WORKER, DOT_NET_WEB, SQL_SERVER, and DEFAULT 
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.native
}
object DescribeComponentConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeComponentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeComponentConfigurationResponseMutableBuilder[Self <: DescribeComponentConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentConfiguration(value: ComponentConfiguration): Self = StObject.set(x, "ComponentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentConfigurationUndefined: Self = StObject.set(x, "ComponentConfiguration", js.undefined)
    
    @scala.inline
    def setMonitor(value: Monitor): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    @scala.inline
    def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
