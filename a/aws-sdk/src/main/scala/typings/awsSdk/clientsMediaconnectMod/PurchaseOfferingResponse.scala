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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseOfferingResponse] (val x: Self) extends AnyVal {
    
    inline def setReservation(value: Reservation): Self = StObject.set(x, "Reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "Reservation", js.undefined)
  }
}
