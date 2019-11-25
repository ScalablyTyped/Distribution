package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
trait INgModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[Boolean] = js.undefined
  var debounce: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  var getterSetter: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var updateOn: js.UndefOr[String] = js.undefined
}

object INgModelOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[Boolean] = js.undefined,
    debounce: Double | StringDictionary[Double] = null,
    getterSetter: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    updateOn: String = null
  ): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(getterSetter)) __obj.updateDynamic("getterSetter")(getterSetter.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgModelOptions]
  }
}

