package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThemeRequest extends StObject {
  
  /**
    * The unique ID of the Amplify app.
    */
  var appId: String
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The unique ID for the theme.
    */
  var id: Uuid
}
object GetThemeRequest {
  
  inline def apply(appId: String, environmentName: String, id: Uuid): GetThemeRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThemeRequest]
  }
  
  extension [Self <: GetThemeRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
