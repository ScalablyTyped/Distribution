package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value for a token.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='ValueSansProvider'}
  *
  * @publicApi
  */
trait ValueSansProvider extends InjectableProvider {
  /**
    * The value to inject.
    */
  var useValue: js.Any
}

object ValueSansProvider {
  @scala.inline
  def apply(useValue: js.Any): ValueSansProvider = {
    val __obj = js.Dynamic.literal(useValue = useValue)
  
    __obj.asInstanceOf[ValueSansProvider]
  }
}

