package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * Tag key.
    */
  var key: js.UndefOr[TagKey] = js.undefined
  /**
    * Tag value.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(key: TagKey = null, value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tag]
  }
}

