package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDragEvent
  extends StObject
     with AgGridEvent {
  
  var event: MouseEvent
  
  var node: RowNode
  
  var overIndex: Double
  
  var overNode: RowNode
  
  var vDirection: String
  
  var y: Double
}
object RowDragEvent {
  
  inline def apply(
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
  
  extension [Self <: RowDragEvent](x: Self) {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOverIndex(value: Double): Self = StObject.set(x, "overIndex", value.asInstanceOf[js.Any])
    
    inline def setOverNode(value: RowNode): Self = StObject.set(x, "overNode", value.asInstanceOf[js.Any])
    
    inline def setVDirection(value: String): Self = StObject.set(x, "vDirection", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
