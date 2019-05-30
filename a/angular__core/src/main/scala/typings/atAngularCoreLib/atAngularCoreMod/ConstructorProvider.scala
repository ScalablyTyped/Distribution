package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of a token.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='ConstructorProvider'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  */
trait ConstructorProvider
  extends ConstructorSansProvider
     with _Provider
     with _StaticProvider {
  /**
    * If true, then injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: Type[_]
}

object ConstructorProvider {
  @scala.inline
  def apply(provide: Type[_], deps: js.Array[_] = null, multi: js.UndefOr[scala.Boolean] = js.undefined): ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[ConstructorProvider]
  }
}

