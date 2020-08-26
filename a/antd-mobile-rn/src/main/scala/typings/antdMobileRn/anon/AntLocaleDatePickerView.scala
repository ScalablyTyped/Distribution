package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntLocaleDatePickerView extends js.Object {
  var antLocale: DatePickerView = js.native
}

object AntLocaleDatePickerView {
  @scala.inline
  def apply(antLocale: DatePickerView): AntLocaleDatePickerView = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleDatePickerView]
  }
  @scala.inline
  implicit class AntLocaleDatePickerViewOps[Self <: AntLocaleDatePickerView] (val x: Self) extends AnyVal {
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
    def setAntLocale(value: DatePickerView): Self = this.set("antLocale", value.asInstanceOf[js.Any])
  }
  
}

