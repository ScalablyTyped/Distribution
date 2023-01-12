package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.disabled_
import typings.angularForms.angularFormsStrings.formControl
import typings.angularForms.angularFormsStrings.ngModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: formControl
  
  var isDisabled: disabled_
  
  var model: ngModel
}
object Form {
  
  inline def apply(): Form = {
    val __obj = js.Dynamic.literal(form = "formControl", isDisabled = "disabled", model = "ngModel")
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setForm(value: formControl): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: disabled_): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: ngModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
