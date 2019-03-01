package typings
package angularDashTouchspinLib.angularDashTouchspinMod.angularTouchspinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchSpinOptions extends js.Object {
  var buttonDownClass: js.UndefOr[java.lang.String] = js.undefined
  var buttonDownShow: js.UndefOr[scala.Boolean] = js.undefined
  var buttonDownTxt: js.UndefOr[java.lang.String] = js.undefined
  var buttonUpClass: js.UndefOr[java.lang.String] = js.undefined
  var buttonUpShow: js.UndefOr[scala.Boolean] = js.undefined
  var buttonUpTxt: js.UndefOr[java.lang.String] = js.undefined
  var decimals: js.UndefOr[scala.Double] = js.undefined
  var decimalsDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.undefined
   // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
  var inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var mousewheel: js.UndefOr[scala.Boolean] = js.undefined
  var postfix: js.UndefOr[java.lang.String] = js.undefined
  var postfixExtraClass: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var prefixExtraClass: js.UndefOr[java.lang.String] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var stepInterval: js.UndefOr[scala.Double] = js.undefined
  var stepIntervalDelay: js.UndefOr[scala.Double] = js.undefined
  var verticalButtons: js.UndefOr[scala.Boolean] = js.undefined
  var verticalDownClass: js.UndefOr[java.lang.String] = js.undefined
  var verticalUpClass: js.UndefOr[java.lang.String] = js.undefined
}

object ITouchSpinOptions {
  @scala.inline
  def apply(
    buttonDownClass: java.lang.String = null,
    buttonDownShow: js.UndefOr[scala.Boolean] = js.undefined,
    buttonDownTxt: java.lang.String = null,
    buttonUpClass: java.lang.String = null,
    buttonUpShow: js.UndefOr[scala.Boolean] = js.undefined,
    buttonUpTxt: java.lang.String = null,
    decimals: scala.Int | scala.Double = null,
    decimalsDelimiter: java.lang.String = null,
    forceStepDivisibility: StepDivisibilityType = null,
    inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    mousewheel: js.UndefOr[scala.Boolean] = js.undefined,
    postfix: java.lang.String = null,
    postfixExtraClass: java.lang.String = null,
    prefix: java.lang.String = null,
    prefixExtraClass: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    stepInterval: scala.Int | scala.Double = null,
    stepIntervalDelay: scala.Int | scala.Double = null,
    verticalButtons: js.UndefOr[scala.Boolean] = js.undefined,
    verticalDownClass: java.lang.String = null,
    verticalUpClass: java.lang.String = null
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

