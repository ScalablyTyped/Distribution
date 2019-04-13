package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The tag keys. The corresponding tags are removed from the log group.
    */
  var tags: TagList
}

object UntagLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, tags: TagList): UntagLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName, tags = tags)
  
    __obj.asInstanceOf[UntagLogGroupRequest]
  }
}

