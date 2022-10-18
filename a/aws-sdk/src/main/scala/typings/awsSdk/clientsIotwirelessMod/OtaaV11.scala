package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtaaV11 extends StObject {
  
  /**
    * The AppKey value.
    */
  var AppKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AppKey] = js.undefined
  
  /**
    * The JoinEUI value.
    */
  var JoinEui: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.JoinEui] = js.undefined
  
  /**
    * The NwkKey value.
    */
  var NwkKey: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NwkKey] = js.undefined
}
object OtaaV11 {
  
  inline def apply(): OtaaV11 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtaaV11]
  }
  
  extension [Self <: OtaaV11](x: Self) {
    
    inline def setAppKey(value: AppKey): Self = StObject.set(x, "AppKey", value.asInstanceOf[js.Any])
    
    inline def setAppKeyUndefined: Self = StObject.set(x, "AppKey", js.undefined)
    
    inline def setJoinEui(value: JoinEui): Self = StObject.set(x, "JoinEui", value.asInstanceOf[js.Any])
    
    inline def setJoinEuiUndefined: Self = StObject.set(x, "JoinEui", js.undefined)
    
    inline def setNwkKey(value: NwkKey): Self = StObject.set(x, "NwkKey", value.asInstanceOf[js.Any])
    
    inline def setNwkKeyUndefined: Self = StObject.set(x, "NwkKey", js.undefined)
  }
}
