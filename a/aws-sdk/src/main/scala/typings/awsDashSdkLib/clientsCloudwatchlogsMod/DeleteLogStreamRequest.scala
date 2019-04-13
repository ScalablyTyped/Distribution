package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLogStreamRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
}

object DeleteLogStreamRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, logStreamName: LogStreamName): DeleteLogStreamRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName, logStreamName = logStreamName)
  
    __obj.asInstanceOf[DeleteLogStreamRequest]
  }
}

