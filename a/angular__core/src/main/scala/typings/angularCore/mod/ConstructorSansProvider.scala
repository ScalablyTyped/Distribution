package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorSansProvider
  extends StObject
     with InjectableProvider {
  
  /**
    * A list of `token`s to be resolved by the injector.
    */
  var deps: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ConstructorSansProvider {
  
  inline def apply(): ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorSansProvider]
  }
  
  extension [Self <: ConstructorSansProvider](x: Self) {
    
    inline def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
  }
}
