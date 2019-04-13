package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * The Amazon DocumentDB resource that the tags are removed from. This value is an Amazon Resource Name (ARN).
    */
  var ResourceName: String
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
}

