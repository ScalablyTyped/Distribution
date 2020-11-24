package typings.antd.checkboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxGroupContext extends js.Object {
  
  def cancelValue(`val`: String): Unit = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  def registerValue(`val`: String): Unit = js.native
  
  var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object CheckboxGroupContext {
  
  @scala.inline
  def apply(cancelValue: String => Unit, registerValue: String => Unit): CheckboxGroupContext = {
    val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue))
    __obj.asInstanceOf[CheckboxGroupContext]
  }
  
  @scala.inline
  implicit class CheckboxGroupContextOps[Self <: CheckboxGroupContext] (val x: Self) extends AnyVal {
    
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
    def setCancelValue(value: String => Unit): Self = this.set("cancelValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterValue(value: String => Unit): Self = this.set("registerValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setToggleOption(value: /* option */ CheckboxOptionType => Unit): Self = this.set("toggleOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleOption: Self = this.set("toggleOption", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
