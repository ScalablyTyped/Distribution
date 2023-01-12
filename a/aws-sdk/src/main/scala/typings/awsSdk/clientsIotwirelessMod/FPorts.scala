package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPorts extends StObject {
  
  var ClockSync: js.UndefOr[FPort] = js.undefined
  
  var Fuota: js.UndefOr[FPort] = js.undefined
  
  var Multicast: js.UndefOr[FPort] = js.undefined
  
  /**
    * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
    */
  var Positioning: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Positioning] = js.undefined
}
object FPorts {
  
  inline def apply(): FPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FPorts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FPorts] (val x: Self) extends AnyVal {
    
    inline def setClockSync(value: FPort): Self = StObject.set(x, "ClockSync", value.asInstanceOf[js.Any])
    
    inline def setClockSyncUndefined: Self = StObject.set(x, "ClockSync", js.undefined)
    
    inline def setFuota(value: FPort): Self = StObject.set(x, "Fuota", value.asInstanceOf[js.Any])
    
    inline def setFuotaUndefined: Self = StObject.set(x, "Fuota", js.undefined)
    
    inline def setMulticast(value: FPort): Self = StObject.set(x, "Multicast", value.asInstanceOf[js.Any])
    
    inline def setMulticastUndefined: Self = StObject.set(x, "Multicast", js.undefined)
    
    inline def setPositioning(value: Positioning): Self = StObject.set(x, "Positioning", value.asInstanceOf[js.Any])
    
    inline def setPositioningUndefined: Self = StObject.set(x, "Positioning", js.undefined)
  }
}
