package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) from which you want to remove the tag or tags. For example, arn:aws:redshift:us-east-1:123456789:cluster:t1. 
    */
  var ResourceName: String
  /**
    * The tag key that you want to delete.
    */
  var TagKeys: TagKeyList
}

object DeleteTagsMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: TagKeyList): DeleteTagsMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsMessage]
  }
}

