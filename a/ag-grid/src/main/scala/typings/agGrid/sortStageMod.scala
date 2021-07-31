package typings.agGrid

import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortStageMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/sortStage", "SortStage")
  @js.native
  class SortStage () extends StObject {
    
    def execute(params: StageExecuteParams): Unit = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var sortService: js.Any = js.native
  }
}
