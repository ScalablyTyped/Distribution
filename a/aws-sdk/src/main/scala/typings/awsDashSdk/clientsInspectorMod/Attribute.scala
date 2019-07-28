package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The attribute key.
    */
  var key: AttributeKey
  /**
    * The value assigned to the attribute key.
    */
  var value: js.UndefOr[AttributeValue] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(key: AttributeKey, value: AttributeValue = null): Attribute = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Attribute]
  }
}

