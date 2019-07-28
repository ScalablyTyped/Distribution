package typings.atAntDashDesignProDashLayout.libSettingDrawerMod

import typings.atAntDashDesignProDashLayout.MergerSettingsTypeSettingsAutoHideHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingDrawerProps extends js.Object {
  var collapse: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Any] = js.undefined
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
  var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeSettingsAutoHideHeader, Unit]] = js.undefined
  var settings: MergerSettingsTypeSettingsAutoHideHeader
}

object SettingDrawerProps {
  @scala.inline
  def apply(
    settings: MergerSettingsTypeSettingsAutoHideHeader,
    collapse: js.UndefOr[Boolean] = js.undefined,
    getContainer: js.Any = null,
    onCollapseChange: /* collapse */ Boolean => Unit = null,
    onSettingChange: /* settings */ MergerSettingsTypeSettingsAutoHideHeader => Unit = null
  ): SettingDrawerProps = {
    val __obj = js.Dynamic.literal(settings = settings)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer)
    if (onCollapseChange != null) __obj.updateDynamic("onCollapseChange")(js.Any.fromFunction1(onCollapseChange))
    if (onSettingChange != null) __obj.updateDynamic("onSettingChange")(js.Any.fromFunction1(onSettingChange))
    __obj.asInstanceOf[SettingDrawerProps]
  }
}

