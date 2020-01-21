package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key of the tag.
    */
  var Key: TagKey = js.native
  /**
    * The value of the tag.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

