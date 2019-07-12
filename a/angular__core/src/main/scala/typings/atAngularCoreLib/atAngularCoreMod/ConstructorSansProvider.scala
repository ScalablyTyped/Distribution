package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorSansProvider extends InjectableProvider {
  /**
    * A list of `token`s to be resolved by the injector.
    */
  var deps: js.UndefOr[js.Array[_]] = js.undefined
}

object ConstructorSansProvider {
  @scala.inline
  def apply(deps: js.Array[_] = null): ConstructorSansProvider = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[ConstructorSansProvider]
  }
}

