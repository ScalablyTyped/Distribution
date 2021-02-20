package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAs extends StObject {
  
  var importAs: StaticSymbol = js.native
  
  var symbol: StaticSymbol = js.native
}
object ImportAs {
  
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAs]
  }
  
  @scala.inline
  implicit class ImportAsMutableBuilder[Self <: ImportAs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportAs(value: StaticSymbol): Self = StObject.set(x, "importAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: StaticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
