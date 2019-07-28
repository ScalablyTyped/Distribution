package typings.antd.libTransferMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferItem
  extends /* name */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: String
  var title: String
}

object TransferItem {
  @scala.inline
  def apply(
    key: String,
    title: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): TransferItem = {
    val __obj = js.Dynamic.literal(key = key, title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[TransferItem]
  }
}

