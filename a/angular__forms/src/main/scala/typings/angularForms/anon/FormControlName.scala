package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.formControlName
import typings.angularForms.angularFormsStrings.name
import typings.angularForms.angularFormsStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControlName extends StObject {
  
  var formControlName: typings.angularForms.angularFormsStrings.formControlName
  
  var name: typings.angularForms.angularFormsStrings.name
  
  var value: typings.angularForms.angularFormsStrings.value
}
object FormControlName {
  
  inline def apply(): FormControlName = {
    val __obj = js.Dynamic.literal(formControlName = "formControlName", name = "name", value = "value")
    __obj.asInstanceOf[FormControlName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormControlName] (val x: Self) extends AnyVal {
    
    inline def setFormControlName(value: formControlName): Self = StObject.set(x, "formControlName", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
