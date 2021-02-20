package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileInjectableMetadata extends StObject {
  
  var deps: js.UndefOr[js.Array[_]] = js.native
  
  var providedIn: js.UndefOr[StaticSymbol] = js.native
  
  var symbol: StaticSymbol = js.native
  
  var `type`: CompileTypeMetadata = js.native
  
  var useClass: js.UndefOr[StaticSymbol] = js.native
  
  var useExisting: js.UndefOr[StaticSymbol] = js.native
  
  var useFactory: js.UndefOr[StaticSymbol] = js.native
  
  var useValue: js.UndefOr[js.Any] = js.native
}
object CompileInjectableMetadata {
  
  @scala.inline
  def apply(symbol: StaticSymbol, `type`: CompileTypeMetadata): CompileInjectableMetadata = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileInjectableMetadata]
  }
  
  @scala.inline
  implicit class CompileInjectableMetadataMutableBuilder[Self <: CompileInjectableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[_]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setProvidedIn(value: StaticSymbol): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    @scala.inline
    def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClass(value: StaticSymbol): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
    
    @scala.inline
    def setUseExisting(value: StaticSymbol): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
    
    @scala.inline
    def setUseFactory(value: StaticSymbol): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
    
    @scala.inline
    def setUseValue(value: js.Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
  }
}
