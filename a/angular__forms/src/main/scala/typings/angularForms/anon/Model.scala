package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.disabled_
import typings.angularForms.angularFormsStrings.name
import typings.angularForms.angularFormsStrings.ngModel
import typings.angularForms.angularFormsStrings.ngModelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var isDisabled: disabled_
  
  var model: ngModel
  
  var name: typings.angularForms.angularFormsStrings.name
  
  var options: ngModelOptions
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal(isDisabled = "disabled", model = "ngModel", name = "name", options = "ngModelOptions")
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: disabled_): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: ngModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ngModelOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
