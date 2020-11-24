package typings.agGrid

import typings.agGrid.iRowNodeStageMod.IRowNodeStage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowModels/clientSide/flattenStage", JSImport.Namespace)
@js.native
object flattenStageMod extends js.Object {
  
  @js.native
  class FlattenStage () extends IRowNodeStage {
    
    /* private */ def addRowNodeToRowsToDisplay(rowNode: js.Any, result: js.Any, nextRowTop: js.Any, uiLevel: js.Any): js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createDetailNode(masterNode: js.Any): js.Any = js.native
    
    /* private */ def ensureFooterNodeExists(groupNode: js.Any): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def recursivelyAddToRowsToDisplay(rowsToFlatten: js.Any, result: js.Any, nextRowTop: js.Any, skipLeafNodes: js.Any, uiLevel: js.Any): js.Any = js.native
    
    /* private */ def resetRowTops(rowNode: js.Any): js.Any = js.native
    
    var selectionController: js.Any = js.native
  }
}
