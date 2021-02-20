package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleWithProviders[T] extends StObject {
  
  var ngModule: typings.angularCore.mod.Type[T] = js.native
  
  var providers: js.UndefOr[js.Array[Provider]] = js.native
}
object ModuleWithProviders {
  
  @scala.inline
  def apply[T](ngModule: typings.angularCore.mod.Type[T]): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
  
  @scala.inline
  implicit class ModuleWithProvidersMutableBuilder[Self <: ModuleWithProviders[_], T] (val x: Self with ModuleWithProviders[T]) extends AnyVal {
    
    @scala.inline
    def setNgModule(value: typings.angularCore.mod.Type[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
