package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListZonalShiftsRequest extends StObject {
  
  /**
    * The number of objects that you want to return with this call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A status for a zonal shift. The Status for a zonal shift can have one of the following values:    ACTIVE: The zonal shift is started and active.    EXPIRED: The zonal shift has expired (the expiry time was exceeded).    CANCELED: The zonal shift was canceled.  
    */
  var status: js.UndefOr[ZonalShiftStatus] = js.undefined
}
object ListZonalShiftsRequest {
  
  inline def apply(): ListZonalShiftsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListZonalShiftsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListZonalShiftsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: ZonalShiftStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
