package typings.angular.mod

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
  /**
    * Defines if the time and datetime-local types should show seconds and milliseconds.
    * The option follows the format string of date filter.
    * By default, the options is undefined which is equal to 'ss.sss' (seconds and milliseconds)
    */
  var timeSecondsFormat: js.UndefOr[String] = js.undefined
  /**
    * Defines if the time and datetime-local types should strip the seconds and milliseconds
    * from the formatted value if they are zero. This option is applied after `timeSecondsFormat`
    */
  var timeStripZeroSeconds: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var updateOn: js.UndefOr[String] = js.undefined
}

object INgModelOptions {
  @scala.inline
  def apply(
    allowInvalid: js.UndefOr[Boolean] = js.undefined,
    debounce: Double | StringDictionary[Double] = null,
    getterSetter: js.UndefOr[Boolean] = js.undefined,
    timeSecondsFormat: String = null,
    timeStripZeroSeconds: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    updateOn: String = null
  ): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid.get.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (!js.isUndefined(getterSetter)) __obj.updateDynamic("getterSetter")(getterSetter.get.asInstanceOf[js.Any])
    if (timeSecondsFormat != null) __obj.updateDynamic("timeSecondsFormat")(timeSecondsFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStripZeroSeconds)) __obj.updateDynamic("timeStripZeroSeconds")(timeStripZeroSeconds.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgModelOptions]
  }
}

