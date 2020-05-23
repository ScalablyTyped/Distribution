package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimepickerConfig extends js.Object {
  /**
    * Whether the user can use up/down arrowkeys inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var arrowkeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of hours to increase or decrease when using a button.
    *
    * @default 1
    */
  var hourStep: js.UndefOr[Double] = js.undefined
  /**
    * Meridian labels based on locale. To override you must supply an array like ['AM', 'PM'].
    *
    * @default null
    */
  var meridians: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Number of minutes to increase or decrease when using a button.
    *
    * @default 1
    */
  var minuteStep: js.UndefOr[Double] = js.undefined
  /**
    * Whether the user can scroll inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var mousewheel: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the user can type inside the hours & minutes input.
    *
    * @default false
    */
  var readonlyInput: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of seconds to increase or decrease when using a button.
    *
    * @default 1
    */
  var secondStep: js.UndefOr[Double] = js.undefined
  /**
    * Whether to display 12H or 24H mode.
    *
    * @default true
    */
  var showMeridian: js.UndefOr[Boolean] = js.undefined
  /**
    * Show seconds input.
    *
    * @default false
    */
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows spinner arrows above and below the inputs.
    *
    * @default true
    */
  var showSpinners: js.UndefOr[Boolean] = js.undefined
  /**
    * Add the ability to override the template used on the component.
    *
    * @default 'uib/template/timepicker/timepicker.html'
    */
  var templateUrl: js.UndefOr[String] = js.undefined
}

object ITimepickerConfig {
  @scala.inline
  def apply(
    arrowkeys: js.UndefOr[Boolean] = js.undefined,
    hourStep: js.UndefOr[Double] = js.undefined,
    meridians: js.Array[String] = null,
    minuteStep: js.UndefOr[Double] = js.undefined,
    mousewheel: js.UndefOr[Boolean] = js.undefined,
    readonlyInput: js.UndefOr[Boolean] = js.undefined,
    secondStep: js.UndefOr[Double] = js.undefined,
    showMeridian: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    showSpinners: js.UndefOr[Boolean] = js.undefined,
    templateUrl: String = null
  ): ITimepickerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowkeys)) __obj.updateDynamic("arrowkeys")(arrowkeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourStep)) __obj.updateDynamic("hourStep")(hourStep.get.asInstanceOf[js.Any])
    if (meridians != null) __obj.updateDynamic("meridians")(meridians.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonlyInput)) __obj.updateDynamic("readonlyInput")(readonlyInput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondStep)) __obj.updateDynamic("secondStep")(secondStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpinners)) __obj.updateDynamic("showSpinners")(showSpinners.get.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimepickerConfig]
  }
}

