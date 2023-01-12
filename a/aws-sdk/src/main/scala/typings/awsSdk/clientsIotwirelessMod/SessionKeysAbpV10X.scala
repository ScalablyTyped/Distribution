package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionKeysAbpV10X extends StObject {
  
  /**
    * The AppSKey value.
    */
  var AppSKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AppSKey] = js.undefined
  
  /**
    * The NwkSKey value.
    */
  var NwkSKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NwkSKey] = js.undefined
}
object SessionKeysAbpV10X {
  
  inline def apply(): SessionKeysAbpV10X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionKeysAbpV10X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionKeysAbpV10X] (val x: Self) extends AnyVal {
    
    inline def setAppSKey(value: AppSKey): Self = StObject.set(x, "AppSKey", value.asInstanceOf[js.Any])
    
    inline def setAppSKeyUndefined: Self = StObject.set(x, "AppSKey", js.undefined)
    
    inline def setNwkSKey(value: NwkSKey): Self = StObject.set(x, "NwkSKey", value.asInstanceOf[js.Any])
    
    inline def setNwkSKeyUndefined: Self = StObject.set(x, "NwkSKey", js.undefined)
  }
}
