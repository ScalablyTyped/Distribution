package typings.antdMobileRn.datePickerViewPropsTypeMod

import typings.antdMobileRn.datePickerPropsTypeMod.DatePickerPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerProps extends DatePickerPropsType {
  
  var onScrollChange: js.UndefOr[js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.native
  
  /** rn only */
  var styles: js.UndefOr[js.Any] = js.native
  
  /** rn only */
  var triggerTypes: js.UndefOr[String] = js.native
}
object DatePickerProps {
  
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setOnScrollChange(value: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onScrollChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTriggerTypes(value: String): Self = this.set("triggerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerTypes: Self = this.set("triggerTypes", js.undefined)
  }
}
