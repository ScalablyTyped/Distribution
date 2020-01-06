package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogRecordRequest extends js.Object {
  /**
    * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a GetQueryResults operation. In that response, the value of the @ptr field for a log event is the value to use as logRecordPointer to retrieve that complete log event record.
    */
  var logRecordPointer: LogRecordPointer = js.native
}

object GetLogRecordRequest {
  @scala.inline
  def apply(logRecordPointer: LogRecordPointer): GetLogRecordRequest = {
    val __obj = js.Dynamic.literal(logRecordPointer = logRecordPointer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLogRecordRequest]
  }
}

