package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowNodes/selectableService", "SelectableService")
  @js.native
  class SelectableService () extends StObject {
    
    var gridOptionsWrapper: js.Any = js.native
    
    var groupSelectsChildren: js.Any = js.native
    
    def init(): Unit = js.native
    
    var isRowSelectableFunc: js.Any = js.native
    
    /* private */ def recurseDown(children: js.Any, nextChildrenFunc: js.Any): js.Any = js.native
    
    def updateSelectableAfterFiltering(rowNode: RowNode): Unit = js.native
    
    def updateSelectableAfterGrouping(rowNode: RowNode): Unit = js.native
  }
}
