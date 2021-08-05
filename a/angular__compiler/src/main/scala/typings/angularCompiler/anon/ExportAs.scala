package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAs extends StObject {
  
  var exportAs: String
  
  var symbol: StaticSymbol
}
object ExportAs {
  
  inline def apply(exportAs: String, symbol: StaticSymbol): ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAs]
  }
  
  extension [Self <: ExportAs](x: Self) {
    
    inline def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
