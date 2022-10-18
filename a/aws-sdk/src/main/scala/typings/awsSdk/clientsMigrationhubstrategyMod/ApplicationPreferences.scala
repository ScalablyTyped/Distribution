package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationPreferences extends StObject {
  
  /**
    *  Application preferences that you specify to prefer managed environment. 
    */
  var managementPreference: js.UndefOr[ManagementPreference] = js.undefined
}
object ApplicationPreferences {
  
  inline def apply(): ApplicationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPreferences]
  }
  
  extension [Self <: ApplicationPreferences](x: Self) {
    
    inline def setManagementPreference(value: ManagementPreference): Self = StObject.set(x, "managementPreference", value.asInstanceOf[js.Any])
    
    inline def setManagementPreferenceUndefined: Self = StObject.set(x, "managementPreference", js.undefined)
  }
}
