package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistingProvider
  extends ExistingSansProvider
     with _Provider
     with _StaticProvider {
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: js.Any
}

object ExistingProvider {
  @scala.inline
  def apply(provide: js.Any, useExisting: js.Any, multi: js.UndefOr[scala.Boolean] = js.undefined): ExistingProvider = {
    val __obj = js.Dynamic.literal(provide = provide, useExisting = useExisting)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[ExistingProvider]
  }
}

