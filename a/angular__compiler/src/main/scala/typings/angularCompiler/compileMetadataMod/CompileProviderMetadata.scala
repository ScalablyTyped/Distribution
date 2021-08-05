package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileProviderMetadata extends StObject {
  
  var deps: js.UndefOr[js.Array[CompileDiDependencyMetadata]] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var token: CompileTokenMetadata
  
  var useClass: js.UndefOr[CompileTypeMetadata] = js.undefined
  
  var useExisting: js.UndefOr[CompileTokenMetadata] = js.undefined
  
  var useFactory: js.UndefOr[CompileFactoryMetadata] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
}
object CompileProviderMetadata {
  
  inline def apply(token: CompileTokenMetadata): CompileProviderMetadata = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileProviderMetadata]
  }
  
  extension [Self <: CompileProviderMetadata](x: Self) {
    
    inline def setDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setToken(value: CompileTokenMetadata): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUseClass(value: CompileTypeMetadata): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: CompileTokenMetadata): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: CompileFactoryMetadata): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
