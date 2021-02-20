package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.headerRootCompMod.HeaderRootComp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoWidthCalculatorMod {
  
  @JSImport("ag-grid/dist/lib/rendering/autoWidthCalculator", "AutoWidthCalculator")
  @js.native
  class AutoWidthCalculator () extends StObject {
    
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
