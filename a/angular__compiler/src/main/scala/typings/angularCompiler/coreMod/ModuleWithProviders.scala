package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleWithProviders extends StObject {
  
  var ngModule: Type
  
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}
object ModuleWithProviders {
  
  inline def apply(ngModule: Type): ModuleWithProviders = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders]
  }
  
  extension [Self <: ModuleWithProviders](x: Self) {
    
    inline def setNgModule(value: Type): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
