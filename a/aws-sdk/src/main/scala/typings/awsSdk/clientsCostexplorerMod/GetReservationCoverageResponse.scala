package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservationCoverageResponse extends StObject {
  
  /**
    * The amount of time that your reservations covered.
    */
  var CoveragesByTime: typings.awsSdk.clientsCostexplorerMod.CoveragesByTime
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The total amount of instance usage that a reservation covered.
    */
  var Total: js.UndefOr[Coverage] = js.undefined
}
object GetReservationCoverageResponse {
  
  inline def apply(CoveragesByTime: CoveragesByTime): GetReservationCoverageResponse = {
    val __obj = js.Dynamic.literal(CoveragesByTime = CoveragesByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationCoverageResponse]
  }
  
  extension [Self <: GetReservationCoverageResponse](x: Self) {
    
    inline def setCoveragesByTime(value: CoveragesByTime): Self = StObject.set(x, "CoveragesByTime", value.asInstanceOf[js.Any])
    
    inline def setCoveragesByTimeVarargs(value: CoverageByTime*): Self = StObject.set(x, "CoveragesByTime", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setTotal(value: Coverage): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
