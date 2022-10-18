package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseOfferingResponse extends StObject {
  
  var Reservation: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Reservation] = js.undefined
}
object PurchaseOfferingResponse {
  
  inline def apply(): PurchaseOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingResponse]
  }
  
  extension [Self <: PurchaseOfferingResponse](x: Self) {
    
    inline def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
