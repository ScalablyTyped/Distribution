package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileInjectableMetadata extends StObject {
  
  var deps: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var providedIn: js.UndefOr[StaticSymbol] = js.undefined
  
  var symbol: StaticSymbol
  
  var `type`: CompileTypeMetadata
  
  var useClass: js.UndefOr[StaticSymbol] = js.undefined
  
  var useExisting: js.UndefOr[StaticSymbol] = js.undefined
  
  var useFactory: js.UndefOr[StaticSymbol] = js.undefined
  
  var useValue: js.UndefOr[js.Any] = js.undefined
}
object CompileInjectableMetadata {
  
  inline def apply(symbol: StaticSymbol, `type`: CompileTypeMetadata): CompileInjectableMetadata = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileInjectableMetadata]
  }
  
  extension [Self <: CompileInjectableMetadata](x: Self) {
    
    inline def setDeps(value: js.Array[js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setProvidedIn(value: StaticSymbol): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseClass(value: StaticSymbol): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    inline def setUseExisting(value: StaticSymbol): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    inline def setUseFactory(value: StaticSymbol): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    inline def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
