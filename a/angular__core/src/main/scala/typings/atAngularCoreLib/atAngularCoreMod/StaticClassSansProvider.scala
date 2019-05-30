package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='StaticClassSansProvider'}
  *
  * @publicApi
  */
trait StaticClassSansProvider extends InjectableProvider {
  /**
    * A list of `token`s which need to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_]
  /**
    * An optional class to instantiate for the `token`. (If not provided `provide` is assumed to be a
    * class to instantiate)
    */
  var useClass: Type[_]
}

object StaticClassSansProvider {
  @scala.inline
  def apply(deps: js.Array[_], useClass: Type[_]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps, useClass = useClass)
  
    __obj.asInstanceOf[StaticClassSansProvider]
  }
}

