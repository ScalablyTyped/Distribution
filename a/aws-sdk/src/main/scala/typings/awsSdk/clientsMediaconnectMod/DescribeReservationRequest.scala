package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the reservation.
    */
  var ReservationArn: string
}
object DescribeReservationRequest {
  
  inline def apply(ReservationArn: string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationArn = ReservationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservationRequest] (val x: Self) extends AnyVal {
    
    inline def setReservationArn(value: string): Self = StObject.set(x, "ReservationArn", value.asInstanceOf[js.Any])
  }
}
