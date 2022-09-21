package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol extends StObject {
  
  var style: LineWidth
  
  var symbol: Any
}
object Symbol {
  
  inline def apply(style: LineWidth, symbol: Any): Symbol = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  extension [Self <: Symbol](x: Self) {
    
    inline def setStyle(value: LineWidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Any): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
