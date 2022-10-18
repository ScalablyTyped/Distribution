package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSettingsResponse extends StObject {
  
  /**
    *  The current list of settings. 
    */
  var settings: js.UndefOr[Settings] = js.undefined
}
object UpdateSettingsResponse {
  
  inline def apply(): UpdateSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSettingsResponse]
  }
  
  extension [Self <: UpdateSettingsResponse](x: Self) {
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
