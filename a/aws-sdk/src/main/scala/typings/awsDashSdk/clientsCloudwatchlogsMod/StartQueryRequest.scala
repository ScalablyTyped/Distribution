package typings.awsDashSdk.clientsCloudwatchlogsMod

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
    * The log group on which to perform the query. A StartQuery operation must include a logGroupNames or a logGroupName parameter, but not both.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The list of log groups to be queried. You can include up to 20 log groups. A StartQuery operation must include a logGroupNames or a logGroupName parameter, but not both.
    */
  var logGroupNames: js.UndefOr[LogGroupNames] = js.undefined
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
    queryString: QueryString,
    startTime: Timestamp,
    limit: Int | Double = null,
    logGroupName: LogGroupName = null,
    logGroupNames: LogGroupNames = null
  ): StartQueryRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, queryString = queryString, startTime = startTime)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (logGroupNames != null) __obj.updateDynamic("logGroupNames")(logGroupNames)
    __obj.asInstanceOf[StartQueryRequest]
  }
}

