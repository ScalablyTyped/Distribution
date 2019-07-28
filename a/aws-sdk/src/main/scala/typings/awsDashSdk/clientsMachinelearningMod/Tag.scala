package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * A unique identifier for the tag. Valid characters include Unicode letters, digits, white space, _, ., /, =, +, -, %, and @.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  /**
    * An optional string, typically used to describe or define the tag. Valid characters include Unicode letters, digits, white space, _, ., /, =, +, -, %, and @.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: TagKey = null, Value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

