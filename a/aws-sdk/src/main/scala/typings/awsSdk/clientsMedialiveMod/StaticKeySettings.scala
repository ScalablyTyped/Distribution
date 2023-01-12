package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticKeySettings extends StObject {
  
  /**
    * The URL of the license server used for protecting content.
    */
  var KeyProviderServer: js.UndefOr[InputLocation] = js.undefined
  
  /**
    * Static key value as a 32 character hexadecimal string.
    */
  var StaticKeyValue: stringMin32Max32
}
object StaticKeySettings {
  
  inline def apply(StaticKeyValue: stringMin32Max32): StaticKeySettings = {
    val __obj = js.Dynamic.literal(StaticKeyValue = StaticKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticKeySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticKeySettings] (val x: Self) extends AnyVal {
    
    inline def setKeyProviderServer(value: InputLocation): Self = StObject.set(x, "KeyProviderServer", value.asInstanceOf[js.Any])
    
    inline def setKeyProviderServerUndefined: Self = StObject.set(x, "KeyProviderServer", js.undefined)
    
    inline def setStaticKeyValue(value: stringMin32Max32): Self = StObject.set(x, "StaticKeyValue", value.asInstanceOf[js.Any])
  }
}
