package typings
package atAntDashDesignProDashLayoutLib.libSettingDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingItemProps extends js.Object {
  var action: reactLib.reactMod.ReactElement
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledReason: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: reactLib.reactMod.ReactNode
}

object SettingItemProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactElement,
    title: reactLib.reactMod.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledReason: reactLib.reactMod.ReactNode = null
  ): SettingItemProps = {
    val __obj = js.Dynamic.literal(action = action, title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
}

