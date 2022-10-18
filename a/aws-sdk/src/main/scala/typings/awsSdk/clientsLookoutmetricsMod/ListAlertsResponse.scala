package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsResponse extends StObject {
  
  /**
    * Contains information about an alert.
    */
  var AlertSummaryList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AlertSummaryList] = js.undefined
  
  /**
    * If the response is truncated, the service returns this token. To retrieve the next set of results, use this token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object ListAlertsResponse {
  
  inline def apply(): ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertsResponse]
  }
  
  extension [Self <: ListAlertsResponse](x: Self) {
    
    inline def setAlertSummaryList(value: AlertSummaryList): Self = StObject.set(x, "AlertSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAlertSummaryListUndefined: Self = StObject.set(x, "AlertSummaryList", js.undefined)
    
    inline def setAlertSummaryListVarargs(value: AlertSummary*): Self = StObject.set(x, "AlertSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
