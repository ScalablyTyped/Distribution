package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogStreamRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
}

object CreateLogStreamRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, logStreamName: LogStreamName): CreateLogStreamRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName, logStreamName = logStreamName)
  
    __obj.asInstanceOf[CreateLogStreamRequest]
  }
}

