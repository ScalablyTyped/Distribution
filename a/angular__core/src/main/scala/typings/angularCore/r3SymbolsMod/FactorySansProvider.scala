package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value by invoking a `useFactory` function.
  *
  * @see `FactoryProvider`
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
trait FactorySansProvider extends js.Object {
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useFactory` function.
    */
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * A function to invoke to create a value for this `token`. The function is invoked with
    * resolved values of `token`s in the `deps` field.
    */
  var useFactory: js.Function
}

object FactorySansProvider {
  @scala.inline
  def apply(useFactory: js.Function, deps: js.Array[_] = null): FactorySansProvider = {
    val __obj = js.Dynamic.literal(useFactory = useFactory.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorySansProvider]
  }
}

