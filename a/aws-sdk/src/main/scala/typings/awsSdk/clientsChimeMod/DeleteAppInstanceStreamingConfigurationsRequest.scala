package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInstanceStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the streaming configurations being deleted.
    */
  var AppInstanceArn: ChimeArn
}
object DeleteAppInstanceStreamingConfigurationsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): DeleteAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceStreamingConfigurationsRequest]
  }
  
  extension [Self <: DeleteAppInstanceStreamingConfigurationsRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
