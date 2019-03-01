package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticClassProvider
  extends StaticClassSansProvider
     with atAngularCoreLib.srcDiR3UnderscoreInjectorMod._SingleProvider
     with _StaticProvider {
  /**
    * If true, then injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: js.Any
}

object StaticClassProvider {
  @scala.inline
  def apply(
    deps: js.Array[_],
    provide: js.Any,
    useClass: atAngularCoreLib.srcTypeMod.Type[_],
    multi: js.UndefOr[scala.Boolean] = js.undefined
  ): StaticClassProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deps")(deps)
    __obj.updateDynamic("provide")(provide)
    __obj.updateDynamic("useClass")(useClass)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[StaticClassProvider]
  }
}

