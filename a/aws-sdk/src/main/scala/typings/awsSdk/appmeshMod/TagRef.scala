package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRef extends js.Object {
  /**
    * One part of a key-value pair that make up a tag. A key is a general label
    that acts like a category for more specific tag values.
    */
  var key: TagKey = js.native
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a
    descriptor within a tag category (key).
    */
  var value: js.UndefOr[TagValue] = js.native
}

object TagRef {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): TagRef = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRef]
  }
}

