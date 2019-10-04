package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to add a tag.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The name of the resource to which you are adding tags.
    */
  var resourceName: ResourceName
  /**
    * The tag key and optional value.
    */
  var tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tags: TagList, resourceArn: ResourceArn = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName, tags = tags)
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    __obj.asInstanceOf[TagResourceRequest]
  }
}

