package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupFunctions extends js.Object {
  
  def bindingBehaviors(name: String): js.Any = js.native
  
  def valueConverters(name: String): js.Any = js.native
}
object LookupFunctions {
  
  @scala.inline
  def apply(bindingBehaviors: String => js.Any, valueConverters: String => js.Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
    __obj.asInstanceOf[LookupFunctions]
  }
  
  @scala.inline
  implicit class LookupFunctionsOps[Self <: LookupFunctions] (val x: Self) extends AnyVal {
    
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
    def setBindingBehaviors(value: String => js.Any): Self = this.set("bindingBehaviors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueConverters(value: String => js.Any): Self = this.set("valueConverters", js.Any.fromFunction1(value))
  }
}
