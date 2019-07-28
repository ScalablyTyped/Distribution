package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName
  /**
    * The new or modified tags for the resource.
    */
  var tags: Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: AmazonResourceName, tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

