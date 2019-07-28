package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object ListTagsLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): ListTagsLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
  
    __obj.asInstanceOf[ListTagsLogGroupRequest]
  }
}

