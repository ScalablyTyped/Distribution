package typings.agGrid

import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoHeightCalculatorMod {
  
  @JSImport("ag-grid/dist/lib/rendering/autoHeightCalculator", "AutoHeightCalculator")
  @js.native
  class AutoHeightCalculator () extends StObject {
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var eDummyContainer: js.Any = js.native
    
    def getPreferredHeightForRow(rowNode: RowNode): Double = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
}
