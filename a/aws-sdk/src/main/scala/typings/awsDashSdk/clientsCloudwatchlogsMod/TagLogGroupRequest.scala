package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The key-value pairs to use for the tags.
    */
  var tags: Tags
}

object TagLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, tags: Tags): TagLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName, tags = tags)
  
    __obj.asInstanceOf[TagLogGroupRequest]
  }
}

