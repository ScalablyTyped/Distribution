package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name.
    */
  var Arn: __string
  /**
    * The keys of the tags that you want to remove from the resource.
    */
  var TagKeys: js.UndefOr[__listOf__string] = js.undefined
}

object UntagResourceRequest {
  @scala.inline
  def apply(Arn: __string, TagKeys: __listOf__string = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

