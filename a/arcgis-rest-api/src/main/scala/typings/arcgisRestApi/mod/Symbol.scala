package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol extends StObject {
  
  var style: js.UndefOr[String] = js.undefined
  
  var `type`: SymbolType
}
object Symbol {
  
  @scala.inline
  def apply(`type`: SymbolType): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: SymbolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
