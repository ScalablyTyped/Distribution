package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set for which you want to update the custom tracking domain.
    */
  var ConfigurationSetName: typings.awsSdk.clientsSesMod.ConfigurationSetName
  
  var TrackingOptions: typings.awsSdk.clientsSesMod.TrackingOptions
}
object UpdateConfigurationSetTrackingOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, TrackingOptions: TrackingOptions): UpdateConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], TrackingOptions = TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetTrackingOptionsRequest]
  }
  
  extension [Self <: UpdateConfigurationSetTrackingOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
  }
}
