package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.headerRootCompMod.HeaderRootComp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/autoWidthCalculator", JSImport.Namespace)
@js.native
object autoWidthCalculatorMod extends js.Object {
  
  @js.native
  class AutoWidthCalculator () extends js.Object {
    
    /* private */ def cloneItemIntoDummy(eCell: js.Any, eDummyContainer: js.Any): js.Any = js.native
    
    /* private */ def getHeaderCellForColumn(column: js.Any): js.Any = js.native
    
    def getPreferredWidthForColumn(column: Column): Double = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    var headerRootComp: js.Any = js.native
    
    /* private */ def putRowCellsIntoDummyContainer(column: js.Any, eDummyContainer: js.Any): js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def registerHeaderRootComp(headerRootComp: HeaderRootComp): Unit = js.native
    
    var rowRenderer: js.Any = js.native
  }
}
