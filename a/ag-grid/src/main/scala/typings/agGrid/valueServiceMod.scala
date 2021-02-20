package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueServiceMod {
  
  @JSImport("ag-grid/dist/lib/valueService/valueService", "ValueService")
  @js.native
  class ValueService () extends StObject {
    
    var cellExpressions: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    /* private */ def executeValueGetter(filterValueGetter: js.Any, data: js.Any, column: js.Any, rowNode: js.Any): js.Any = js.native
    
    var expressionService: js.Any = js.native
    
    def getKeyForNode(col: Column, rowNode: RowNode): js.Any = js.native
    
    def getValue(column: Column, rowNode: RowNode): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode, forFilter: js.UndefOr[scala.Nothing], ignoreAggData: Boolean): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode, forFilter: Boolean): js.Any = js.native
    def getValue(column: Column, rowNode: RowNode, forFilter: Boolean, ignoreAggData: Boolean): js.Any = js.native
    
    /* private */ def getValueCallback(node: js.Any, field: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def init(): Unit = js.native
    
    var initialised: js.Any = js.native
    
    def setValue(rowNode: RowNode, colKey: String, newValue: js.Any): Unit = js.native
    def setValue(rowNode: RowNode, colKey: Column, newValue: js.Any): Unit = js.native
    
    /* private */ def setValueUsingField(data: js.Any, field: js.Any, newValue: js.Any, isFieldContainsDots: js.Any): js.Any = js.native
    
    var valueCache: js.Any = js.native
  }
}
