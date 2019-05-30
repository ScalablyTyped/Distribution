package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value of another `useExisting` token.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='ExistingSansProvider'}
  */
trait ExistingSansProvider extends InjectableProvider {
  /**
    * Existing `token` to return. (equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any
}

object ExistingSansProvider {
  @scala.inline
  def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting)
  
    __obj.asInstanceOf[ExistingSansProvider]
  }
}

