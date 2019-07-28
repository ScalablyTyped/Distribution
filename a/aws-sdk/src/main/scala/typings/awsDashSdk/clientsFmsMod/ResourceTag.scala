package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTag extends js.Object {
  /**
    * The resource tag key.
    */
  var Key: TagKey
  /**
    * The resource tag value.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object ResourceTag {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue = null): ResourceTag = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ResourceTag]
  }
}

