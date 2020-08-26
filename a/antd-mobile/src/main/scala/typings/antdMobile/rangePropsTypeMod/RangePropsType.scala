package typings.antdMobile.rangePropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangePropsType extends js.Object {
  var defaultValue: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  var step: js.UndefOr[Double] = js.native
  var tipFormatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], ReactNode]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object RangePropsType {
  @scala.inline
  def apply(): RangePropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePropsType]
  }
  @scala.inline
  implicit class RangePropsTypeOps[Self <: RangePropsType] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnAfterChange(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTipFormatter: Self = this.set("tipFormatter", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

