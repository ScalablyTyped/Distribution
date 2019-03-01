package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorSansProvider
  extends atAngularCoreLib.srcDiInjectableMod.InjectableProvider {
  /**
    * A list of `token`s which need to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
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

