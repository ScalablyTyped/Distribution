package typings.agGrid

import typings.agGrid.iRowNodeStageMod.IRowNodeStage
import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenStageMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/flattenStage", "FlattenStage")
  @js.native
  class FlattenStage ()
    extends StObject
       with IRowNodeStage {
    
    /* private */ def addRowNodeToRowsToDisplay(rowNode: js.Any, result: js.Any, nextRowTop: js.Any, uiLevel: js.Any): js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createDetailNode(masterNode: js.Any): js.Any = js.native
    
    /* private */ def ensureFooterNodeExists(groupNode: js.Any): js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* CompleteClass */
    override def execute(params: StageExecuteParams): js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def recursivelyAddToRowsToDisplay(rowsToFlatten: js.Any, result: js.Any, nextRowTop: js.Any, skipLeafNodes: js.Any, uiLevel: js.Any): js.Any = js.native
    
    /* private */ def resetRowTops(rowNode: js.Any): js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
  }
}
