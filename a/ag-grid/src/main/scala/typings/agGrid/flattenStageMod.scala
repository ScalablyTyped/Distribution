package typings.agGrid

import typings.agGrid.iRowNodeStageMod.IRowNodeStage
import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/flattenStage", JSImport.Namespace)
@js.native
object flattenStageMod extends js.Object {
  @js.native
  class FlattenStage () extends IRowNodeStage {
    var columnController: js.Any = js.native
    var context: js.Any = js.native
    var eventService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var selectionController: js.Any = js.native
    /* private */ def addRowNodeToRowsToDisplay(rowNode: js.Any, result: js.Any, nextRowTop: js.Any, uiLevel: js.Any): js.Any = js.native
    /* private */ def createDetailNode(masterNode: js.Any): js.Any = js.native
    /* private */ def ensureFooterNodeExists(groupNode: js.Any): js.Any = js.native
    /* CompleteClass */
    override def execute(params: StageExecuteParams): js.Any = js.native
    /* private */ def recursivelyAddToRowsToDisplay(rowsToFlatten: js.Any, result: js.Any, nextRowTop: js.Any, skipLeafNodes: js.Any, uiLevel: js.Any): js.Any = js.native
    /* private */ def resetRowTops(rowNode: js.Any): js.Any = js.native
  }
  
}

