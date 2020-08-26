package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var max: Double = js.native
  var min: Double = js.native
  var onBlur: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onFocus: js.Function0[Unit] = js.native
  var parser: js.Function1[/* input */ String, String] = js.native
  var step: Double = js.native
}

object Max {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    parser: /* input */ String => String,
    step: Double
  ): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setParser(value: /* input */ String => String): Self = this.set("parser", js.Any.fromFunction1(value))
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

