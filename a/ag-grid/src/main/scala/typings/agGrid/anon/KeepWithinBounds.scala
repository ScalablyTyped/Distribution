package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepWithinBounds extends StObject {
  
  var column: typings.agGrid.columnMod.Column
  
  var ePopup: HTMLElement
  
  var eventSource: HTMLElement
  
  var keepWithinBounds: js.UndefOr[Boolean] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var nudgeX: js.UndefOr[Double] = js.undefined
  
  var nudgeY: js.UndefOr[Double] = js.undefined
  
  var rowNode: RowNode
  
  var `type`: String
}
object KeepWithinBounds {
  
  @scala.inline
  def apply(
    column: typings.agGrid.columnMod.Column,
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    rowNode: RowNode,
    `type`: String
  ): KeepWithinBounds = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepWithinBounds]
  }
  
  @scala.inline
  implicit class KeepWithinBoundsMutableBuilder[Self <: KeepWithinBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: typings.agGrid.columnMod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEPopup(value: HTMLElement): Self = StObject.set(x, "ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: HTMLElement): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithinBounds(value: Boolean): Self = StObject.set(x, "keepWithinBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepWithinBoundsUndefined: Self = StObject.set(x, "keepWithinBounds", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setNudgeX(value: Double): Self = StObject.set(x, "nudgeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNudgeXUndefined: Self = StObject.set(x, "nudgeX", js.undefined)
    
    @scala.inline
    def setNudgeY(value: Double): Self = StObject.set(x, "nudgeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNudgeYUndefined: Self = StObject.set(x, "nudgeY", js.undefined)
    
    @scala.inline
    def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
