package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
}
object GetApplicationPolicyRequest {
  
  inline def apply(ApplicationId: string): GetApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationPolicyRequest]
  }
  
  extension [Self <: GetApplicationPolicyRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
