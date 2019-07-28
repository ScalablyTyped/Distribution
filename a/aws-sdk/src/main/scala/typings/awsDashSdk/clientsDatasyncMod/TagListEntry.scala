package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagListEntry extends js.Object {
  /**
    * The key for an AWS resource tag.
    */
  var Key: TagKey
  /**
    * The value for an AWS resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object TagListEntry {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue = null): TagListEntry = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[TagListEntry]
  }
}

