package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxContains extends StObject {
  
  var maxContains: js.UndefOr[Double] = js.undefined
  
  var minContains: Double
}
object MaxContains {
  
  inline def apply(minContains: Double): MaxContains = {
    val __obj = js.Dynamic.literal(minContains = minContains.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxContains]
  }
  
  extension [Self <: MaxContains](x: Self) {
    
    inline def setMaxContains(value: Double): Self = StObject.set(x, "maxContains", value.asInstanceOf[js.Any])
    
    inline def setMaxContainsUndefined: Self = StObject.set(x, "maxContains", js.undefined)
    
    inline def setMinContains(value: Double): Self = StObject.set(x, "minContains", value.asInstanceOf[js.Any])
  }
}
