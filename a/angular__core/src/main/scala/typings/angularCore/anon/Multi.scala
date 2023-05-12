package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multi extends StObject {
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var useValue: Any
}
object Multi {
  
  inline def apply(useValue: Any): Multi = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
