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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseValue] (val x: Self) extends AnyVal {
    
    inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
