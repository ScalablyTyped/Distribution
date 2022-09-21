package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeRequest extends StObject {
  
  /**
    * The unique ID of the Amplify app associated with the theme.
    */
  var appId: String
  
  /**
    * The unique client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * Represents the configuration of the theme to create.
    */
  var themeToCreate: CreateThemeData
}
object CreateThemeRequest {
  
  inline def apply(appId: String, environmentName: String, themeToCreate: CreateThemeData): CreateThemeRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], themeToCreate = themeToCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThemeRequest]
  }
  
  extension [Self <: CreateThemeRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setThemeToCreate(value: CreateThemeData): Self = StObject.set(x, "themeToCreate", value.asInstanceOf[js.Any])
  }
}
