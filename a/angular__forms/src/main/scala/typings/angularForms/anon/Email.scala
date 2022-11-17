package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: "email"
}
object Email {
  
  inline def apply(): Email = {
    val __obj = js.Dynamic.literal(email = "email")
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: "email"): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
