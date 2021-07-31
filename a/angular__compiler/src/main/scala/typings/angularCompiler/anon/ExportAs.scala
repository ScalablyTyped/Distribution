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
  
  @scala.inline
  def apply(exportAs: String, symbol: StaticSymbol): ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAs]
  }
  
  @scala.inline
  implicit class ExportAsMutableBuilder[Self <: ExportAs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
