package typings.agGrid

import typings.agGrid.beansMod.Beans
import typings.agGrid.cellCompMod.CellComp
import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.iCellRendererMod.ICellRendererParams
import typings.agGrid.rowContainerComponentMod.RowContainerComponent
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowCompMod {
  
  @JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
  @js.native
  class LoadingCellRenderer () extends Component {
    
    /* private */ var eLoadingIcon: js.Any = js.native
    
    /* private */ var eLoadingText: js.Any = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MLoadingCellRenderer(params: ICellRendererParams): Unit = js.native
    
    def refresh(params: js.Any): Boolean = js.native
  }
  /* static members */
  object LoadingCellRenderer {
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "LoadingCellRenderer.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp")
  @js.native
  class RowComp protected () extends Component {
    def this(
      parentScope: js.Any,
      bodyContainerComp: RowContainerComponent,
      pinnedLeftContainerComp: RowContainerComponent,
      pinnedRightContainerComp: RowContainerComponent,
      fullWidthContainerComp: RowContainerComponent,
      rowNode: RowNode,
      beans: Beans,
      animateIn: Boolean,
      useAnimationFrameForCreate: Boolean
    ) = this()
    
    /* private */ var active: js.Any = js.native
    
    /* private */ def addDomData(eRowContainer: js.Any): js.Any = js.native
    
    /* private */ def addHoverFunctionality(eRow: js.Any): js.Any = js.native
    
    /* private */ def addListeners(): js.Any = js.native
    
    def afterFlush(): Unit = js.native
    
    /* private */ def afterRowAttached(rowContainerComp: js.Any, eRow: js.Any): js.Any = js.native
    
    /* private */ def angular1Compile(element: js.Any): js.Any = js.native
    
    /* private */ def applyPaginationOffset(topPx: js.Any, reverse: js.Any): js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var bodyContainerComp: js.Any = js.native
    
    /* private */ def callAfterRowAttachedOnCells(newCellComps: js.Any, eRow: js.Any): js.Any = js.native
    
    /* private */ var cellComps: js.Any = js.native
    
    /* private */ var columnRefreshPending: js.Any = js.native
    
    /* private */ def createCells(cols: js.Any): js.Any = js.native
    
    /* private */ def createChildScopeOrNull(data: js.Any): js.Any = js.native
    
    /* private */ def createFullWidthParams(eRow: js.Any, pinned: js.Any): js.Any = js.native
    
    /* private */ def createFullWidthRowContainer(
      rowContainerComp: js.Any,
      pinned: js.Any,
      extraCssClass: js.Any,
      cellRendererType: js.Any,
      cellRendererName: js.Any,
      eRowCallback: js.Any,
      cellRendererCallback: js.Any
    ): js.Any = js.native
    
    /* private */ def createFullWidthRows(`type`: js.Any, name: js.Any): js.Any = js.native
    
    /* private */ def createNewCell(col: js.Any, eContainer: js.Any, cellTemplates: js.Any, newCellComps: js.Any): js.Any = js.native
    
    /* private */ def createRowContainer(rowContainerComp: js.Any, cols: js.Any, callback: js.Any): js.Any = js.native
    
    /* private */ def createRowEvent(`type`: js.Any, domEvent: js.Any): js.Any = js.native
    
    /* private */ def createRowEventWithSource(`type`: js.Any, domEvent: js.Any): js.Any = js.native
    
    /* private */ var createSecondPassFuncs: js.Any = js.native
    
    /* private */ def createTemplate(contents: js.Any, extraCssClass: js.Any): js.Any = js.native
    
    def destroy(animate: Boolean): Unit = js.native
    
    /* private */ def destroyContainingCells(): js.Any = js.native
    
    /* private */ def destroyFullWidthComponents(): js.Any = js.native
    
    /* private */ var eAllRowContainers: js.Any = js.native
    
    /* private */ var eBodyRow: js.Any = js.native
    
    /* private */ var eFullWidthRow: js.Any = js.native
    
    /* private */ var eFullWidthRowBody: js.Any = js.native
    
    /* private */ var eFullWidthRowLeft: js.Any = js.native
    
    /* private */ var eFullWidthRowRight: js.Any = js.native
    
    /* private */ var ePinnedLeftRow: js.Any = js.native
    
    /* private */ var ePinnedRightRow: js.Any = js.native
    
    /* private */ var editingRow: js.Any = js.native
    
    /* private */ def ensureCellInCorrectContainer(cellComp: js.Any): js.Any = js.native
    
    def ensureDomOrder(): Unit = js.native
    
    /* private */ def executeProcessRowPostCreateFunc(): js.Any = js.native
    
    /* private */ var fadeRowIn: js.Any = js.native
    
    def forEachCellComp(callback: js.Function1[/* renderedCell */ CellComp, Unit]): Unit = js.native
    
    /* private */ var fullWidthContainerComp: js.Any = js.native
    
    /* private */ var fullWidthRow: js.Any = js.native
    
    /* private */ var fullWidthRowComponent: js.Any = js.native
    
    /* private */ var fullWidthRowComponentBody: js.Any = js.native
    
    /* private */ var fullWidthRowComponentLeft: js.Any = js.native
    
    /* private */ var fullWidthRowComponentRight: js.Any = js.native
    
    /* private */ var fullWidthRowEmbedded: js.Any = js.native
    
    def getAndClearDelayedDestroyFunctions(): js.Array[js.Function] = js.native
    
    def getAndClearNextVMTurnFunctions(): js.Array[js.Function] = js.native
    
    def getBodyRowElement(): HTMLElement = js.native
    
    def getCellForCol(column: Column): HTMLElement = js.native
    
    /* private */ def getContainerForCell(pinnedType: js.Any): js.Any = js.native
    
    def getFullWidthRowElement(): HTMLElement = js.native
    
    /* private */ def getInitialRowClasses(extraCssClass: js.Any): js.Any = js.native
    
    /* private */ def getInitialRowTopStyle(): js.Any = js.native
    
    def getPinnedLeftRowElement(): HTMLElement = js.native
    
    def getPinnedRightRowElement(): HTMLElement = js.native
    
    def getRenderedCellForColumn(column: Column): CellComp = js.native
    
    /* private */ def getRowBusinessKey(): js.Any = js.native
    
    def getRowNode(): RowNode = js.native
    
    @JSName("init")
    def init_MRowComp(): Unit = js.native
    
    /* private */ var initialised: js.Any = js.native
    
    /* private */ def insertCellsIntoContainer(eRow: js.Any, cols: js.Any): js.Any = js.native
    
    /* private */ def isCellEligibleToBeRemoved(indexStr: js.Any): js.Any = js.native
    
    /* private */ def isCellInWrongRow(cellComp: js.Any): js.Any = js.native
    
    def isEditing(): Boolean = js.native
    
    def isFullWidth(): Boolean = js.native
    
    /* private */ def lazyCreateCells(cols: js.Any, eRow: js.Any): js.Any = js.native
    
    /* private */ def onCellFocusChanged(): js.Any = js.native
    
    /* private */ def onColumnResized(): js.Any = js.native
    
    /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
    
    /* private */ def onExpandedChanged(): js.Any = js.native
    
    /* private */ def onGridColumnsChanged(): js.Any = js.native
    
    def onMouseEvent(eventName: String, mouseEvent: MouseEvent): Unit = js.native
    
    /* private */ def onPaginationChanged(): js.Any = js.native
    
    def onRowClick(mouseEvent: MouseEvent): Unit = js.native
    
    /* private */ def onRowDblClick(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onRowHeightChanged(): js.Any = js.native
    
    /* private */ def onRowIndexChanged(): js.Any = js.native
    
    /* private */ def onRowNodeCellChanged(event: js.Any): js.Any = js.native
    
    /* private */ def onRowNodeDataChanged(event: js.Any): js.Any = js.native
    
    /* private */ def onRowNodeDraggingChanged(): js.Any = js.native
    
    /* private */ def onRowSelected(): js.Any = js.native
    
    /* private */ def onTopChanged(): js.Any = js.native
    
    /* private */ def onVirtualColumnsChanged(): js.Any = js.native
    
    /* private */ var paginationPage: js.Any = js.native
    
    /* private */ var parentScope: js.Any = js.native
    
    /* private */ var pinnedLeftContainerComp: js.Any = js.native
    
    /* private */ var pinnedRightContainerComp: js.Any = js.native
    
    /* private */ def postProcessClassesFromGridOptions(): js.Any = js.native
    
    /* private */ def postProcessCss(): js.Any = js.native
    
    /* private */ def postProcessRowClassRules(): js.Any = js.native
    
    /* private */ def postProcessRowDragging(): js.Any = js.native
    
    /* private */ def postProcessStylesFromGridOptions(): js.Any = js.native
    
    /* private */ def preProcessRowClassRules(): js.Any = js.native
    
    /* private */ def preProcessStylesFromGridOptions(): js.Any = js.native
    
    /* private */ def processClassesFromGridOptions(): js.Any = js.native
    
    /* private */ def processRowClassRules(onApplicableClass: js.Any, onNotApplicableClass: js.Any): js.Any = js.native
    
    /* private */ def processStylesFromGridOptions(): js.Any = js.native
    
    /* private */ def refreshCells(): js.Any = js.native
    
    /* private */ def refreshCellsInAnimationFrame(): js.Any = js.native
    
    /* private */ var removeFirstPassFuncs: js.Any = js.native
    
    /* private */ def removeRenderedCells(colIds: js.Any): js.Any = js.native
    
    /* private */ var removeSecondPassFuncs: js.Any = js.native
    
    /* private */ def roundRowTopToBounds(rowTop: js.Any): js.Any = js.native
    
    /* private */ var rowFocused: js.Any = js.native
    
    /* private */ var rowIsEven: js.Any = js.native
    
    /* private */ var rowNode: js.Any = js.native
    
    /* private */ var scope: js.Any = js.native
    
    /* private */ def setAnimateFlags(animateIn: js.Any): js.Any = js.native
    
    /* private */ def setEditingRow(value: js.Any): js.Any = js.native
    
    /* private */ def setRowTop(pixels: js.Any): js.Any = js.native
    
    /* private */ def setupNormalRowContainers(): js.Any = js.native
    
    /* private */ def setupRowContainers(): js.Any = js.native
    
    /* private */ var slideRowIn: js.Any = js.native
    
    def startRowEditing(): Unit = js.native
    def startRowEditing(keyPress: Double): Unit = js.native
    def startRowEditing(keyPress: Double, charPress: String): Unit = js.native
    def startRowEditing(keyPress: Double, charPress: String, sourceRenderedCell: CellComp): Unit = js.native
    def startRowEditing(keyPress: Double, charPress: Unit, sourceRenderedCell: CellComp): Unit = js.native
    def startRowEditing(keyPress: Unit, charPress: String): Unit = js.native
    def startRowEditing(keyPress: Unit, charPress: String, sourceRenderedCell: CellComp): Unit = js.native
    def startRowEditing(keyPress: Unit, charPress: Unit, sourceRenderedCell: CellComp): Unit = js.native
    
    def stopEditing(): Unit = js.native
    def stopEditing(cancel: Boolean): Unit = js.native
    
    def stopRowEditing(cancel: Boolean): Unit = js.native
    
    /* private */ def updateRowIndexes(): js.Any = js.native
    
    /* private */ var useAnimationFrameForCreate: js.Any = js.native
  }
  /* static members */
  object RowComp {
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.DETAIL_CELL_RENDERER")
    @js.native
    def DETAIL_CELL_RENDERER: js.Any = js.native
    inline def DETAIL_CELL_RENDERER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DETAIL_CELL_RENDERER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.DETAIL_CELL_RENDERER_COMP_NAME")
    @js.native
    def DETAIL_CELL_RENDERER_COMP_NAME: js.Any = js.native
    inline def DETAIL_CELL_RENDERER_COMP_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DETAIL_CELL_RENDERER_COMP_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.DOM_DATA_KEY_RENDERED_ROW")
    @js.native
    def DOM_DATA_KEY_RENDERED_ROW: String = js.native
    inline def DOM_DATA_KEY_RENDERED_ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DATA_KEY_RENDERED_ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.FULL_WIDTH_CELL_RENDERER")
    @js.native
    def FULL_WIDTH_CELL_RENDERER: js.Any = js.native
    inline def FULL_WIDTH_CELL_RENDERER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL_WIDTH_CELL_RENDERER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.GROUP_ROW_RENDERER")
    @js.native
    def GROUP_ROW_RENDERER: js.Any = js.native
    inline def GROUP_ROW_RENDERER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_ROW_RENDERER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.GROUP_ROW_RENDERER_COMP_NAME")
    @js.native
    def GROUP_ROW_RENDERER_COMP_NAME: js.Any = js.native
    inline def GROUP_ROW_RENDERER_COMP_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_ROW_RENDERER_COMP_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.LOADING_CELL_RENDERER")
    @js.native
    def LOADING_CELL_RENDERER: js.Any = js.native
    inline def LOADING_CELL_RENDERER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING_CELL_RENDERER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp.LOADING_CELL_RENDERER_COMP_NAME")
    @js.native
    def LOADING_CELL_RENDERER_COMP_NAME: js.Any = js.native
    inline def LOADING_CELL_RENDERER_COMP_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING_CELL_RENDERER_COMP_NAME")(x.asInstanceOf[js.Any])
  }
}
