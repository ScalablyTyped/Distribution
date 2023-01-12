package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyProviderSettings extends StObject {
  
  var StaticKeySettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.StaticKeySettings] = js.undefined
}
object KeyProviderSettings {
  
  inline def apply(): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProviderSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyProviderSettings] (val x: Self) extends AnyVal {
    
    inline def setStaticKeySettings(value: StaticKeySettings): Self = StObject.set(x, "StaticKeySettings", value.asInstanceOf[js.Any])
    
    inline def setStaticKeySettingsUndefined: Self = StObject.set(x, "StaticKeySettings", js.undefined)
  }
}
