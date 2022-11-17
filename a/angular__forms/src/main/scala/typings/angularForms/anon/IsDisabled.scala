package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var isDisabled: "disabled"
  
  var model: "ngModel"
  
  var name: "formControlName"
}
object IsDisabled {
  
  inline def apply(): IsDisabled = {
    val __obj = js.Dynamic.literal(isDisabled = "disabled", model = "ngModel", name = "formControlName")
    __obj.asInstanceOf[IsDisabled]
  }
  
  extension [Self <: IsDisabled](x: Self) {
    
    inline def setIsDisabled(value: "disabled"): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: "ngModel"): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: "formControlName"): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
