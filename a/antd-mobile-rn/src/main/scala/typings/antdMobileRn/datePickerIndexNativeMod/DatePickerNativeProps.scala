package typings.antdMobileRn.datePickerIndexNativeMod

import typings.antdMobileRn.datePickerPropsTypeMod.DatePickerPropsType
import typings.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerNativeProps extends DatePickerPropsType {
  
  var styles: js.UndefOr[IPickerStyle] = js.native
  
  var triggerTypes: js.UndefOr[String] = js.native
}
object DatePickerNativeProps {
  
  @scala.inline
  def apply(): DatePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerNativeProps]
  }
  
  @scala.inline
  implicit class DatePickerNativePropsOps[Self <: DatePickerNativeProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: IPickerStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTriggerTypes(value: String): Self = this.set("triggerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerTypes: Self = this.set("triggerTypes", js.undefined)
  }
}
