package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogGroupFieldsResponse extends js.Object {
  /**
    * The array of fields found in the query. Each object in the array contains the name of the field, along with the percentage of time it appeared in the log events that were queried.
    */
  var logGroupFields: js.UndefOr[LogGroupFieldList] = js.native
}

object GetLogGroupFieldsResponse {
  @scala.inline
  def apply(logGroupFields: LogGroupFieldList = null): GetLogGroupFieldsResponse = {
    val __obj = js.Dynamic.literal()
    if (logGroupFields != null) __obj.updateDynamic("logGroupFields")(logGroupFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogGroupFieldsResponse]
  }
}

