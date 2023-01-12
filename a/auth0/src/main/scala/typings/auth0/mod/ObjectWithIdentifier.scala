package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectWithIdentifier extends StObject {
  
  var identifier: String
}
object ObjectWithIdentifier {
  
  inline def apply(identifier: String): ObjectWithIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithIdentifier] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
