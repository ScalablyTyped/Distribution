package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name.
    */
  var Arn: __string = js.native
  /**
    * The keys of the tags that you want to remove from the resource.
    */
  var TagKeys: js.UndefOr[__listOf__string] = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(Arn: __string, TagKeys: __listOf__string = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

