package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.formGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var form: formGroup
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(form = "formGroup")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setForm(value: formGroup): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
