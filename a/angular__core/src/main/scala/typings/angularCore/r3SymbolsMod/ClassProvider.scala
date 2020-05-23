package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * {@example core/di/ts/provider_spec.ts region='ClassProvider'}
  *
  * Note that following two providers are not equal:
  *
  * {@example core/di/ts/provider_spec.ts region='ClassProviderDifference'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
trait ClassProvider extends ClassSansProvider {
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

object ClassProvider {
  @scala.inline
  def apply(provide: js.Any, useClass: Type[_], multi: js.UndefOr[Boolean] = js.undefined): ClassProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProvider]
  }
}

