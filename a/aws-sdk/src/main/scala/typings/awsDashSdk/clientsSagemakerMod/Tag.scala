package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag key.
    */
  var Key: TagKey
  /**
    * The tag value.
    */
  var Value: TagValue
}

object Tag {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[Tag]
  }
}

