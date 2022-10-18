package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCapacityReservationResult extends StObject {
  
  /**
    * Information about the Capacity Reservation.
    */
  var CapacityReservation: js.UndefOr[typings.awsSdk.clientsEc2Mod.CapacityReservation] = js.undefined
}
object CreateCapacityReservationResult {
  
  inline def apply(): CreateCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCapacityReservationResult]
  }
  
  extension [Self <: CreateCapacityReservationResult](x: Self) {
    
    inline def setCapacityReservation(value: CapacityReservation): Self = StObject.set(x, "CapacityReservation", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationUndefined: Self = StObject.set(x, "CapacityReservation", js.undefined)
  }
}
