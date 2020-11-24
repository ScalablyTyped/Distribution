package typings.angularCompiler.t2ApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputOutputPropertySet extends js.Object {
  
  def hasBindingPropertyName(propertyName: String): Boolean = js.native
}
object InputOutputPropertySet {
  
  @scala.inline
  def apply(hasBindingPropertyName: String => Boolean): InputOutputPropertySet = {
    val __obj = js.Dynamic.literal(hasBindingPropertyName = js.Any.fromFunction1(hasBindingPropertyName))
    __obj.asInstanceOf[InputOutputPropertySet]
  }
  
  @scala.inline
  implicit class InputOutputPropertySetOps[Self <: InputOutputPropertySet] (val x: Self) extends AnyVal {
    
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
    def setHasBindingPropertyName(value: String => Boolean): Self = this.set("hasBindingPropertyName", js.Any.fromFunction1(value))
  }
}
