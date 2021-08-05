package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassSansProvider
  extends StObject
     with InjectableProvider {
  
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[js.Any]
}
object ClassSansProvider {
  
  inline def apply(useClass: Type[js.Any]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSansProvider]
  }
  
  extension [Self <: ClassSansProvider](x: Self) {
    
    inline def setUseClass(value: Type[js.Any]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}
