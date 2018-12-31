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

