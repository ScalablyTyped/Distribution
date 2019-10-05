package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
  /**
    * The end of the time frame for which to aggregate statistics.
    */
  var EndTime: Timestamp
  /**
    * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge functions. If no selector expression is specified, edge statistics are returned. 
    */
  var EntitySelectorExpression: js.UndefOr[typings.awsDashSdk.clientsXrayMod.EntitySelectorExpression] = js.undefined
  /**
    * The ARN of the group for which to pull statistics from.
    */
  var GroupARN: js.UndefOr[typings.awsDashSdk.clientsXrayMod.GroupARN] = js.undefined
  /**
    * The case-sensitive name of the group for which to pull statistics from.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsXrayMod.GroupName] = js.undefined
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Aggregation period in seconds.
    */
  var Period: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The start of the time frame for which to aggregate statistics.
    */
  var StartTime: Timestamp
}

object GetTimeSeriesServiceStatisticsRequest {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    StartTime: Timestamp,
    EntitySelectorExpression: EntitySelectorExpression = null,
    GroupARN: GroupARN = null,
    GroupName: GroupName = null,
    NextToken: String = null,
    Period: Int | scala.Double = null
  ): GetTimeSeriesServiceStatisticsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, StartTime = StartTime)
    if (EntitySelectorExpression != null) __obj.updateDynamic("EntitySelectorExpression")(EntitySelectorExpression)
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
  }
}

