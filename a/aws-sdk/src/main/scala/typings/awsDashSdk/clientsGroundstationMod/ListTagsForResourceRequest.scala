package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * ARN of a resource.
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

