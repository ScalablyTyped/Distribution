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
  
  extension [Self <: LoRaWANListDevice](x: Self) {
    
    inline def setDevEui(value: DevEui): Self = StObject.set(x, "DevEui", value.asInstanceOf[js.Any])
    
    inline def setDevEuiUndefined: Self = StObject.set(x, "DevEui", js.undefined)
  }
}
