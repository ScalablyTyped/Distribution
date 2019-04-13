package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLogStreamsRequest extends js.Object {
  /**
    * If the value is true, results are returned in descending order. If the value is to false, results are returned in ascending order. The default value is false.
    */
  var descending: js.UndefOr[Descending] = js.undefined
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The prefix to match. If orderBy is LastEventTime,you cannot specify this parameter.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * If the value is LogStreamName, the results are ordered by log stream name. If the value is LastEventTime, the results are ordered by the event time. The default value is LogStreamName. If you order the results by event time, you cannot specify the logStreamNamePrefix parameter. lastEventTimestamp represents the time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}

object DescribeLogStreamsRequest {
  @scala.inline
  def apply(
    logGroupName: LogGroupName,
    descending: js.UndefOr[Descending] = js.undefined,
    limit: js.UndefOr[DescribeLimit] = js.undefined,
    logStreamNamePrefix: LogStreamName = null,
    nextToken: NextToken = null,
    orderBy: OrderBy = null
  ): DescribeLogStreamsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
    if (!js.isUndefined(descending)) __obj.updateDynamic("descending")(descending)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (logStreamNamePrefix != null) __obj.updateDynamic("logStreamNamePrefix")(logStreamNamePrefix)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogStreamsRequest]
  }
}

