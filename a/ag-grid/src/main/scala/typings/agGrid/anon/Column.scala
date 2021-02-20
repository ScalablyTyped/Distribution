package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends StObject {
  
  var column: js.UndefOr[typings.agGrid.columnMod.Column] = js.native
  
  var ePopup: HTMLElement = js.native
  
  var mouseEvent: MouseEvent | Touch = js.native
  
  var rowNode: js.UndefOr[RowNode] = js.native
  
  var `type`: String = js.native
}
object Column {
  
  @scala.inline
  def apply(ePopup: HTMLElement, mouseEvent: MouseEvent | Touch, `type`: String): Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: typings.agGrid.columnMod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEvent(value: MouseEvent | Touch): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNodeUndefined: Self = StObject.set(x, "rowNode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
