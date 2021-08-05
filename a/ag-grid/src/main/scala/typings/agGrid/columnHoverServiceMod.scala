package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.columnMod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnHoverServiceMod {
  
  @JSImport("ag-grid/dist/lib/rendering/columnHoverService", "ColumnHoverService")
  @js.native
  class ColumnHoverService () extends BeanStub {
    
    def clearMouseOver(): Unit = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    def isHovered(column: Column): Boolean = js.native
    
    /* private */ var selectedColumns: js.Any = js.native
    
    def setMouseOver(columns: js.Array[Column]): Unit = js.native
  }
}
