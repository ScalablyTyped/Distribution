package typings.angularDashTouchspin.angularDashTouchspinMod.angularTouchspinNs

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
    if (buttonDownClass != null) __obj.updateDynamic("buttonDownClass")(buttonDownClass)
    if (!js.isUndefined(buttonDownShow)) __obj.updateDynamic("buttonDownShow")(buttonDownShow)
    if (buttonDownTxt != null) __obj.updateDynamic("buttonDownTxt")(buttonDownTxt)
    if (buttonUpClass != null) __obj.updateDynamic("buttonUpClass")(buttonUpClass)
    if (!js.isUndefined(buttonUpShow)) __obj.updateDynamic("buttonUpShow")(buttonUpShow)
    if (buttonUpTxt != null) __obj.updateDynamic("buttonUpTxt")(buttonUpTxt)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (decimalsDelimiter != null) __obj.updateDynamic("decimalsDelimiter")(decimalsDelimiter)
    if (forceStepDivisibility != null) __obj.updateDynamic("forceStepDivisibility")(forceStepDivisibility)
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel)
    if (postfix != null) __obj.updateDynamic("postfix")(postfix)
    if (postfixExtraClass != null) __obj.updateDynamic("postfixExtraClass")(postfixExtraClass)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixExtraClass != null) __obj.updateDynamic("prefixExtraClass")(prefixExtraClass)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepInterval != null) __obj.updateDynamic("stepInterval")(stepInterval.asInstanceOf[js.Any])
    if (stepIntervalDelay != null) __obj.updateDynamic("stepIntervalDelay")(stepIntervalDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalButtons)) __obj.updateDynamic("verticalButtons")(verticalButtons)
    if (verticalDownClass != null) __obj.updateDynamic("verticalDownClass")(verticalDownClass)
    if (verticalUpClass != null) __obj.updateDynamic("verticalUpClass")(verticalUpClass)
    __obj.asInstanceOf[ITouchSpinOptions]
  }
}

