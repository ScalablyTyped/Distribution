package typings.agGrid

import typings.agGrid.agCheckboxMod.AgCheckbox
import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/header/selectAllFeature", JSImport.Namespace)
@js.native
object selectAllFeatureMod extends js.Object {
  @js.native
  class SelectAllFeature protected () extends BeanStub {
    def this(cbSelectAll: AgCheckbox, column: Column) = this()
    var cbSelectAll: js.Any = js.native
    var cbSelectAllVisible: js.Any = js.native
    var column: js.Any = js.native
    var columnApi: js.Any = js.native
    var eventService: js.Any = js.native
    var filteredOnly: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var processingEventFromCheckbox: js.Any = js.native
    var rowModel: js.Any = js.native
    var selectionController: js.Any = js.native
    /* private */ def checkRightRowModelType(): js.Any = js.native
    /* private */ def getNextCheckboxState(selectionCount: js.Any): js.Any = js.native
    /* private */ def getSelectionCount(): js.Any = js.native
    /* private */ def isCheckboxSelection(): js.Any = js.native
    /* private */ def onCbSelectAll(): js.Any = js.native
    /* private */ def onModelChanged(): js.Any = js.native
    /* private */ def onSelectionChanged(): js.Any = js.native
    /* private */ def postConstruct(): js.Any = js.native
    /* private */ def showOrHideSelectAll(): js.Any = js.native
    /* private */ def updateStateOfCheckbox(): js.Any = js.native
  }
  
}

