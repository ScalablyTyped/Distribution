package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControlName extends StObject {
  
  var formControlName: "formControlName"
  
  var name: "name"
  
  var value: "value"
}
object FormControlName {
  
  inline def apply(): FormControlName = {
    val __obj = js.Dynamic.literal(formControlName = "formControlName", name = "name", value = "value")
    __obj.asInstanceOf[FormControlName]
  }
  
  extension [Self <: FormControlName](x: Self) {
    
    inline def setFormControlName(value: "formControlName"): Self = StObject.set(x, "formControlName", value.asInstanceOf[js.Any])
    
    inline def setName(value: "name"): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: "value"): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
