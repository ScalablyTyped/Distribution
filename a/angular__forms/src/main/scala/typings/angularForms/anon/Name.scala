package typings.angularForms.anon

import typings.angularForms.angularFormsStrings.formArrayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: formArrayName
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "formArrayName")
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: formArrayName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
