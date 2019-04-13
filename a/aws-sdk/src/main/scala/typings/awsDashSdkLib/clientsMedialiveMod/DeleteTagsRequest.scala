package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsRequest extends js.Object {
  var ResourceArn: __string
  /**
    * An array of tag keys to delete
    */
  var TagKeys: __listOf__string
}

object DeleteTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: __listOf__string): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

