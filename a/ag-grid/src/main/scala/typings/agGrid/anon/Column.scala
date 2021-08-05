package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: js.UndefOr[typings.agGrid.columnMod.Column] = js.undefined
  
  var ePopup: HTMLElement
  
  var mouseEvent: MouseEvent | Touch
  
  var rowNode: js.UndefOr[RowNode] = js.undefined
  
  var `type`: String
}
object Column {
  
  inline def apply(ePopup: HTMLElement, mouseEvent: MouseEvent | Touch, `type`: String): Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: typings.agGrid.columnMod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    inline def setMouseEvent(value: MouseEvent | Touch): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    
    inline def setRowNodeUndefined: Self = StObject.set(x, "rowNode", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
