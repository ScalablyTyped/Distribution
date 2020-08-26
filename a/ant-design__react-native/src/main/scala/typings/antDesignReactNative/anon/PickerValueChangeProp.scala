package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerValueChangeProp extends js.Object {
  var pickerValueChangeProp: String = js.native
  var pickerValueProp: String = js.native
}

object PickerValueChangeProp {
  @scala.inline
  def apply(pickerValueChangeProp: String, pickerValueProp: String): PickerValueChangeProp = {
    val __obj = js.Dynamic.literal(pickerValueChangeProp = pickerValueChangeProp.asInstanceOf[js.Any], pickerValueProp = pickerValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerValueChangeProp]
  }
  @scala.inline
  implicit class PickerValueChangePropOps[Self <: PickerValueChangeProp] (val x: Self) extends AnyVal {
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
    def setPickerValueChangeProp(value: String): Self = this.set("pickerValueChangeProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickerValueProp(value: String): Self = this.set("pickerValueProp", value.asInstanceOf[js.Any])
  }
  
}

