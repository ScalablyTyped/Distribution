package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservationUtilizationResponse extends StObject {
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The total amount of time that you used your Reserved Instances (RIs).
    */
  var Total: js.UndefOr[ReservationAggregates] = js.undefined
  
  /**
    * The amount of time that you used your Reserved Instances (RIs).
    */
  var UtilizationsByTime: typings.awsSdk.clientsCostexplorerMod.UtilizationsByTime
}
object GetReservationUtilizationResponse {
  
  inline def apply(UtilizationsByTime: UtilizationsByTime): GetReservationUtilizationResponse = {
    val __obj = js.Dynamic.literal(UtilizationsByTime = UtilizationsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationUtilizationResponse]
  }
  
  extension [Self <: GetReservationUtilizationResponse](x: Self) {
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setTotal(value: ReservationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
    
    inline def setUtilizationsByTime(value: UtilizationsByTime): Self = StObject.set(x, "UtilizationsByTime", value.asInstanceOf[js.Any])
    
    inline def setUtilizationsByTimeVarargs(value: UtilizationByTime*): Self = StObject.set(x, "UtilizationsByTime", js.Array(value*))
  }
}
