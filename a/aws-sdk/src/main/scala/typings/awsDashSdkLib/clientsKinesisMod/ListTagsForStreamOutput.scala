package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForStreamOutput extends js.Object {
  /**
    * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
    */
  var HasMoreTags: BooleanObject
  /**
    * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
    */
  var Tags: TagList
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: TagList): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags, Tags = Tags)
  
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
}

