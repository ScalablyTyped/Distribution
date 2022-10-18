package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryStatisticsResponse extends StObject {
  
  /**
    * An ExecutionStatistics structure containing execution statistics.
    */
  var ExecutionStatistics: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ExecutionStatistics] = js.undefined
  
  /**
    * A PlanningStatistics structure containing query planning statistics.
    */
  var PlanningStatistics: js.UndefOr[typings.awsSdk.clientsLakeformationMod.PlanningStatistics] = js.undefined
  
  /**
    * The time that the query was submitted.
    */
  var QuerySubmissionTime: js.UndefOr[js.Date] = js.undefined
}
object GetQueryStatisticsResponse {
  
  inline def apply(): GetQueryStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryStatisticsResponse]
  }
  
  extension [Self <: GetQueryStatisticsResponse](x: Self) {
    
    inline def setExecutionStatistics(value: ExecutionStatistics): Self = StObject.set(x, "ExecutionStatistics", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatisticsUndefined: Self = StObject.set(x, "ExecutionStatistics", js.undefined)
    
    inline def setPlanningStatistics(value: PlanningStatistics): Self = StObject.set(x, "PlanningStatistics", value.asInstanceOf[js.Any])
    
    inline def setPlanningStatisticsUndefined: Self = StObject.set(x, "PlanningStatistics", js.undefined)
    
    inline def setQuerySubmissionTime(value: js.Date): Self = StObject.set(x, "QuerySubmissionTime", value.asInstanceOf[js.Any])
    
    inline def setQuerySubmissionTimeUndefined: Self = StObject.set(x, "QuerySubmissionTime", js.undefined)
  }
}
