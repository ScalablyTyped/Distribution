package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resouce for which tag(s) should be added or modified.
    */
  var resourceArn: ProjectArn
  /**
    * The new or modifying tag(s) for the resource. See AWS IoT 1-Click Service Limits for the maximum number of tags allowed per resource.
    */
  var tags: TagMap
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ProjectArn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

