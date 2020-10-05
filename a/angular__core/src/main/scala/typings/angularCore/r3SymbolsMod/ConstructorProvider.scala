package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of a token.
  *
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * {@example core/di/ts/provider_spec.ts region='ConstructorProvider'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
@js.native
trait ConstructorProvider
  extends ConstructorSansProvider
     with _StaticProvider {
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.native
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: Type[_] = js.native
}

object ConstructorProvider {
  @scala.inline
  def apply(provide: Type[_]): ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorProvider]
  }
  @scala.inline
  implicit class ConstructorProviderOps[Self <: ConstructorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvide(value: Type[_]): Self = this.set("provide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
  }
  
}

