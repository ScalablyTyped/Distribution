package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupTag extends js.Object {
  /**
    * A tag key.
    */
  var key: TagKey
  /**
    * The value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}

object ResourceGroupTag {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): ResourceGroupTag = {
    val __obj = js.Dynamic.literal(key = key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResourceGroupTag]
  }
}

