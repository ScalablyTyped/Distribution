package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * The Amazon DocumentDB resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
    */
  var ResourceName: String = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList = js.native
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
}

