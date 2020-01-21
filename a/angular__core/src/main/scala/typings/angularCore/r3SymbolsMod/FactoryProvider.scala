package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return a value by invoking a `useFactory` function.
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * {@example core/di/ts/provider_spec.ts region='FactoryProvider'}
  *
  * Dependencies can also be marked as optional:
  *
  * {@example core/di/ts/provider_spec.ts region='FactoryProviderOptionalDeps'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
trait FactoryProvider
  extends FactorySansProvider
     with _StaticProvider {
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: js.Any
}

object FactoryProvider {
  @scala.inline
  def apply(
    provide: js.Any,
    useFactory: js.Function,
    deps: js.Array[_] = null,
    multi: js.UndefOr[Boolean] = js.undefined
  ): FactoryProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryProvider]
  }
}

