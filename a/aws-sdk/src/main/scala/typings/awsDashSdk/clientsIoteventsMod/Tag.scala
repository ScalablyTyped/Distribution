package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag's key.
    */
  var key: TagKey
  /**
    * The tag's value.
    */
  var value: TagValue
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Tag]
  }
}

