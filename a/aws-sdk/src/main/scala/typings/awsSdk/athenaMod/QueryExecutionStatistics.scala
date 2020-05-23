package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    DataManifestLocation: String = null,
    DataScannedInBytes: js.UndefOr[Long] = js.undefined,
    EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined,
    QueryPlanningTimeInMillis: js.UndefOr[Long] = js.undefined,
    QueryQueueTimeInMillis: js.UndefOr[Long] = js.undefined,
    ServiceProcessingTimeInMillis: js.UndefOr[Long] = js.undefined,
    TotalExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
  ): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    if (DataManifestLocation != null) __obj.updateDynamic("DataManifestLocation")(DataManifestLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(DataScannedInBytes)) __obj.updateDynamic("DataScannedInBytes")(DataScannedInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EngineExecutionTimeInMillis)) __obj.updateDynamic("EngineExecutionTimeInMillis")(EngineExecutionTimeInMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(QueryPlanningTimeInMillis)) __obj.updateDynamic("QueryPlanningTimeInMillis")(QueryPlanningTimeInMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(QueryQueueTimeInMillis)) __obj.updateDynamic("QueryQueueTimeInMillis")(QueryQueueTimeInMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ServiceProcessingTimeInMillis)) __obj.updateDynamic("ServiceProcessingTimeInMillis")(ServiceProcessingTimeInMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalExecutionTimeInMillis)) __obj.updateDynamic("TotalExecutionTimeInMillis")(TotalExecutionTimeInMillis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
}

