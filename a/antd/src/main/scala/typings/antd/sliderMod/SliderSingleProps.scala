package typings.antd.sliderMod

import typings.antd.antdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderSingleProps extends SliderBaseProps {
  var defaultValue: js.UndefOr[Double] = js.native
  var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var range: js.UndefOr[`false`] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SliderSingleProps {
  @scala.inline
  def apply(): SliderSingleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderSingleProps]
  }
  @scala.inline
  implicit class SliderSinglePropsOps[Self <: SliderSingleProps] (val x: Self) extends AnyVal {
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
    def setOnAfterChange(value: /* value */ Double => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRange(value: `false`): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

