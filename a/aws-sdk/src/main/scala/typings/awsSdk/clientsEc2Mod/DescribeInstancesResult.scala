package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstancesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the reservations.
    */
  var Reservations: js.UndefOr[ReservationList] = js.undefined
}
object DescribeInstancesResult {
  
  inline def apply(): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesResult]
  }
  
  extension [Self <: DescribeInstancesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservations(value: ReservationList): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
    
    inline def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "Reservations", js.Array(value*))
  }
}
