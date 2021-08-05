package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAs extends StObject {
  
  var importAs: StaticSymbol
  
  var symbol: StaticSymbol
}
object ImportAs {
  
  inline def apply(importAs: StaticSymbol, symbol: StaticSymbol): ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAs]
  }
  
  extension [Self <: ImportAs](x: Self) {
    
    inline def setImportAs(value: StaticSymbol): Self = StObject.set(x, "importAs", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
