package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object DeleteLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): DeleteLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
  
    __obj.asInstanceOf[DeleteLogGroupRequest]
  }
}

