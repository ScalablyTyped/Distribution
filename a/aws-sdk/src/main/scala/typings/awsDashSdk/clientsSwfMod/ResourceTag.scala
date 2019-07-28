package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTag extends js.Object {
  /**
    * The key of a tag.
    */
  var key: ResourceTagKey
  /**
    * The value of a tag.
    */
  var value: js.UndefOr[ResourceTagValue] = js.undefined
}

object ResourceTag {
  @scala.inline
  def apply(key: ResourceTagKey, value: ResourceTagValue = null): ResourceTag = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResourceTag]
  }
}

