package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeSummary extends StObject {
  
  /**
    * The unique ID for the app associated with the theme summary.
    */
  var appId: String
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The ID of the theme.
    */
  var id: Uuid
  
  /**
    * The name of the theme.
    */
  var name: ThemeName
}
object ThemeSummary {
  
  inline def apply(appId: String, environmentName: String, id: Uuid, name: ThemeName): ThemeSummary = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeSummary]
  }
  
  extension [Self <: ThemeSummary](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
