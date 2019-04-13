package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartQueryRequest extends js.Object {
  /**
    * The end of the time range to query. The range is inclusive, so the specified end time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var endTime: Timestamp
  /**
    * The maximum number of log events to return in the query. If the query string uses the fields command, only the specified fields and their values are returned.
    */
  var limit: js.UndefOr[EventsLimit] = js.undefined
  /**
    * The log group on which to perform the query.
    */
  var logGroupName: LogGroupName
  /**
    * The query string to use. For more information, see CloudWatch Logs Insights Query Syntax.
    */
  var queryString: QueryString
  /**
    * The beginning of the time range to query. The range is inclusive, so the specified start time is included in the query. Specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var startTime: Timestamp
}

object StartQueryRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    logGroupName: LogGroupName,
    queryString: QueryString,
    startTime: Timestamp,
    limit: js.UndefOr[EventsLimit] = js.undefined
  ): StartQueryRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, logGroupName = logGroupName, queryString = queryString, startTime = startTime)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    __obj.asInstanceOf[StartQueryRequest]
  }
}

