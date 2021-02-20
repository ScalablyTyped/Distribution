package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceStreamingConfigurationsResponse extends StObject {
  
  /**
    * The streaming configurations of an app instance.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.native
}
object PutAppInstanceStreamingConfigurationsResponse {
  
  @scala.inline
  def apply(): PutAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class PutAppInstanceStreamingConfigurationsResponseMutableBuilder[Self <: PutAppInstanceStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceStreamingConfigurationsUndefined: Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.undefined)
    
    @scala.inline
    def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value :_*))
  }
}
