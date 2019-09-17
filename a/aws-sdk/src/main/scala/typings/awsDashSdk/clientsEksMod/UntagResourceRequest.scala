package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which to delete tags. Currently, the supported resources are Amazon EKS clusters.
    */
  var resourceArn: String
  /**
    * The keys of the tags to be removed.
    */
  var tagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

