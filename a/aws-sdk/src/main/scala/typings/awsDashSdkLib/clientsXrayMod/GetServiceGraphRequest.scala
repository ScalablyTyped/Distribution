package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceGraphRequest extends js.Object {
  /**
    * The end of the timeframe for which to generate a graph.
    */
  var EndTime: Timestamp
  /**
    * The ARN of a group to generate a graph based on.
    */
  var GroupARN: js.UndefOr[GroupARN] = js.undefined
  /**
    * The name of a group to generate a graph based on.
    */
  var GroupName: js.UndefOr[GroupName] = js.undefined
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The start of the time frame for which to generate a graph.
    */
  var StartTime: Timestamp
}

object GetServiceGraphRequest {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    StartTime: Timestamp,
    GroupARN: GroupARN = null,
    GroupName: GroupName = null,
    NextToken: String = null
  ): GetServiceGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, StartTime = StartTime)
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetServiceGraphRequest]
  }
}

