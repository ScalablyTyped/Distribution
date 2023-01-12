package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReservationRequest extends StObject {
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string
}
object DeleteReservationRequest {
  
  inline def apply(ReservationId: string): DeleteReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReservationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReservationRequest] (val x: Self) extends AnyVal {
    
    inline def setReservationId(value: string): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
  }
}
