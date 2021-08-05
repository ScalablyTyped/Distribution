package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.ValueSansProvider
  - typings.angularCore.mod.ExistingSansProvider
  - typings.angularCore.mod.StaticClassSansProvider
  - typings.angularCore.mod.ConstructorSansProvider
  - typings.angularCore.mod.FactorySansProvider
  - typings.angularCore.mod.ClassSansProvider
*/
trait InjectableProvider extends StObject
object InjectableProvider {
  
  inline def ClassSansProvider(useClass: Type[js.Any]): typings.angularCore.mod.ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ClassSansProvider]
  }
  
  inline def ConstructorSansProvider(): typings.angularCore.mod.ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.angularCore.mod.ConstructorSansProvider]
  }
  
  inline def ExistingSansProvider(useExisting: js.Any): typings.angularCore.mod.ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ExistingSansProvider]
  }
  
  inline def FactorySansProvider(useFactory: js.Function): typings.angularCore.mod.FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.FactorySansProvider]
  }
  
  inline def StaticClassSansProvider(deps: js.Array[js.Any], useClass: Type[js.Any]): typings.angularCore.mod.StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.StaticClassSansProvider]
  }
  
  inline def ValueSansProvider(useValue: js.Any): typings.angularCore.mod.ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ValueSansProvider]
  }
}
