package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return a value for a token.
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='ValueProvider'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
trait ValueProvider
  extends StObject
     with ValueSansProvider
     with _StaticProvider {
  
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: js.Any
}
object ValueProvider {
  
  @scala.inline
  def apply(provide: js.Any, useValue: js.Any): ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProvider]
  }
  
  @scala.inline
  implicit class ValueProviderMutableBuilder[Self <: ValueProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setProvide(value: js.Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
  }
}
