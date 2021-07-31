package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * {@example core/di/ts/provider_spec.ts region='StaticClassProvider'}
  *
  * Note that following two providers are not equal:
  *
  * {@example core/di/ts/provider_spec.ts region='StaticClassProviderDifference'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
trait StaticClassProvider
  extends StObject
     with StaticClassSansProvider
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
object StaticClassProvider {
  
  @scala.inline
  def apply(deps: js.Array[js.Any], provide: js.Any, useClass: Type[js.Any]): StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassProvider]
  }
  
  @scala.inline
  implicit class StaticClassProviderMutableBuilder[Self <: StaticClassProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setProvide(value: js.Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
  }
}
