package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * A tag key.
    */
  var key: TagKey
  /**
    * A value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tag]
  }
}

