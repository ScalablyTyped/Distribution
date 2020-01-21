package typings.agGrid

import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/sortStage", JSImport.Namespace)
@js.native
object sortStageMod extends js.Object {
  @js.native
  class SortStage () extends js.Object {
    var gridOptionsWrapper: js.Any = js.native
    var sortService: js.Any = js.native
    def execute(params: StageExecuteParams): Unit = js.native
  }
  
}

