package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceStreamingConfigurationsResponse extends StObject {
  
  /**
    * The streaming configurations of an AppInstance.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.undefined
}
object PutAppInstanceStreamingConfigurationsResponse {
  
  inline def apply(): PutAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAppInstanceStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceStreamingConfigurationsUndefined: Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.undefined)
    
    inline def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value*))
  }
}
