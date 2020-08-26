package typings.antDesignReactNative.stepperPropsTypeMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepPropsType extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object StepPropsType {
  @scala.inline
  def apply(): StepPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepPropsType]
  }
  @scala.inline
  implicit class StepPropsTypeOps[Self <: StepPropsType] (val x: Self) extends AnyVal {
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDownStyle(value: StyleProp[ViewStyle]): Self = this.set("downStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownStyle: Self = this.set("downStyle", js.undefined)
    @scala.inline
    def setDownStyleNull: Self = this.set("downStyle", null)
    @scala.inline
    def setInputStyle(value: StyleProp[TextStyle]): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setInputStyleNull: Self = this.set("inputStyle", null)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setUpStyle(value: StyleProp[ViewStyle]): Self = this.set("upStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpStyle: Self = this.set("upStyle", js.undefined)
    @scala.inline
    def setUpStyleNull: Self = this.set("upStyle", null)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

