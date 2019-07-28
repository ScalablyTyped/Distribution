package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The type of tag on which to filter.
    */
  var key: TagKey
  /**
    * A value for a tag key on which to filter.
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

