package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of a token.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * ```ts
  * @Injectable(SomeModule, {deps: []})
  * class MyService {}
  * ```
  *
  * @publicApi
  */
trait ConstructorSansProvider extends js.Object {
  /**
    * A list of `token`s to be resolved by the injector.
    */
  var deps: js.UndefOr[js.Array[_]] = js.undefined
}

object ConstructorSansProvider {
  @scala.inline
  def apply(deps: js.Array[_] = null): ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorSansProvider]
  }
}

