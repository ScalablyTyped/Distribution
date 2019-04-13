package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryResultsResponse extends js.Object {
  /**
    * The log events that matched the query criteria during the most recent time it ran. The results value is an array of arrays. Each log event is one object in the top-level array. Each of these log event objects is an array of field/value pairs.
    */
  var results: js.UndefOr[QueryResults] = js.undefined
  /**
    * Includes the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
    */
  var statistics: js.UndefOr[QueryStatistics] = js.undefined
  /**
    * The status of the most recent running of the query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
    */
  var status: js.UndefOr[QueryStatus] = js.undefined
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(results: QueryResults = null, statistics: QueryStatistics = null, status: QueryStatus = null): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
}

