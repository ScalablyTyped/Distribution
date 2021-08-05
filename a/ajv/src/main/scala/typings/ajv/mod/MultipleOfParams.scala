package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleOfParams
  extends StObject
     with ErrorParameters {
  
  var multipleOf: Double
}
object MultipleOfParams {
  
  inline def apply(multipleOf: Double): MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOfParams]
  }
  
  extension [Self <: MultipleOfParams](x: Self) {
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
  }
}
