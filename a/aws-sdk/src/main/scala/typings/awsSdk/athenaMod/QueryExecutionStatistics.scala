package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecutionStatistics extends js.Object {
  
  /**
    * The location and file name of a data manifest file. The manifest file is saved to the Athena query results location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned files resulting from a failed query. For more information, see Working with Query Results, Output Files, and Query History in the Amazon Athena User Guide.
    */
  var DataManifestLocation: js.UndefOr[String] = js.native
  
  /**
    * The number of bytes in the data that was queried.
    */
  var DataScannedInBytes: js.UndefOr[Long] = js.native
  
  /**
    * The number of milliseconds that the query took to execute.
    */
  var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.native
  
  /**
    * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent retrieving table partitions from the data source. Note that because the query engine performs the query planning, query planning time is a subset of engine processing time.
    */
  var QueryPlanningTimeInMillis: js.UndefOr[Long] = js.native
  
  /**
    * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient errors occur, Athena might automatically add the query back to the queue.
    */
  var QueryQueueTimeInMillis: js.UndefOr[Long] = js.native
  
  /**
    * The number of milliseconds that Athena took to finalize and publish the query results after the query engine finished running the query.
    */
  var ServiceProcessingTimeInMillis: js.UndefOr[Long] = js.native
  
  /**
    * The number of milliseconds that Athena took to run the query.
    */
  var TotalExecutionTimeInMillis: js.UndefOr[Long] = js.native
}
object QueryExecutionStatistics {
  
  @scala.inline
  def apply(): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
  
  @scala.inline
  implicit class QueryExecutionStatisticsOps[Self <: QueryExecutionStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataManifestLocation(value: String): Self = this.set("DataManifestLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataManifestLocation: Self = this.set("DataManifestLocation", js.undefined)
    
    @scala.inline
    def setDataScannedInBytes(value: Long): Self = this.set("DataScannedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataScannedInBytes: Self = this.set("DataScannedInBytes", js.undefined)
    
    @scala.inline
    def setEngineExecutionTimeInMillis(value: Long): Self = this.set("EngineExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineExecutionTimeInMillis: Self = this.set("EngineExecutionTimeInMillis", js.undefined)
    
    @scala.inline
    def setQueryPlanningTimeInMillis(value: Long): Self = this.set("QueryPlanningTimeInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPlanningTimeInMillis: Self = this.set("QueryPlanningTimeInMillis", js.undefined)
    
    @scala.inline
    def setQueryQueueTimeInMillis(value: Long): Self = this.set("QueryQueueTimeInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryQueueTimeInMillis: Self = this.set("QueryQueueTimeInMillis", js.undefined)
    
    @scala.inline
    def setServiceProcessingTimeInMillis(value: Long): Self = this.set("ServiceProcessingTimeInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceProcessingTimeInMillis: Self = this.set("ServiceProcessingTimeInMillis", js.undefined)
    
    @scala.inline
    def setTotalExecutionTimeInMillis(value: Long): Self = this.set("TotalExecutionTimeInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalExecutionTimeInMillis: Self = this.set("TotalExecutionTimeInMillis", js.undefined)
  }
}
