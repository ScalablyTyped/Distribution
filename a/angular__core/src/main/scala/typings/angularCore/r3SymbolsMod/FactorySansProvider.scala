package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value by invoking a `useFactory` function.
  *
  * @see `FactoryProvider`
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait FactorySansProvider extends StObject {
  
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
  
  @scala.inline
  def apply(useFactory: js.Function): FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorySansProvider]
  }
  
  @scala.inline
  implicit class FactorySansProviderMutableBuilder[Self <: FactorySansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
  }
}
