package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value of another `useExisting` token.
  *
  * @see `ExistingProvider`
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait ExistingSansProvider extends js.Object {
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any
}

object ExistingSansProvider {
  @scala.inline
  def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExistingSansProvider]
  }
}

