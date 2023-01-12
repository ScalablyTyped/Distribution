package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.disabled_
import typings.angularForms.angularFormsStrings.formControlName
import typings.angularForms.angularFormsStrings.ngModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  var isDisabled: disabled_
  
  var model: ngModel
  
  var name: formControlName
}
object IsDisabled {
  
  inline def apply(): IsDisabled = {
    val __obj = js.Dynamic.literal(isDisabled = "disabled", model = "ngModel", name = "formControlName")
    __obj.asInstanceOf[IsDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDisabled] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: disabled_): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: ngModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setName(value: formControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
