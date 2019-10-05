package typings.antd.esCardMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTabListType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: String
  var tab: ReactNode
}

object CardTabListType {
  @scala.inline
  def apply(key: String, disabled: js.UndefOr[Boolean] = js.undefined, tab: ReactNode = null): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTabListType]
  }
}

