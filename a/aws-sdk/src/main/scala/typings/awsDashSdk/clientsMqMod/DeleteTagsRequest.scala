package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: __string = js.native
  /**
    * An array of tag keys to delete
    */
  var TagKeys: __listOf__string = js.native
}

object DeleteTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: __listOf__string): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

