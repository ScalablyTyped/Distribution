package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

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
    hourStep: Int | Double = null,
    meridians: js.Array[String] = null,
    minuteStep: Int | Double = null,
    mousewheel: js.UndefOr[Boolean] = js.undefined,
    readonlyInput: js.UndefOr[Boolean] = js.undefined,
    secondStep: Int | Double = null,
    showMeridian: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    showSpinners: js.UndefOr[Boolean] = js.undefined,
    templateUrl: String = null
  ): ITimepickerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowkeys)) __obj.updateDynamic("arrowkeys")(arrowkeys.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (meridians != null) __obj.updateDynamic("meridians")(meridians.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (!js.isUndefined(readonlyInput)) __obj.updateDynamic("readonlyInput")(readonlyInput.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(showSpinners)) __obj.updateDynamic("showSpinners")(showSpinners.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimepickerConfig]
  }
}

