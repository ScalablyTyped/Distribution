package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changedPathMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/changedPath", "ChangedPath")
  @js.native
  class ChangedPath protected () extends StObject {
    def this(keepingColumns: Boolean) = this()
    
    var active: js.Any = js.native
    
    def addParentNode(rowNode: RowNode): Unit = js.native
    def addParentNode(rowNode: RowNode, columns: js.Array[Column]): Unit = js.native
    
    def getNotValueColumnsForNode(rowNode: RowNode, valueColumns: js.Array[Column]): js.Array[Column] = js.native
    
    def getValueColumnsForNode(rowNode: RowNode, valueColumns: js.Array[Column]): js.Array[Column] = js.native
    
    def isActive(): Boolean = js.native
    
    def isInPath(rowNode: RowNode): Boolean = js.native
    
    var keepingColumns: js.Any = js.native
    
    var nodeIdsToBoolean: js.Any = js.native
    
    var nodeIdsToColumns: js.Any = js.native
    
    def setInactive(): Unit = js.native
    
    /* private */ def validateActive(): js.Any = js.native
  }
}
