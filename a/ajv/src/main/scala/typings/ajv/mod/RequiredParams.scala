package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredParams
  extends StObject
     with ErrorParameters {
  
  var missingProperty: String
}
object RequiredParams {
  
  inline def apply(missingProperty: String): RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredParams]
  }
  
  extension [Self <: RequiredParams](x: Self) {
    
    inline def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
  }
}
