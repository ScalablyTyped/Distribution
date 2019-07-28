package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagRef extends js.Object {
  /**
    * One part of a key-value pair that make up a tag. A key is a general label
    that acts like a category for more specific tag values.
    */
  var key: TagKey
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a
    descriptor within a tag category (key).
    */
  var value: js.UndefOr[TagValue] = js.undefined
}

object TagRef {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): TagRef = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TagRef]
  }
}

