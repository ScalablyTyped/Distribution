package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseValue extends StObject {
  
  var useValue: Any
}
object UseValue {
  
  inline def apply(useValue: Any): UseValue = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseValue]
  }
  
  extension [Self <: UseValue](x: Self) {
    
    inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
