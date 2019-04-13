package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be added to. AWS DMS resources include a replication instance, endpoint, and a replication task.
    */
  var ResourceArn: String
  /**
    * The tag to be assigned to the DMS resource.
    */
  var Tags: TagList
}

object AddTagsToResourceMessage {
  @scala.inline
  def apply(ResourceArn: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
}

