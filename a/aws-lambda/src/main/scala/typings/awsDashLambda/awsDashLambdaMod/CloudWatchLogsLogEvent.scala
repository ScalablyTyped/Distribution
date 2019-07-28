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
    val __obj = js.Dynamic.literal(id = id, message = message, timestamp = timestamp)
    if (extractedFields != null) __obj.updateDynamic("extractedFields")(extractedFields)
    __obj.asInstanceOf[CloudWatchLogsLogEvent]
  }
}

