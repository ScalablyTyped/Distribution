package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppValidationConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation
}
object DeleteAppValidationConfigurationRequest {
  
  inline def apply(appId: AppIdWithValidation): DeleteAppValidationConfigurationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppValidationConfigurationRequest]
  }
  
  extension [Self <: DeleteAppValidationConfigurationRequest](x: Self) {
    
    inline def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
