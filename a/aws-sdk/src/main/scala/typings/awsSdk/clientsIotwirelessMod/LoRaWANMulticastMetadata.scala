package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANMulticastMetadata extends StObject {
  
  var FPort: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FPort] = js.undefined
}
object LoRaWANMulticastMetadata {
  
  inline def apply(): LoRaWANMulticastMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANMulticastMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANMulticastMetadata] (val x: Self) extends AnyVal {
    
    inline def setFPort(value: FPort): Self = StObject.set(x, "FPort", value.asInstanceOf[js.Any])
    
    inline def setFPortUndefined: Self = StObject.set(x, "FPort", js.undefined)
  }
}
