package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueFormatterServiceMod {
  
  @JSImport("ag-grid/dist/lib/rendering/valueFormatterService", "ValueFormatterService")
  @js.native
  class ValueFormatterService () extends StObject {
    
    /* private */ var expressionService: js.Any = js.native
    
    def formatValue(column: Column, rowNode: RowNode, $scope: js.Any, value: js.Any): String = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
  }
}
