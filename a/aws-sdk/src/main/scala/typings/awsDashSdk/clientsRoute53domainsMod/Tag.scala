package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key (name) of a tag. Valid values: A-Z, a-z, 0-9, space, ".:/=+\-@" Constraints: Each key can be 1-128 characters long.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  /**
    * The value of a tag. Valid values: A-Z, a-z, 0-9, space, ".:/=+\-@" Constraints: Each value can be 0-256 characters long.
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

