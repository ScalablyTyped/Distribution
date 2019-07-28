package typings.antd.libCardMod

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
  def apply(key: String, tab: ReactNode, disabled: js.UndefOr[Boolean] = js.undefined): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key, tab = tab.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[CardTabListType]
  }
}

