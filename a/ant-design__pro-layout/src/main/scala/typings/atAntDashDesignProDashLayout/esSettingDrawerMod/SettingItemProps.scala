package typings.atAntDashDesignProDashLayout.esSettingDrawerMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingItemProps extends js.Object {
  var action: ReactElement
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledReason: js.UndefOr[ReactNode] = js.undefined
  var title: ReactNode
}

object SettingItemProps {
  @scala.inline
  def apply(
    action: ReactElement,
    title: ReactNode,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledReason: ReactNode = null
  ): SettingItemProps = {
    val __obj = js.Dynamic.literal(action = action, title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
}

