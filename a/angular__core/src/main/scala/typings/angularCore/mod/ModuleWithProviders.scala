package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleWithProviders[T] extends StObject {
  
  var ngModule: Type[T]
  
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}
object ModuleWithProviders {
  
  inline def apply[T](ngModule: Type[T]): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
  
  extension [Self <: ModuleWithProviders[?], T](x: Self & ModuleWithProviders[T]) {
    
    inline def setNgModule(value: Type[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
