package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANListDevice extends StObject {
  
  /**
    * The DevEUI value.
    */
  var DevEui: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DevEui] = js.undefined
}
object LoRaWANListDevice {
  
  inline def apply(): LoRaWANListDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANListDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANListDevice] (val x: Self) extends AnyVal {
    
    inline def setDevEui(value: DevEui): Self = StObject.set(x, "DevEui", value.asInstanceOf[js.Any])
    
    inline def setDevEuiUndefined: Self = StObject.set(x, "DevEui", js.undefined)
  }
}
