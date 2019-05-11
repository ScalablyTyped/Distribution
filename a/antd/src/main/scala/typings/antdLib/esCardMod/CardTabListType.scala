package typings
package antdLib.esCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTabListType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  var tab: reactLib.reactMod.ReactNode
}

object CardTabListType {
  @scala.inline
  def apply(
    key: java.lang.String,
    tab: reactLib.reactMod.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CardTabListType = {
    val __obj = js.Dynamic.literal(key = key, tab = tab.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[CardTabListType]
  }
}

