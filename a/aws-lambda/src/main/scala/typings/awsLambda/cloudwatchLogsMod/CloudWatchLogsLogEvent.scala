package typings.awsLambda.cloudwatchLogsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsLogEvent extends js.Object {
  var extractedFields: js.UndefOr[StringDictionary[String]] = js.native
  var id: String = js.native
  var message: String = js.native
  var timestamp: Double = js.native
}

object CloudWatchLogsLogEvent {
  @scala.inline
  def apply(id: String, message: String, timestamp: Double): CloudWatchLogsLogEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsLogEvent]
  }
  @scala.inline
  implicit class CloudWatchLogsLogEventOps[Self <: CloudWatchLogsLogEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractedFields(value: StringDictionary[String]): Self = this.set("extractedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractedFields: Self = this.set("extractedFields", js.undefined)
  }
  
}

