package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: AliasRequired
  
  var isDisabled: `1`
  
  var model: `2`
}
object Form {
  
  inline def apply(form: AliasRequired, isDisabled: `1`, model: `2`): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
    
    inline def setForm(value: AliasRequired): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: `1`): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: `2`): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
