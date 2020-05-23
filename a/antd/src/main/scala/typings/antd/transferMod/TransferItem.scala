package typings.antd.transferMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferItem
  extends /* customProp */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: String
  var title: js.UndefOr[String] = js.undefined
}

object TransferItem {
  @scala.inline
  def apply(
    key: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): TransferItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferItem]
  }
}

