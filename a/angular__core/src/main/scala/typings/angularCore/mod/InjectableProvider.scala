package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.mod.ValueSansProvider
  - typings.angularCore.mod.ExistingSansProvider
  - typings.angularCore.mod.StaticClassSansProvider
  - typings.angularCore.mod.ConstructorSansProvider
  - typings.angularCore.mod.FactorySansProvider
  - typings.angularCore.mod.ClassSansProvider
*/
trait InjectableProvider extends js.Object

object InjectableProvider {
  @scala.inline
  def ExistingSansProvider(useExisting: js.Any): InjectableProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectableProvider]
  }
  @scala.inline
  def ValueSansProvider(useValue: js.Any): InjectableProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectableProvider]
  }
  @scala.inline
  def ClassSansProvider(useClass: Type[_]): InjectableProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectableProvider]
  }
  @scala.inline
  def StaticClassSansProvider(deps: js.Array[_], useClass: Type[_]): InjectableProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectableProvider]
  }
  @scala.inline
  def ConstructorSansProvider(deps: js.Array[_] = null): InjectableProvider = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
  @scala.inline
  def FactorySansProvider(useFactory: js.Function, deps: js.Array[_] = null): InjectableProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableProvider]
  }
}

