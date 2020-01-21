package typings.antDesignProLayout.libSettingDrawerMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledReason: ReactNode = null,
    title: ReactNode = null
  ): SettingItemProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingItemProps]
  }
}

