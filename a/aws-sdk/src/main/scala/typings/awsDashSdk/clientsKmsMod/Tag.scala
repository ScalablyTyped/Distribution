package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key of the tag.
    */
  var TagKey: TagKeyType
  /**
    * The value of the tag.
    */
  var TagValue: TagValueType
}

object Tag {
  @scala.inline
  def apply(TagKey: TagKeyType, TagValue: TagValueType): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey, TagValue = TagValue)
  
    __obj.asInstanceOf[Tag]
  }
}

