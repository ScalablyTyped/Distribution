package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsLogEvent extends js.Object {
  var extractedFields: js.UndefOr[StringDictionary[String]] = js.undefined
  var id: String
  var message: String
  var timestamp: Double
}

object CloudWatchLogsLogEvent {
  @scala.inline
  def apply(id: String, message: String, timestamp: Double, extractedFields: StringDictionary[String] = null): CloudWatchLogsLogEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (extractedFields != null) __obj.updateDynamic("extractedFields")(extractedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsLogEvent]
  }
}

