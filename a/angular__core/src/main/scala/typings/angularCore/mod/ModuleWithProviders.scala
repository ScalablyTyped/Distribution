package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleWithProviders[T] extends StObject {
  
  var ngModule: Type[T]
  
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}
object ModuleWithProviders {
  
  @scala.inline
  def apply[T](ngModule: Type[T]): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
  
  @scala.inline
  implicit class ModuleWithProvidersMutableBuilder[Self <: ModuleWithProviders[?], T] (val x: Self & ModuleWithProviders[T]) extends AnyVal {
    
    @scala.inline
    def setNgModule(value: Type[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
