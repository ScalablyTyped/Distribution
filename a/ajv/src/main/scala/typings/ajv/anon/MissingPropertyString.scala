package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingPropertyString extends StObject {
  
  var missingProperty: String
}
object MissingPropertyString {
  
  inline def apply(missingProperty: String): MissingPropertyString = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingPropertyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingPropertyString] (val x: Self) extends AnyVal {
    
    inline def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
  }
}
