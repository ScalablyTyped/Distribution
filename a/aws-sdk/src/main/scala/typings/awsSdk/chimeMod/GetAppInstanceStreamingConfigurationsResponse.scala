package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceStreamingConfigurationsResponse extends StObject {
  
  /**
    * The streaming settings.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.undefined
}
object GetAppInstanceStreamingConfigurationsResponse {
  
  inline def apply(): GetAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsResponse]
  }
  
  extension [Self <: GetAppInstanceStreamingConfigurationsResponse](x: Self) {
    
    inline def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceStreamingConfigurationsUndefined: Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.undefined)
    
    inline def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value*))
  }
}
