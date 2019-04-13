package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key.
    */
  var key: TagKey
  /**
    * The value.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tag]
  }
}

