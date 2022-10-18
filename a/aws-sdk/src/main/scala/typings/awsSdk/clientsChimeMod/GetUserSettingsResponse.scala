package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserSettingsResponse extends StObject {
  
  /**
    * The user settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.clientsChimeMod.UserSettings] = js.undefined
}
object GetUserSettingsResponse {
  
  inline def apply(): GetUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserSettingsResponse]
  }
  
  extension [Self <: GetUserSettingsResponse](x: Self) {
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
