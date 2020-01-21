package typings.angularTouchspin.mod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchSpinOptions extends js.Object {
  var buttonDownClass: js.UndefOr[String] = js.undefined
  var buttonDownShow: js.UndefOr[Boolean] = js.undefined
  var buttonDownTxt: js.UndefOr[String] = js.undefined
  var buttonUpClass: js.UndefOr[String] = js.undefined
  var buttonUpShow: js.UndefOr[Boolean] = js.undefined
  var buttonUpTxt: js.UndefOr[String] = js.undefined
  var decimals: js.UndefOr[Double] = js.undefined
  var decimalsDelimiter: js.UndefOr[String] = js.undefined
  var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.undefined
   // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var mousewheel: js.UndefOr[Boolean] = js.undefined
  var postfix: js.UndefOr[String] = js.undefined
  var postfixExtraClass: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixExtraClass: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var stepInterval: js.UndefOr[Double] = js.undefined
  var stepIntervalDelay: js.UndefOr[Double] = js.undefined
  var verticalButtons: js.UndefOr[Boolean] = js.undefined
  var verticalDownClass: js.UndefOr[String] = js.undefined
  var verticalUpClass: js.UndefOr[String] = js.undefined
}

object ITouchSpinOptions {
  @scala.inline
  def apply(
    buttonDownClass: String = null,
    buttonDownShow: js.UndefOr[Boolean] = js.undefined,
    buttonDownTxt: String = null,
    buttonUpClass: String = null,
    buttonUpShow: js.UndefOr[Boolean] = js.undefined,
    buttonUpTxt: String = null,
    decimals: Int | Double = null,
    decimalsDelimiter: String = null,
    forceStepDivisibility: StepDivisibilityType = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    mousewheel: js.UndefOr[Boolean] = js.undefined,
    postfix: String = null,
    postfixExtraClass: String = null,
    prefix: String = null,
    prefixExtraClass: String = null,
    step: Int | Double = null,
    stepInterval: Int | Double = null,
    stepIntervalDelay: Int | Double = null,
    verticalButtons: js.UndefOr[Boolean] = js.undefined,
    verticalDownClass: String = null,
    verticalUpClass: String = null
  ): ITouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonDownClass != null) __obj.updateDynamic("buttonDownClass")(buttonDownClass.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonDownShow)) __obj.updateDynamic("buttonDownShow")(buttonDownShow.asInstanceOf[js.Any])
    if (buttonDownTxt != null) __obj.updateDynamic("buttonDownTxt")(buttonDownTxt.asInstanceOf[js.Any])
    if (buttonUpClass != null) __obj.updateDynamic("buttonUpClass")(buttonUpClass.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonUpShow)) __obj.updateDynamic("buttonUpShow")(buttonUpShow.asInstanceOf[js.Any])
    if (buttonUpTxt != null) __obj.updateDynamic("buttonUpTxt")(buttonUpTxt.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (decimalsDelimiter != null) __obj.updateDynamic("decimalsDelimiter")(decimalsDelimiter.asInstanceOf[js.Any])
    if (forceStepDivisibility != null) __obj.updateDynamic("forceStepDivisibility")(forceStepDivisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (postfixExtraClass != null) __obj.updateDynamic("postfixExtraClass")(postfixExtraClass.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixExtraClass != null) __obj.updateDynamic("prefixExtraClass")(prefixExtraClass.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepInterval != null) __obj.updateDynamic("stepInterval")(stepInterval.asInstanceOf[js.Any])
    if (stepIntervalDelay != null) __obj.updateDynamic("stepIntervalDelay")(stepIntervalDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalButtons)) __obj.updateDynamic("verticalButtons")(verticalButtons.asInstanceOf[js.Any])
    if (verticalDownClass != null) __obj.updateDynamic("verticalDownClass")(verticalDownClass.asInstanceOf[js.Any])
    if (verticalUpClass != null) __obj.updateDynamic("verticalUpClass")(verticalUpClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchSpinOptions]
  }
}

