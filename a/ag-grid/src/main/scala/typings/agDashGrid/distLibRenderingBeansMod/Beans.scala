package typings.agDashGrid.distLibRenderingBeansMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController
import typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentResolver
import typings.agDashGrid.distLibContextContextMod.Context
import typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DragAndDropService
import typings.agDashGrid.distLibEventServiceMod.EventService
import typings.agDashGrid.distLibFilterFilterManagerMod.FilterManager
import typings.agDashGrid.distLibFocusedCellControllerMod.FocusedCellController
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import typings.agDashGrid.distLibInterfacesIContextMenuFactoryMod.IContextMenuFactory
import typings.agDashGrid.distLibInterfacesIRangeControllerMod.IRangeController
import typings.agDashGrid.distLibMiscAnimationFrameServiceMod.AnimationFrameService
import typings.agDashGrid.distLibRenderingCellEditorFactoryMod.CellEditorFactory
import typings.agDashGrid.distLibRenderingCellRendererFactoryMod.CellRendererFactory
import typings.agDashGrid.distLibRenderingCellRendererServiceMod.CellRendererService
import typings.agDashGrid.distLibRenderingColumnAnimationServiceMod.ColumnAnimationService
import typings.agDashGrid.distLibRenderingColumnHoverServiceMod.ColumnHoverService
import typings.agDashGrid.distLibRenderingHeightScalerMod.HeightScaler
import typings.agDashGrid.distLibRenderingRowRendererMod.RowRenderer
import typings.agDashGrid.distLibRenderingValueFormatterServiceMod.ValueFormatterService
import typings.agDashGrid.distLibRowModelsPaginationProxyMod.PaginationProxy
import typings.agDashGrid.distLibSortControllerMod.SortController
import typings.agDashGrid.distLibStylingStylingServiceMod.StylingService
import typings.agDashGrid.distLibTemplateServiceMod.TemplateService
import typings.agDashGrid.distLibValueServiceExpressionServiceMod.ExpressionService
import typings.agDashGrid.distLibValueServiceValueServiceMod.ValueService
import typings.agDashGrid.distLibWidgetsPopupServiceMod.PopupService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/beans", "Beans")
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

