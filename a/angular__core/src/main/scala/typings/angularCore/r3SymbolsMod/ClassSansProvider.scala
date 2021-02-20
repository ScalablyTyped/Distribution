package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value by invoking a `useClass` function.
  * Base for `ClassProvider` decorator.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
@js.native
trait ClassSansProvider extends StObject {
  
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[_] = js.native
}
object ClassSansProvider {
  
  @scala.inline
  def apply(useClass: Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSansProvider]
  }
  
  @scala.inline
  implicit class ClassSansProviderMutableBuilder[Self <: ClassSansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseClass(value: Type[_]): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
  }
}
