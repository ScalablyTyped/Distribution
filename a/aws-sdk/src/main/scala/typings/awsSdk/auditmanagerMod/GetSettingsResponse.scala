package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSettingsResponse extends StObject {
  
  /**
    *  The settings object that holds all supported Audit Manager settings. 
    */
  var settings: js.UndefOr[Settings] = js.undefined
}
object GetSettingsResponse {
  
  inline def apply(): GetSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSettingsResponse]
  }
  
  extension [Self <: GetSettingsResponse](x: Self) {
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
