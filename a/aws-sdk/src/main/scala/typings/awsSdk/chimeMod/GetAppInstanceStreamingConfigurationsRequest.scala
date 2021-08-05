package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the app instance. 
    */
  var AppInstanceArn: ChimeArn
}
object GetAppInstanceStreamingConfigurationsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): GetAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsRequest]
  }
  
  extension [Self <: GetAppInstanceStreamingConfigurationsRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
