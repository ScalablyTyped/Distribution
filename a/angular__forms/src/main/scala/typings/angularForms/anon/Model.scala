package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var isDisabled: "disabled"
  
  var model: "ngModel"
  
  var name: "name"
  
  var options: "ngModelOptions"
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal(isDisabled = "disabled", model = "ngModel", name = "name", options = "ngModelOptions")
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setIsDisabled(value: "disabled"): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: "ngModel"): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: "name"): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: "ngModelOptions"): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
