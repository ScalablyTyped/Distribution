package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringAlertsResponse extends StObject {
  
  /**
    * A JSON array where each element is a summary for a monitoring alert.
    */
  var MonitoringAlertSummaries: js.UndefOr[MonitoringAlertSummaryList] = js.undefined
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListMonitoringAlertsResponse {
  
  inline def apply(): ListMonitoringAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringAlertsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitoringAlertsResponse] (val x: Self) extends AnyVal {
    
    inline def setMonitoringAlertSummaries(value: MonitoringAlertSummaryList): Self = StObject.set(x, "MonitoringAlertSummaries", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertSummariesUndefined: Self = StObject.set(x, "MonitoringAlertSummaries", js.undefined)
    
    inline def setMonitoringAlertSummariesVarargs(value: MonitoringAlertSummary*): Self = StObject.set(x, "MonitoringAlertSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
