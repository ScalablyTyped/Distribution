package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceStreamingConfigurationsResponse extends StObject {
  
  /**
    * The streaming configurations of an app instance.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.undefined
}
object PutAppInstanceStreamingConfigurationsResponse {
  
  inline def apply(): PutAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsResponse]
  }
  
  extension [Self <: PutAppInstanceStreamingConfigurationsResponse](x: Self) {
    
    inline def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceStreamingConfigurationsUndefined: Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.undefined)
    
    inline def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value :_*))
  }
}
