package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.INgModelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownConfigNgOptions extends INgModelOptions

object IDropdownConfigNgOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[Boolean] = js.undefined,
    debounce: Double | StringDictionary[Double] = null,
    getterSetter: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    updateOn: String = null
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

