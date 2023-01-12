package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.maxlength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxlength extends StObject {
  
  var maxlength: typings.angularForms.angularFormsStrings.maxlength
}
object Maxlength {
  
  inline def apply(): Maxlength = {
    val __obj = js.Dynamic.literal(maxlength = "maxlength")
    __obj.asInstanceOf[Maxlength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maxlength] (val x: Self) extends AnyVal {
    
    inline def setMaxlength(value: maxlength): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
  }
}
