package typings
package atAntDashDesignProDashLayoutLib.esSettingDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingDrawerProps extends js.Object {
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  var getContainer: js.UndefOr[js.Any] = js.undefined
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ scala.Boolean, scala.Unit]] = js.undefined
  var onSettingChange: js.UndefOr[
    js.Function1[
      /* settings */ MergerSettingsType[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.Settings], 
      scala.Unit
    ]
  ] = js.undefined
  var settings: MergerSettingsType[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.Settings]
}

object SettingDrawerProps {
  @scala.inline
  def apply(
    settings: MergerSettingsType[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.Settings],
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    getContainer: js.Any = null,
    onCollapseChange: /* collapse */ scala.Boolean => scala.Unit = null,
    onSettingChange: /* settings */ MergerSettingsType[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.Settings] => scala.Unit = null
  ): SettingDrawerProps = {
    val __obj = js.Dynamic.literal(settings = settings)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer)
    if (onCollapseChange != null) __obj.updateDynamic("onCollapseChange")(js.Any.fromFunction1(onCollapseChange))
    if (onSettingChange != null) __obj.updateDynamic("onSettingChange")(js.Any.fromFunction1(onSettingChange))
    __obj.asInstanceOf[SettingDrawerProps]
  }
}

