package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var LoRaWAN: js.UndefOr[LoRaWANStartFuotaTask] = js.undefined
}
object StartFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId): StartFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFuotaTaskRequest]
  }
  
  extension [Self <: StartFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANStartFuotaTask): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
