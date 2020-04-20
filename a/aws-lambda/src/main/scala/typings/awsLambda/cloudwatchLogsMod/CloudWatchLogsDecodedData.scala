package typings.awsLambda.cloudwatchLogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsDecodedData extends js.Object {
  var logEvents: js.Array[CloudWatchLogsLogEvent]
  var logGroup: String
  var logStream: String
  var messageType: String
  var owner: String
  var subscriptionFilters: js.Array[String]
}

object CloudWatchLogsDecodedData {
  @scala.inline
  def apply(
    logEvents: js.Array[CloudWatchLogsLogEvent],
    logGroup: String,
    logStream: String,
    messageType: String,
    owner: String,
    subscriptionFilters: js.Array[String]
  ): CloudWatchLogsDecodedData = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsDecodedData]
  }
}

