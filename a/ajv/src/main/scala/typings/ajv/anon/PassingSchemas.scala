package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassingSchemas extends StObject {
  
  var passingSchemas: (js.Tuple2[Double, Double]) | Null
}
object PassingSchemas {
  
  inline def apply(): PassingSchemas = {
    val __obj = js.Dynamic.literal(passingSchemas = null)
    __obj.asInstanceOf[PassingSchemas]
  }
  
  extension [Self <: PassingSchemas](x: Self) {
    
    inline def setPassingSchemas(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "passingSchemas", value.asInstanceOf[js.Any])
    
    inline def setPassingSchemasNull: Self = StObject.set(x, "passingSchemas", null)
  }
}
