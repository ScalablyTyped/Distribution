package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecutionStatistics extends StObject {
  
  /**
    * The location and file name of a data manifest file. The manifest file is saved to the Athena query results location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned files resulting from a failed query. For more information, see Working with Query Results, Output Files, and Query History in the Amazon Athena User Guide.
    */
  var DataManifestLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes in the data that was queried.
    */
  var DataScannedInBytes: js.UndefOr[Long] = js.undefined
  
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
    * Contains information about whether previous query results were reused for the query.
    */
  var ResultReuseInformation: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultReuseInformation] = js.undefined
  
  /**
    * The number of milliseconds that Athena took to finalize and publish the query results after the query engine finished running the query.
    */
  var ServiceProcessingTimeInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of milliseconds that Athena took to run the query.
    */
  var TotalExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
}
object QueryExecutionStatistics {
  
  inline def apply(): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExecutionStatistics] (val x: Self) extends AnyVal {
    
    inline def setDataManifestLocation(value: String): Self = StObject.set(x, "DataManifestLocation", value.asInstanceOf[js.Any])
    
    inline def setDataManifestLocationUndefined: Self = StObject.set(x, "DataManifestLocation", js.undefined)
    
    inline def setDataScannedInBytes(value: Long): Self = StObject.set(x, "DataScannedInBytes", value.asInstanceOf[js.Any])
    
    inline def setDataScannedInBytesUndefined: Self = StObject.set(x, "DataScannedInBytes", js.undefined)
    
    inline def setEngineExecutionTimeInMillis(value: Long): Self = StObject.set(x, "EngineExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setEngineExecutionTimeInMillisUndefined: Self = StObject.set(x, "EngineExecutionTimeInMillis", js.undefined)
    
    inline def setQueryPlanningTimeInMillis(value: Long): Self = StObject.set(x, "QueryPlanningTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanningTimeInMillisUndefined: Self = StObject.set(x, "QueryPlanningTimeInMillis", js.undefined)
    
    inline def setQueryQueueTimeInMillis(value: Long): Self = StObject.set(x, "QueryQueueTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setQueryQueueTimeInMillisUndefined: Self = StObject.set(x, "QueryQueueTimeInMillis", js.undefined)
    
    inline def setResultReuseInformation(value: ResultReuseInformation): Self = StObject.set(x, "ResultReuseInformation", value.asInstanceOf[js.Any])
    
    inline def setResultReuseInformationUndefined: Self = StObject.set(x, "ResultReuseInformation", js.undefined)
    
    inline def setServiceProcessingTimeInMillis(value: Long): Self = StObject.set(x, "ServiceProcessingTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setServiceProcessingTimeInMillisUndefined: Self = StObject.set(x, "ServiceProcessingTimeInMillis", js.undefined)
    
    inline def setTotalExecutionTimeInMillis(value: Long): Self = StObject.set(x, "TotalExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionTimeInMillisUndefined: Self = StObject.set(x, "TotalExecutionTimeInMillis", js.undefined)
  }
}
