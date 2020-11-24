package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iRowModelMod.IRowModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowModels/paginationProxy", JSImport.Namespace)
@js.native
object paginationProxyMod extends js.Object {
  
  @js.native
  class PaginationAutoPageSizeService () extends BeanStub {
    
    /* private */ def checkPageSize(): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    /* private */ def notActive(): js.Any = js.native
    
    /* private */ def onBodyHeightChanged(): js.Any = js.native
    
    /* private */ def onScrollVisibilityChanged(): js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    var scrollVisibleService: js.Any = js.native
  }
  
  @js.native
  class PaginationProxy ()
    extends BeanStub
       with IRowModel {
    
    var active: js.Any = js.native
    
    var bottomRowBounds: js.Any = js.native
    
    var bottomRowIndex: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var currentPage: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def getCurrentPage(): Double = js.native
    
    def getPageSize(): Double = js.native
    
    def getPixelOffset(): Double = js.native
    
    def getTotalPages(): Double = js.native
    
    def getTotalRowCount(): Double = js.native
    
    def goToFirstPage(): Unit = js.native
    
    def goToLastPage(): Unit = js.native
    
    def goToNextPage(): Unit = js.native
    
    def goToPage(page: Double): Unit = js.native
    
    def goToPageWithIndex(index: js.Any): Unit = js.native
    
    def goToPreviousPage(): Unit = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def isLastPageFound(): Boolean = js.native
    
    /* private */ def onModelUpdated(modelUpdatedEvent: js.Any): js.Any = js.native
    
    var pageSize: js.Any = js.native
    
    var pixelOffset: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var rowModel: js.Any = js.native
    
    var selectionController: js.Any = js.native
    
    /* private */ def setIndexesAndBounds(): js.Any = js.native
    
    /* private */ def setPageSize(): js.Any = js.native
    
    var topRowBounds: js.Any = js.native
    
    var topRowIndex: js.Any = js.native
    
    var totalPages: js.Any = js.native
  }
}
