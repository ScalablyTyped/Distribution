package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource whose tags you want to modify.
    */
  var resourceArn: ResourceArn
  /**
    * The new or modified tags for the resource.
    */
  var tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

