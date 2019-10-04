package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which you want to remove a tag.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The name of the resource from which you are removing a tag.
    */
  var resourceName: ResourceName
  /**
    * The tag keys to delete from the specified resource.
    */
  var tagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tagKeys: TagKeyList, resourceArn: ResourceArn = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName, tagKeys = tagKeys)
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

