package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingPropertyName(value: String): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingPropertyNameUndefined: Self = StObject.set(x, "bindingPropertyName", js.undefined)
  }
}
