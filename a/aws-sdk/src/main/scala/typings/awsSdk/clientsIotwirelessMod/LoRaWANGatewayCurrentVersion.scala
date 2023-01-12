package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANGatewayCurrentVersion extends StObject {
  
  /**
    * The version of the gateways that should receive the update.
    */
  var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
}
object LoRaWANGatewayCurrentVersion {
  
  inline def apply(): LoRaWANGatewayCurrentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANGatewayCurrentVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANGatewayCurrentVersion] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: LoRaWANGatewayVersion): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
  }
}
