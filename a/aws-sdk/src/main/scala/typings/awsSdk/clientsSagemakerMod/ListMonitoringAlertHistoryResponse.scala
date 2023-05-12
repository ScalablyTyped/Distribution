package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringAlertHistoryResponse extends StObject {
  
  /**
    * An alert history for a model monitoring schedule.
    */
  var MonitoringAlertHistory: js.UndefOr[MonitoringAlertHistoryList] = js.undefined
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of alerts, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListMonitoringAlertHistoryResponse {
  
  inline def apply(): ListMonitoringAlertHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringAlertHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitoringAlertHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setMonitoringAlertHistory(value: MonitoringAlertHistoryList): Self = StObject.set(x, "MonitoringAlertHistory", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertHistoryUndefined: Self = StObject.set(x, "MonitoringAlertHistory", js.undefined)
    
    inline def setMonitoringAlertHistoryVarargs(value: MonitoringAlertHistorySummary*): Self = StObject.set(x, "MonitoringAlertHistory", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
