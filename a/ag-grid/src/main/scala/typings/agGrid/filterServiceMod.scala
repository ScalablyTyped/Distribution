package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowNodes/filterService", "FilterService")
  @js.native
  class FilterService () extends StObject {
    
    var doingTreeData: js.Any = js.native
    
    def filter(rowNode: RowNode, filterActive: Boolean): Unit = js.native
    
    def filterAccordingToColumnState(rowNode: RowNode): Unit = js.native
    
    var filterManager: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ def setAllChildrenCount(rowNode: js.Any): js.Any = js.native
    
    /* private */ def setAllChildrenCountGridGrouping(rowNode: js.Any): js.Any = js.native
    
    /* private */ def setAllChildrenCountTreeData(rowNode: js.Any): js.Any = js.native
  }
}
