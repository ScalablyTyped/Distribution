package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the resource whose tags you want to list.
    */
  var resourceArn: ProjectArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: ProjectArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

