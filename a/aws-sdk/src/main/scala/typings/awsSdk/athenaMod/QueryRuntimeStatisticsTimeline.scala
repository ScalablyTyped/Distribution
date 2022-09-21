package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRuntimeStatisticsTimeline extends StObject {
  
  /**
    * The number of milliseconds that the query took to execute.
    */
  var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent retrieving table partitions from the data source. Note that because the query engine performs the query planning, query planning time is a subset of engine processing time.
    */
  var QueryPlanningTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient errors occur, Athena might automatically add the query back to the queue.
    */
  var QueryQueueTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of milliseconds that Athena took to finalize and publish the query results after the query engine finished running the query.
    */
  var ServiceProcessingTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of milliseconds that Athena took to run the query.
    */
  var TotalExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
}
object QueryRuntimeStatisticsTimeline {
  
  inline def apply(): QueryRuntimeStatisticsTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRuntimeStatisticsTimeline]
  }
  
  extension [Self <: QueryRuntimeStatisticsTimeline](x: Self) {
    
    inline def setEngineExecutionTimeInMillis(value: Long): Self = StObject.set(x, "EngineExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setEngineExecutionTimeInMillisUndefined: Self = StObject.set(x, "EngineExecutionTimeInMillis", js.undefined)
    
    inline def setQueryPlanningTimeInMillis(value: Long): Self = StObject.set(x, "QueryPlanningTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanningTimeInMillisUndefined: Self = StObject.set(x, "QueryPlanningTimeInMillis", js.undefined)
    
    inline def setQueryQueueTimeInMillis(value: Long): Self = StObject.set(x, "QueryQueueTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setQueryQueueTimeInMillisUndefined: Self = StObject.set(x, "QueryQueueTimeInMillis", js.undefined)
    
    inline def setServiceProcessingTimeInMillis(value: Long): Self = StObject.set(x, "ServiceProcessingTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setServiceProcessingTimeInMillisUndefined: Self = StObject.set(x, "ServiceProcessingTimeInMillis", js.undefined)
    
    inline def setTotalExecutionTimeInMillis(value: Long): Self = StObject.set(x, "TotalExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionTimeInMillisUndefined: Self = StObject.set(x, "TotalExecutionTimeInMillis", js.undefined)
  }
}
