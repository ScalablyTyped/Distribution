package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownConfigNgOptions
  extends angularLib.angularMod.INgModelOptions

object IDropdownConfigNgOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    getterSetter: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: java.lang.String = null,
    updateOn: java.lang.String = null
  ): IDropdownConfigNgOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(getterSetter)) __obj.updateDynamic("getterSetter")(getterSetter)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn)
    __obj.asInstanceOf[IDropdownConfigNgOptions]
  }
}

