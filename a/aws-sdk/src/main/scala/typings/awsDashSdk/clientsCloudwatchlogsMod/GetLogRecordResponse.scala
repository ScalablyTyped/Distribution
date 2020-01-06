package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogRecordResponse extends js.Object {
  /**
    * The requested log event, as a JSON string.
    */
  var logRecord: js.UndefOr[LogRecord] = js.native
}

object GetLogRecordResponse {
  @scala.inline
  def apply(logRecord: LogRecord = null): GetLogRecordResponse = {
    val __obj = js.Dynamic.literal()
    if (logRecord != null) __obj.updateDynamic("logRecord")(logRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRecordResponse]
  }
}

