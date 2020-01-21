package typings.agGrid

import typings.agGrid.animationFrameServiceMod.AnimationFrameService
import typings.agGrid.cellEditorFactoryMod.CellEditorFactory
import typings.agGrid.cellRendererFactoryMod.CellRendererFactory
import typings.agGrid.cellRendererServiceMod.CellRendererService
import typings.agGrid.columnAnimationServiceMod.ColumnAnimationService
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnControllerMod.ColumnController
import typings.agGrid.columnHoverServiceMod.ColumnHoverService
import typings.agGrid.componentResolverMod.ComponentResolver
import typings.agGrid.contextMod.Context
import typings.agGrid.dragAndDropServiceMod.DragAndDropService
import typings.agGrid.eventServiceMod.EventService
import typings.agGrid.expressionServiceMod.ExpressionService
import typings.agGrid.filterManagerMod.FilterManager
import typings.agGrid.focusedCellControllerMod.FocusedCellController
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.heightScalerMod.HeightScaler
import typings.agGrid.iContextMenuFactoryMod.IContextMenuFactory
import typings.agGrid.iRangeControllerMod.IRangeController
import typings.agGrid.paginationProxyMod.PaginationProxy
import typings.agGrid.popupServiceMod.PopupService
import typings.agGrid.rowRendererMod.RowRenderer
import typings.agGrid.sortControllerMod.SortController
import typings.agGrid.stylingServiceMod.StylingService
import typings.agGrid.templateServiceMod.TemplateService
import typings.agGrid.valueFormatterServiceMod.ValueFormatterService
import typings.agGrid.valueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/beans", JSImport.Namespace)
@js.native
object beansMod extends js.Object {
  @js.native
  class Beans () extends js.Object {
    @JSName("$compile")
    var $compile: js.Any = js.native
    var cellEditorFactory: CellEditorFactory = js.native
    var cellRendererFactory: CellRendererFactory = js.native
    var cellRendererService: CellRendererService = js.native
    var columnAnimationService: ColumnAnimationService = js.native
    var columnApi: ColumnApi = js.native
    var columnController: ColumnController = js.native
    var columnHoverService: ColumnHoverService = js.native
    var componentResolver: ComponentResolver = js.native
    var context: Context = js.native
    var contextMenuFactory: IContextMenuFactory = js.native
    var doingMasterDetail: Boolean = js.native
    var dragAndDropService: DragAndDropService = js.native
    var enterprise: Boolean = js.native
    var eventService: EventService = js.native
    var expressionService: ExpressionService = js.native
    var filterManager: FilterManager = js.native
    var focusedCellController: FocusedCellController = js.native
    var gridApi: GridApi = js.native
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    var gridPanel: GridPanel = js.native
    var heightScaler: HeightScaler = js.native
    var paginationProxy: PaginationProxy = js.native
    var popupService: PopupService = js.native
    var rangeController: IRangeController = js.native
    var rowRenderer: RowRenderer = js.native
    var sortController: SortController = js.native
    var stylingService: StylingService = js.native
    var taskQueue: AnimationFrameService = js.native
    var templateService: TemplateService = js.native
    var valueFormatterService: ValueFormatterService = js.native
    var valueService: ValueService = js.native
    /* private */ def postConstruct(): js.Any = js.native
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
}

