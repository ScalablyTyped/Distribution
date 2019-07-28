package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag's key.
    */
  var key: js.UndefOr[KeyInput] = js.undefined
  /**
    * The tag's value.
    */
  var value: js.UndefOr[ValueInput] = js.undefined
}

object Tag {
  @scala.inline
  def apply(key: KeyInput = null, value: ValueInput = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tag]
  }
}

