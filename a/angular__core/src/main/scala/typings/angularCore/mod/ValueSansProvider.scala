package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSansProvider
  extends StObject
     with InjectableProvider {
  
  /**
    * The value to inject.
    */
  var useValue: Any
}
object ValueSansProvider {
  
  inline def apply(useValue: Any): ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSansProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSansProvider] (val x: Self) extends AnyVal {
    
    inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
  }
}
