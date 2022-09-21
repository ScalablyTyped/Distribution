package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAPIAuthType extends StObject {
  
  /**
    * Describes the authentication mode.
    */
  var Mode: js.UndefOr[typings.awsSdk.amplifybackendMod.Mode] = js.undefined
  
  /**
    * Describes settings for the authentication mode.
    */
  var Settings: js.UndefOr[BackendAPIAppSyncAuthSettings] = js.undefined
}
object BackendAPIAuthType {
  
  inline def apply(): BackendAPIAuthType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAPIAuthType]
  }
  
  extension [Self <: BackendAPIAuthType](x: Self) {
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setSettings(value: BackendAPIAppSyncAuthSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
