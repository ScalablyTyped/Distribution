package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnevaluatedProperty extends StObject {
  
  var unevaluatedProperty: String
}
object UnevaluatedProperty {
  
  inline def apply(unevaluatedProperty: String): UnevaluatedProperty = {
    val __obj = js.Dynamic.literal(unevaluatedProperty = unevaluatedProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnevaluatedProperty]
  }
  
  extension [Self <: UnevaluatedProperty](x: Self) {
    
    inline def setUnevaluatedProperty(value: String): Self = StObject.set(x, "unevaluatedProperty", value.asInstanceOf[js.Any])
  }
}
