package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactorySansProvider
  extends StObject
     with InjectableProvider {
  
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useFactory` function.
    */
  var deps: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * A function to invoke to create a value for this `token`. The function is invoked with
    * resolved values of `token`s in the `deps` field.
    */
  var useFactory: js.Function
}
object FactorySansProvider {
  
  inline def apply(useFactory: js.Function): FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorySansProvider]
  }
  
  extension [Self <: FactorySansProvider](x: Self) {
    
    inline def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
  }
}
