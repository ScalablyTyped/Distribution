package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANUpdateGatewayTaskEntry extends StObject {
  
  /**
    * The version of the gateways that should receive the update.
    */
  var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
  
  /**
    * The firmware version to update the gateway to.
    */
  var UpdateVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
}
object LoRaWANUpdateGatewayTaskEntry {
  
  inline def apply(): LoRaWANUpdateGatewayTaskEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANUpdateGatewayTaskEntry]
  }
  
  extension [Self <: LoRaWANUpdateGatewayTaskEntry](x: Self) {
    
    inline def setCurrentVersion(value: LoRaWANGatewayVersion): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setUpdateVersion(value: LoRaWANGatewayVersion): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
