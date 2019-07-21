package typings
package atAntDashDesignProDashLayoutLib.esSettingDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/defaultSettings.Settings[P]} */ trait SettingDrawerState
  extends atAntDashDesignProDashLayoutLib.Anon_ColorWeak {
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object SettingDrawerState {
  @scala.inline
  def apply(
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    colorWeak: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    primaryColor: java.lang.String = null
  ): SettingDrawerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak)
    if (language != null) __obj.updateDynamic("language")(language)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.asInstanceOf[SettingDrawerState]
  }
}

