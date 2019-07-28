package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
    */
  var key: js.UndefOr[TagKey] = js.undefined
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
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

