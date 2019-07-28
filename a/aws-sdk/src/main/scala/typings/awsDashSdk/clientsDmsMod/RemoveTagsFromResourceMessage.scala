package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * An AWS DMS resource from which you want to remove tag(s). The value for this parameter is an Amazon Resource Name (ARN).
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

