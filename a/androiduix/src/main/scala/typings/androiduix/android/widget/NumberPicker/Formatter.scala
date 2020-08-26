package typings.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatter extends js.Object {
  def format(value: Double): String = js.native
}

object Formatter {
  @scala.inline
  def apply(format: Double => String): Formatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
    __obj.asInstanceOf[Formatter]
  }
  @scala.inline
  implicit class FormatterOps[Self <: Formatter] (val x: Self) extends AnyVal {
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
    def setFormat(value: Double => String): Self = this.set("format", js.Any.fromFunction1(value))
  }
  
}

