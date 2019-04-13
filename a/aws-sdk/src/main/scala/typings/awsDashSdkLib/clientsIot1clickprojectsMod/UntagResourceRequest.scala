package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource whose tag you want to remove.
    */
  var resourceArn: ProjectArn
  /**
    * The keys of those tags which you want to remove.
    */
  var tagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: ProjectArn, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

