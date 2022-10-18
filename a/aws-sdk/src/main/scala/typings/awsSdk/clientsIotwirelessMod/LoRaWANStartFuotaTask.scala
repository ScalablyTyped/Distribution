package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANStartFuotaTask extends StObject {
  
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object LoRaWANStartFuotaTask {
  
  inline def apply(): LoRaWANStartFuotaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANStartFuotaTask]
  }
  
  extension [Self <: LoRaWANStartFuotaTask](x: Self) {
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
