package typings.angularTouchspin.mod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchSpinOptions extends js.Object {
  var buttonDownClass: js.UndefOr[String] = js.native
  var buttonDownShow: js.UndefOr[Boolean] = js.native
  var buttonDownTxt: js.UndefOr[String] = js.native
  var buttonUpClass: js.UndefOr[String] = js.native
  var buttonUpShow: js.UndefOr[Boolean] = js.native
  var buttonUpTxt: js.UndefOr[String] = js.native
  var decimals: js.UndefOr[Double] = js.native
  var decimalsDelimiter: js.UndefOr[String] = js.native
  var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.native
   // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var mousewheel: js.UndefOr[Boolean] = js.native
  var postfix: js.UndefOr[String] = js.native
  var postfixExtraClass: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prefixExtraClass: js.UndefOr[String] = js.native
  var step: js.UndefOr[Double] = js.native
  var stepInterval: js.UndefOr[Double] = js.native
  var stepIntervalDelay: js.UndefOr[Double] = js.native
  var verticalButtons: js.UndefOr[Boolean] = js.native
  var verticalDownClass: js.UndefOr[String] = js.native
  var verticalUpClass: js.UndefOr[String] = js.native
}

object ITouchSpinOptions {
  @scala.inline
  def apply(): ITouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITouchSpinOptions]
  }
  @scala.inline
  implicit class ITouchSpinOptionsOps[Self <: ITouchSpinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButtonDownClass(value: String): Self = this.set("buttonDownClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDownClass: Self = this.set("buttonDownClass", js.undefined)
    @scala.inline
    def setButtonDownShow(value: Boolean): Self = this.set("buttonDownShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDownShow: Self = this.set("buttonDownShow", js.undefined)
    @scala.inline
    def setButtonDownTxt(value: String): Self = this.set("buttonDownTxt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDownTxt: Self = this.set("buttonDownTxt", js.undefined)
    @scala.inline
    def setButtonUpClass(value: String): Self = this.set("buttonUpClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonUpClass: Self = this.set("buttonUpClass", js.undefined)
    @scala.inline
    def setButtonUpShow(value: Boolean): Self = this.set("buttonUpShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonUpShow: Self = this.set("buttonUpShow", js.undefined)
    @scala.inline
    def setButtonUpTxt(value: String): Self = this.set("buttonUpTxt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonUpTxt: Self = this.set("buttonUpTxt", js.undefined)
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setDecimalsDelimiter(value: String): Self = this.set("decimalsDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalsDelimiter: Self = this.set("decimalsDelimiter", js.undefined)
    @scala.inline
    def setForceStepDivisibility(value: StepDivisibilityType): Self = this.set("forceStepDivisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceStepDivisibility: Self = this.set("forceStepDivisibility", js.undefined)
    @scala.inline
    def setInputReadOnly(value: Boolean): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputReadOnly: Self = this.set("inputReadOnly", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMousewheel(value: Boolean): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPostfixExtraClass(value: String): Self = this.set("postfixExtraClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfixExtraClass: Self = this.set("postfixExtraClass", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixExtraClass(value: String): Self = this.set("prefixExtraClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixExtraClass: Self = this.set("prefixExtraClass", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepInterval(value: Double): Self = this.set("stepInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepInterval: Self = this.set("stepInterval", js.undefined)
    @scala.inline
    def setStepIntervalDelay(value: Double): Self = this.set("stepIntervalDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepIntervalDelay: Self = this.set("stepIntervalDelay", js.undefined)
    @scala.inline
    def setVerticalButtons(value: Boolean): Self = this.set("verticalButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalButtons: Self = this.set("verticalButtons", js.undefined)
    @scala.inline
    def setVerticalDownClass(value: String): Self = this.set("verticalDownClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalDownClass: Self = this.set("verticalDownClass", js.undefined)
    @scala.inline
    def setVerticalUpClass(value: String): Self = this.set("verticalUpClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalUpClass: Self = this.set("verticalUpClass", js.undefined)
  }
  
}

