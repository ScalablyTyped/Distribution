package typings
package atAngularCoreLib.srcDiProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProvider
  extends ValueSansProvider
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
  var provide: js.Any
}

object ValueProvider {
  @scala.inline
  def apply(provide: js.Any, useValue: js.Any, multi: js.UndefOr[scala.Boolean] = js.undefined): ValueProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provide")(provide)
    __obj.updateDynamic("useValue")(useValue)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[ValueProvider]
  }
}

