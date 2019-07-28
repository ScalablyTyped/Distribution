package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key of the tag. Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in UTF-8, or the following characters: + - = . _ : / @
    */
  var key: js.UndefOr[TagKey] = js.undefined
  /**
    * The value of the tag. Constraints: Tag values accept a maximum of 256 letters, numbers, spaces in UTF-8, or the following characters: + - = . _ : / @
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

