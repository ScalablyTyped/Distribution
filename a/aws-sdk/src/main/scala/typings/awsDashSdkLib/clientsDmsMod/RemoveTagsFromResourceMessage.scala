package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * &gt;The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be removed from.
    */
  var ResourceArn: String
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceArn: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
}

