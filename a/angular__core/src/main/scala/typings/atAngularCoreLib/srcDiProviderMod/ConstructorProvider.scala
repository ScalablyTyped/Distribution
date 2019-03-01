package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorProvider
  extends ConstructorSansProvider
     with _Provider
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
  var provide: atAngularCoreLib.srcTypeMod.Type[_]
}

object ConstructorProvider {
  @scala.inline
  def apply(
    provide: atAngularCoreLib.srcTypeMod.Type[_],
    deps: js.Array[_] = null,
    multi: js.UndefOr[scala.Boolean] = js.undefined
  ): ConstructorProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provide")(provide)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[ConstructorProvider]
  }
}

