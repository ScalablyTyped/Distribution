package typings.agGrid

import typings.agGrid.agCheckboxMod.AgCheckbox
import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.columnMod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectAllFeatureMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/header/selectAllFeature", "SelectAllFeature")
  @js.native
  class SelectAllFeature protected () extends BeanStub {
    def this(cbSelectAll: AgCheckbox, column: Column) = this()
    
    /* private */ var cbSelectAll: js.Any = js.native
    
    /* private */ var cbSelectAllVisible: js.Any = js.native
    
    /* private */ def checkRightRowModelType(): js.Any = js.native
    
    /* private */ var column: js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var filteredOnly: js.Any = js.native
    
    /* private */ def getNextCheckboxState(selectionCount: js.Any): js.Any = js.native
    
    /* private */ def getSelectionCount(): js.Any = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def isCheckboxSelection(): js.Any = js.native
    
    /* private */ def onCbSelectAll(): js.Any = js.native
    
    /* private */ def onModelChanged(): js.Any = js.native
    
    /* private */ def onSelectionChanged(): js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ var processingEventFromCheckbox: js.Any = js.native
    
    /* private */ var rowModel: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
    /* private */ def showOrHideSelectAll(): js.Any = js.native
    
    /* private */ def updateStateOfCheckbox(): js.Any = js.native
  }
}
