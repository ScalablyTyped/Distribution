package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: Alias
}
object Email {
  
  inline def apply(email: Alias): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: Alias): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
