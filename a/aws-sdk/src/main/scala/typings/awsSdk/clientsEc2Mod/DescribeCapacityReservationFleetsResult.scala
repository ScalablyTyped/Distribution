package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCapacityReservationFleetsResult extends StObject {
  
  /**
    * Information about the Capacity Reservation Fleets.
    */
  var CapacityReservationFleets: js.UndefOr[CapacityReservationFleetSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCapacityReservationFleetsResult {
  
  inline def apply(): DescribeCapacityReservationFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityReservationFleetsResult]
  }
  
  extension [Self <: DescribeCapacityReservationFleetsResult](x: Self) {
    
    inline def setCapacityReservationFleets(value: CapacityReservationFleetSet): Self = StObject.set(x, "CapacityReservationFleets", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationFleetsUndefined: Self = StObject.set(x, "CapacityReservationFleets", js.undefined)
    
    inline def setCapacityReservationFleetsVarargs(value: CapacityReservationFleet*): Self = StObject.set(x, "CapacityReservationFleets", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
