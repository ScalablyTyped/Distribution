package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogGroupFieldsRequest extends js.Object {
  /**
    * The name of the log group to search.
    */
  var logGroupName: LogGroupName
  /**
    * The time to set as the center of the query. If you specify time, the 8 minutes before and 8 minutes after this time are searched. If you omit time, the past 15 minutes are queried. The time value is specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var time: js.UndefOr[Timestamp] = js.undefined
}

object GetLogGroupFieldsRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, time: js.UndefOr[Timestamp] = js.undefined): GetLogGroupFieldsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[GetLogGroupFieldsRequest]
  }
}

