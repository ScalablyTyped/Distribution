package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The streaming configurations set for an app instance.
    */
  var AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList
}
object PutAppInstanceStreamingConfigurationsRequest {
  
  inline def apply(
    AppInstanceArn: ChimeArn,
    AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList
  ): PutAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceStreamingConfigurations = AppInstanceStreamingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsRequest]
  }
  
  extension [Self <: PutAppInstanceStreamingConfigurationsRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = StObject.set(x, "AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = StObject.set(x, "AppInstanceStreamingConfigurations", js.Array(value :_*))
  }
}
