package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported resources are Amazon EKS clusters.
    */
  var resourceArn: String
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: String): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

