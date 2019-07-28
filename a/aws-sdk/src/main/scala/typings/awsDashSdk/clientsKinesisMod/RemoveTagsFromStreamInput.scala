package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
  /**
    * A list of tag keys. Each corresponding tag is removed from the stream.
    */
  var TagKeys: TagKeyList
}

object RemoveTagsFromStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
}

