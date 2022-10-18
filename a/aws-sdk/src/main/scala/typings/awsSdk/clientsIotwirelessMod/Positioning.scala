package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positioning extends StObject {
  
  var ClockSync: js.UndefOr[FPort] = js.undefined
  
  var Gnss: js.UndefOr[FPort] = js.undefined
  
  var Stream: js.UndefOr[FPort] = js.undefined
}
object Positioning {
  
  inline def apply(): Positioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Positioning]
  }
  
  extension [Self <: Positioning](x: Self) {
    
    inline def setClockSync(value: FPort): Self = StObject.set(x, "ClockSync", value.asInstanceOf[js.Any])
    
    inline def setClockSyncUndefined: Self = StObject.set(x, "ClockSync", js.undefined)
    
    inline def setGnss(value: FPort): Self = StObject.set(x, "Gnss", value.asInstanceOf[js.Any])
    
    inline def setGnssUndefined: Self = StObject.set(x, "Gnss", js.undefined)
    
    inline def setStream(value: FPort): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "Stream", js.undefined)
  }
}
