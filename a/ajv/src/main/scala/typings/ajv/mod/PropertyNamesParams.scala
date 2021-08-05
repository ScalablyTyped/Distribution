package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNamesParams
  extends StObject
     with ErrorParameters {
  
  var propertyName: String
}
object PropertyNamesParams {
  
  inline def apply(propertyName: String): PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNamesParams]
  }
  
  extension [Self <: PropertyNamesParams](x: Self) {
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
