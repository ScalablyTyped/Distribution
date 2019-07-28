package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key of the tag.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  /**
    * The value of the tag.
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

