package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControlName extends StObject {
  
  var formControlName: `3`
  
  var name: `6`
  
  var value: `16`
}
object FormControlName {
  
  inline def apply(formControlName: `3`, name: `6`, value: `16`): FormControlName = {
    val __obj = js.Dynamic.literal(formControlName = formControlName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormControlName] (val x: Self) extends AnyVal {
    
    inline def setFormControlName(value: `3`): Self = StObject.set(x, "formControlName", value.asInstanceOf[js.Any])
    
    inline def setName(value: `6`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `16`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
