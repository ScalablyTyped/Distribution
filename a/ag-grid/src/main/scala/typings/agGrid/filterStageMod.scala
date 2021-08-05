package typings.agGrid

import typings.agGrid.iRowNodeStageMod.IRowNodeStage
import typings.agGrid.iRowNodeStageMod.StageExecuteParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterStageMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/clientSide/filterStage", "FilterStage")
  @js.native
  class FilterStage ()
    extends StObject
       with IRowNodeStage {
    
    /* CompleteClass */
    override def execute(params: StageExecuteParams): js.Any = js.native
    
    /* private */ var filterService: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var selectableService: js.Any = js.native
  }
}
