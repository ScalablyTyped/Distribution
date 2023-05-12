package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfig extends StObject {
  
  /**
    * The name of the position data destination that describes the AWS IoT rule that processes the device's position data for use by AWS IoT Core for LoRaWAN.
    */
  var DestinationName: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DestinationName] = js.undefined
  
  var FPort: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FPort] = js.undefined
  
  /**
    * Application type, which can be specified to obtain real-time position information of your LoRaWAN device.
    */
  var Type: js.UndefOr[ApplicationConfigType] = js.undefined
}
object ApplicationConfig {
  
  inline def apply(): ApplicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationConfig] (val x: Self) extends AnyVal {
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "DestinationName", js.undefined)
    
    inline def setFPort(value: FPort): Self = StObject.set(x, "FPort", value.asInstanceOf[js.Any])
    
    inline def setFPortUndefined: Self = StObject.set(x, "FPort", js.undefined)
    
    inline def setType(value: ApplicationConfigType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
