package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDragEvent extends AgGridEvent {
  
  var event: MouseEvent = js.native
  
  var node: RowNode = js.native
  
  var overIndex: Double = js.native
  
  var overNode: RowNode = js.native
  
  var vDirection: String = js.native
  
  var y: Double = js.native
}
object RowDragEvent {
  
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    event: MouseEvent,
    node: RowNode,
    overIndex: Double,
    overNode: RowNode,
    `type`: String,
    vDirection: String,
    y: Double
  ): RowDragEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], overIndex = overIndex.asInstanceOf[js.Any], overNode = overNode.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragEvent]
  }
  
  @scala.inline
  implicit class RowDragEventMutableBuilder[Self <: RowDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverIndex(value: Double): Self = StObject.set(x, "overIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverNode(value: RowNode): Self = StObject.set(x, "overNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVDirection(value: String): Self = StObject.set(x, "vDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
