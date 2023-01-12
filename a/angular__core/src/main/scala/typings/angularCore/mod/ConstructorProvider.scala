package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorProvider
  extends StObject
     with ConstructorSansProvider
     with _Provider
     with _StaticProvider {
  
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: Type[Any]
}
object ConstructorProvider {
  
  inline def apply(provide: Type[Any]): ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstructorProvider] (val x: Self) extends AnyVal {
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setProvide(value: Type[Any]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
  }
}
