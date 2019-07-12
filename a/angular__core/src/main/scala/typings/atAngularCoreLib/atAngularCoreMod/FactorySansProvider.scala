package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactorySansProvider extends InjectableProvider {
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
    val __obj = js.Dynamic.literal(useFactory = useFactory)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[FactorySansProvider]
  }
}

