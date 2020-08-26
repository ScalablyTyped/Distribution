package typings.antDesignReactNative.inputNumberMod

import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.stepperStyleMod.StepperStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumberProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var keyboardType: js.UndefOr[js.Any] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onBlur: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  var parser: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[String | Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]] = js.native
  var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object InputNumberProps {
  @scala.inline
  def apply(styles: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]): InputNumberProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberProps]
  }
  @scala.inline
  implicit class InputNumberPropsOps[Self <: InputNumberProps] (val x: Self) extends AnyVal {
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
    def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, StepperStyle]]): Self = this.set("styles", value.asInstanceOf[js.Any])
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
    def setKeyboardType(value: js.Any): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnBlur(value: (/* e */ js.Any, /* repeated */ js.Any) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setParser(value: /* v */ js.Any => Unit): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStep(value: String | Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
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

