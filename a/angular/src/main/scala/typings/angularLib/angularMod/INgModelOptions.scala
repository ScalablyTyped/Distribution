package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
trait INgModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[scala.Boolean] = js.undefined
  var debounce: js.UndefOr[scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var getterSetter: js.UndefOr[scala.Boolean] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var updateOn: js.UndefOr[java.lang.String] = js.undefined
}

object INgModelOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    debounce: scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    getterSetter: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: java.lang.String = null,
    updateOn: java.lang.String = null
  ): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(getterSetter)) __obj.updateDynamic("getterSetter")(getterSetter)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn)
    __obj.asInstanceOf[INgModelOptions]
  }
}

