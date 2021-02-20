package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleWithProviders extends StObject {
  
  var ngModule: typings.angularCompiler.coreMod.Type = js.native
  
  var providers: js.UndefOr[js.Array[Provider]] = js.native
}
object ModuleWithProviders {
  
  @scala.inline
  def apply(ngModule: typings.angularCompiler.coreMod.Type): ModuleWithProviders = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders]
  }
  
  @scala.inline
  implicit class ModuleWithProvidersMutableBuilder[Self <: ModuleWithProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgModule(value: typings.angularCompiler.coreMod.Type): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
