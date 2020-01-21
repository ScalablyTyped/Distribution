package typings.agGrid

import typings.agGrid.iRowNodeStageMod.IRowNodeStage
import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/filterStage", JSImport.Namespace)
@js.native
object filterStageMod extends js.Object {
  @js.native
  class FilterStage () extends IRowNodeStage {
    var filterService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var selectableService: js.Any = js.native
    /* CompleteClass */
    override def execute(params: StageExecuteParams): js.Any = js.native
  }
  
}

