package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value by invoking a `useClass` function.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='ClassSansProvider'}
  *
  * @publicApi
  */
trait ClassSansProvider extends InjectableProvider {
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[_]
}

object ClassSansProvider {
  @scala.inline
  def apply(useClass: Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass)
  
    __obj.asInstanceOf[ClassSansProvider]
  }
}

