package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppLaunchConfigurationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}
object DeleteAppLaunchConfigurationRequest {
  
  inline def apply(): DeleteAppLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAppLaunchConfigurationRequest]
  }
  
  extension [Self <: DeleteAppLaunchConfigurationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
