package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsDecodedData extends js.Object {
  var logEvents: js.Array[CloudWatchLogsLogEvent]
  var logGroup: java.lang.String
  var logStream: java.lang.String
  var messageType: java.lang.String
  var owner: java.lang.String
  var subscriptionFilters: js.Array[java.lang.String]
}

object CloudWatchLogsDecodedData {
  @scala.inline
  def apply(
    logEvents: js.Array[CloudWatchLogsLogEvent],
    logGroup: java.lang.String,
    logStream: java.lang.String,
    messageType: java.lang.String,
    owner: java.lang.String,
    subscriptionFilters: js.Array[java.lang.String]
  ): CloudWatchLogsDecodedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logEvents")(logEvents)
    __obj.updateDynamic("logGroup")(logGroup)
    __obj.updateDynamic("logStream")(logStream)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("subscriptionFilters")(subscriptionFilters)
    __obj.asInstanceOf[CloudWatchLogsDecodedData]
  }
}

