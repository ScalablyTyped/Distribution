package typings.atAntDashDesignProDashLayout.libSettingDrawerMod

import typings.atAntDashDesignProDashLayout.MergerSettingsTypeSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingDrawerProps extends js.Object {
  var collapse: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Any] = js.undefined
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
  var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeSettings, Unit]] = js.undefined
  var settings: MergerSettingsTypeSettings
}

object SettingDrawerProps {
  @scala.inline
  def apply(
    settings: MergerSettingsTypeSettings,
    collapse: js.UndefOr[Boolean] = js.undefined,
    getContainer: js.Any = null,
    onCollapseChange: /* collapse */ Boolean => Unit = null,
    onSettingChange: /* settings */ MergerSettingsTypeSettings => Unit = null
  ): SettingDrawerProps = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (onCollapseChange != null) __obj.updateDynamic("onCollapseChange")(js.Any.fromFunction1(onCollapseChange))
    if (onSettingChange != null) __obj.updateDynamic("onSettingChange")(js.Any.fromFunction1(onSettingChange))
    __obj.asInstanceOf[SettingDrawerProps]
  }
}

