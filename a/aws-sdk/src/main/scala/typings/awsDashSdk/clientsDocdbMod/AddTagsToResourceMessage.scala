package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceMessage extends js.Object {
  /**
    * The Amazon DocumentDB resource that the tags are added to. This value is an Amazon Resource Name (ARN).
    */
  var ResourceName: String
  /**
    * The tags to be assigned to the Amazon DocumentDB resource. 
    */
  var Tags: TagList
}

object AddTagsToResourceMessage {
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
}

