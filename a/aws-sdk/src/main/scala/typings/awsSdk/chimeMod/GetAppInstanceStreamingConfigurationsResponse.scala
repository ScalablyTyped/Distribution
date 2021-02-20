package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppInstanceStreamingConfigurationsResponse extends StObject {
  
  /**
    * The streaming settings.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.native
}
object GetAppInstanceStreamingConfigurationsResponse {
  
  @scala.inline
  def apply(): GetAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class GetAppInstanceStreamingConfigurationsResponseMutableBuilder[Self <: GetAppInstanceStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceStreamingConfigurationsUndefined: Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.undefined)
    
    @scala.inline
    def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value :_*))
  }
}
