package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: __string
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: __mapOf__string = null): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

