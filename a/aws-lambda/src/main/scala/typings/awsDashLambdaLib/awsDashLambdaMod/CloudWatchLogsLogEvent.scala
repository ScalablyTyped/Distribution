package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsLogEvent extends js.Object {
  var extractedFields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var id: java.lang.String
  var message: java.lang.String
  var timestamp: scala.Double
}

object CloudWatchLogsLogEvent {
  @scala.inline
  def apply(
    id: java.lang.String,
    message: java.lang.String,
    timestamp: scala.Double,
    extractedFields: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): CloudWatchLogsLogEvent = {
    val __obj = js.Dynamic.literal(id = id, message = message, timestamp = timestamp)
    if (extractedFields != null) __obj.updateDynamic("extractedFields")(extractedFields)
    __obj.asInstanceOf[CloudWatchLogsLogEvent]
  }
}

