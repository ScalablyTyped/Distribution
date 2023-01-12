package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReservationResponse extends StObject {
  
  var Reservation: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Reservation] = js.undefined
}
object UpdateReservationResponse {
  
  inline def apply(): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReservationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateReservationResponse] (val x: Self) extends AnyVal {
    
    inline def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
