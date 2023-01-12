package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeRequest extends StObject {
  
  /**
    * The unique ID for the Amplify app.
    */
  var appId: String
  
  /**
    * The unique client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The unique ID for the theme.
    */
  var id: Uuid
  
  /**
    * The configuration of the updated theme.
    */
  var updatedTheme: UpdateThemeData
}
object UpdateThemeRequest {
  
  inline def apply(appId: String, environmentName: String, id: Uuid, updatedTheme: UpdateThemeData): UpdateThemeRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedTheme = updatedTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThemeRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTheme(value: UpdateThemeData): Self = StObject.set(x, "updatedTheme", value.asInstanceOf[js.Any])
  }
}
