package typings.antDesignReactNative.popupMod

import typings.antDesignReactNative.popupPickerTypesMod.PopupPickerProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupDatePickerProps extends PopupPickerProps {
  
  var date: js.UndefOr[js.Any] = js.native
  
  var datePicker: ReactElement = js.native
  
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], Unit]] = js.native
}
object PopupDatePickerProps {
  
  @scala.inline
  def apply(datePicker: ReactElement): PopupDatePickerProps = {
    val __obj = js.Dynamic.literal(datePicker = datePicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDatePickerProps]
  }
  
  @scala.inline
  implicit class PopupDatePickerPropsOps[Self <: PopupDatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setDatePicker(value: ReactElement): Self = this.set("datePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* date */ js.UndefOr[js.Any] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
}
