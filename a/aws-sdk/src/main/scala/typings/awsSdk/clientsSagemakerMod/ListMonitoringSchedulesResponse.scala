package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringSchedulesResponse extends StObject {
  
  /**
    * A JSON array in which each element is a summary for a monitoring schedule.
    */
  var MonitoringScheduleSummaries: MonitoringScheduleSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListMonitoringSchedulesResponse {
  
  inline def apply(MonitoringScheduleSummaries: MonitoringScheduleSummaryList): ListMonitoringSchedulesResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleSummaries = MonitoringScheduleSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringSchedulesResponse]
  }
  
  extension [Self <: ListMonitoringSchedulesResponse](x: Self) {
    
    inline def setMonitoringScheduleSummaries(value: MonitoringScheduleSummaryList): Self = StObject.set(x, "MonitoringScheduleSummaries", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleSummariesVarargs(value: MonitoringScheduleSummary*): Self = StObject.set(x, "MonitoringScheduleSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
