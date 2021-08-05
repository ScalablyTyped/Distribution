package typings.agGrid

import typings.agGrid.anon.ForceRefresh
import typings.agGrid.beansMod.Beans
import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.gridCellMod.GridCell
import typings.agGrid.iCellEditorMod.ICellEditorComp
import typings.agGrid.iCellRendererMod.ICellRendererComp
import typings.agGrid.rowCompMod.RowComp
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellCompMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellComp", "CellComp")
  @js.native
  class CellComp protected () extends Component {
    def this(
      scope: js.Any,
      beans: Beans,
      column: Column,
      rowNode: RowNode,
      rowComp: RowComp,
      autoHeightCell: Boolean
    ) = this()
    
    /* private */ def addDomData(): js.Any = js.native
    
    /* private */ def addInCellEditor(): js.Any = js.native
    
    /* private */ def addPopupCellEditor(): js.Any = js.native
    
    /* private */ def addRowDragging(): js.Any = js.native
    
    /* private */ def addSelectionCheckbox(): js.Any = js.native
    
    def afterAttached(): Unit = js.native
    
    /* private */ def afterCellEditorCreated(cellEditorVersion: js.Any, cellEditor: js.Any): js.Any = js.native
    
    /* private */ def afterCellRendererCreated(cellRendererVersion: js.Any, cellRenderer: js.Any): js.Any = js.native
    
    /* private */ def angular1Compile(): js.Any = js.native
    
    /* private */ def animateCell(cssName: js.Any): js.Any = js.native
    
    /* private */ def attachCellRenderer(): js.Any = js.native
    
    def attemptCellRendererRefresh(): Boolean = js.native
    
    /* private */ var autoHeightCell: js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var cellEditor: js.Any = js.native
    
    /* private */ var cellEditorInPopup: js.Any = js.native
    
    /* private */ var cellEditorVersion: js.Any = js.native
    
    /* private */ var cellFocused: js.Any = js.native
    
    /* private */ var cellRenderer: js.Any = js.native
    
    /* private */ var cellRendererGui: js.Any = js.native
    
    /* private */ var cellRendererType: js.Any = js.native
    
    /* private */ var cellRendererVersion: js.Any = js.native
    
    /* private */ def chooseCellRenderer(): js.Any = js.native
    
    /* private */ var colsSpanning: js.Any = js.native
    
    /* private */ var column: js.Any = js.native
    
    /* private */ def createCellEditorParams(keyPress: js.Any, charPress: js.Any, cellStartedEdit: js.Any): js.Any = js.native
    
    /* private */ def createCellRendererInstance(): js.Any = js.native
    
    /* private */ def createCellRendererParams(): js.Any = js.native
    
    /* private */ def createEvent(domEvent: js.Any, eventType: js.Any): js.Any = js.native
    
    /* private */ def createGridCellVo(): js.Any = js.native
    
    def detach(): Unit = js.native
    
    def dispatchCellContextMenuEvent(event: Event): Unit = js.native
    
    /* private */ def doIeFocusHack(): js.Any = js.native
    
    def doesUserWantToCancelKeyboardEvent(event: KeyboardEvent): Boolean = js.native
    
    /* private */ var eCellWrapper: js.Any = js.native
    
    /* private */ var eParentOfValue: js.Any = js.native
    
    /* private */ var eParentRow: js.Any = js.native
    
    /* private */ var editingCell: js.Any = js.native
    
    /* private */ var firstRightPinned: js.Any = js.native
    
    def flashCell(): Unit = js.native
    
    def focusCell(): Unit = js.native
    def focusCell(forceBrowserFocus: Boolean): Unit = js.native
    
    /* private */ def formatValue(value: js.Any): js.Any = js.native
    
    def getCellEditor(): ICellEditorComp = js.native
    
    /* private */ def getCellLeft(): js.Any = js.native
    
    def getCellRenderer(): ICellRendererComp = js.native
    
    /* private */ def getCellWidth(): js.Any = js.native
    
    /* private */ def getColSpanningList(): js.Any = js.native
    
    def getColumn(): Column = js.native
    
    def getCreateTemplate(): String = js.native
    
    def getGridCell(): GridCell = js.native
    
    /* private */ def getInitialCssClasses(): js.Any = js.native
    
    def getInitialValueToRender(): String = js.native
    
    def getParentRow(): HTMLElement = js.native
    
    /* private */ def getRangeClasses(): js.Any = js.native
    
    def getRenderedRow(): RowComp = js.native
    
    /* private */ def getStylesForRowSpanning(): js.Any = js.native
    
    /* private */ def getToolTip(): js.Any = js.native
    
    /* private */ def getValue(): js.Any = js.native
    
    /* private */ def getValueAndFormat(): js.Any = js.native
    
    /* private */ def getValueToUse(): js.Any = js.native
    
    /* private */ var gridCell: js.Any = js.native
    
    /* private */ var hideEditorPopup: js.Any = js.native
    
    /* private */ var includeRowDraggingComponent: js.Any = js.native
    
    /* private */ var includeSelectionComponent: js.Any = js.native
    
    def isCellEditable(): Boolean = js.native
    
    /* private */ def isDoubleClickOnIPad(): js.Any = js.native
    
    def isEditing(): Boolean = js.native
    
    def isSuppressNavigable(): Boolean = js.native
    
    /* private */ var lastIPadMouseClickEvent: js.Any = js.native
    
    /* private */ var lastLeftPinned: js.Any = js.native
    
    /* private */ def navigateAfterEdit(): js.Any = js.native
    
    /* private */ def onBackspaceOrDeleteKeyPressed(key: js.Any): js.Any = js.native
    
    /* private */ def onCellChanged(event: js.Any): js.Any = js.native
    
    /* private */ def onCellClicked(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onCellDoubleClicked(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onCellFocused(event: js.Any): js.Any = js.native
    
    /* private */ def onColumnHover(): js.Any = js.native
    
    /* private */ def onDisplayColumnsChanged(): js.Any = js.native
    
    /* private */ def onEnterKeyDown(): js.Any = js.native
    
    /* private */ def onEscapeKeyDown(): js.Any = js.native
    
    /* private */ def onF2KeyDown(): js.Any = js.native
    
    /* private */ def onFirstRightPinnedChanged(): js.Any = js.native
    
    /* private */ def onFlashCells(event: js.Any): js.Any = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def onKeyPress(event: KeyboardEvent): Unit = js.native
    
    /* private */ def onLastLeftPinnedChanged(): js.Any = js.native
    
    /* private */ def onLeftChanged(): js.Any = js.native
    
    /* private */ def onMouseDown(mouseEvent: js.Any): js.Any = js.native
    
    def onMouseEvent(eventName: String, mouseEvent: MouseEvent): Unit = js.native
    
    /* private */ def onMouseOut(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onMouseOver(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def onNavigationKeyPressed(event: js.Any, key: js.Any): js.Any = js.native
    
    /* private */ def onPopupEditorClosed(): js.Any = js.native
    
    /* private */ def onRangeSelectionChanged(): js.Any = js.native
    
    /* private */ def onRowIndexChanged(): js.Any = js.native
    
    /* private */ def onShiftRangeSelect(key: js.Any): js.Any = js.native
    
    /* private */ def onSpaceKeyPressed(event: js.Any): js.Any = js.native
    
    /* private */ def onTabKeyDown(event: js.Any): js.Any = js.native
    
    /* private */ def onWidthChanged(): js.Any = js.native
    
    /* private */ def parseValue(newValue: js.Any): js.Any = js.native
    
    /* private */ def populateTemplate(): js.Any = js.native
    
    /* private */ def postProcessCellClassRules(): js.Any = js.native
    
    /* private */ def postProcessClassesFromColDef(): js.Any = js.native
    
    /* private */ def postProcessStylesFromColDef(): js.Any = js.native
    
    /* private */ def preProcessCellClassRules(): js.Any = js.native
    
    /* private */ def preProcessClassesFromColDef(): js.Any = js.native
    
    /* private */ def preProcessStylesFromColDef(): js.Any = js.native
    
    /* private */ def processCellClassRules(onApplicableClass: js.Any, onNotApplicableClass: js.Any): js.Any = js.native
    
    /* private */ def processClassesFromColDef(onApplicableClass: js.Any): js.Any = js.native
    
    /* private */ def processStylesFromColDef(): js.Any = js.native
    
    /* private */ def putDataIntoCellAfterRefresh(): js.Any = js.native
    
    /* private */ var rangeCount: js.Any = js.native
    
    /* private */ var rangeSelectionEnabled: js.Any = js.native
    
    def refreshCell(): Unit = js.native
    def refreshCell(params: ForceRefresh): Unit = js.native
    
    /* private */ def refreshToolTip(): js.Any = js.native
    
    /* private */ def replaceContentsAfterRefresh(): js.Any = js.native
    
    /* private */ var rowComp: js.Any = js.native
    
    /* private */ var rowNode: js.Any = js.native
    
    /* private */ var rowSpan: js.Any = js.native
    
    /* private */ var scope: js.Any = js.native
    
    def setFocusInOnEditor(): Unit = js.native
    
    def setFocusOutOnEditor(): Unit = js.native
    
    /* private */ def setInlineEditingClass(): js.Any = js.native
    
    def setParentRow(eParentRow: HTMLElement): Unit = js.native
    
    def setUsingWrapper(): Unit = js.native
    
    /* private */ def setupColSpan(): js.Any = js.native
    
    def startEditingIfEnabled(): Unit = js.native
    def startEditingIfEnabled(keyPress: Double): Unit = js.native
    def startEditingIfEnabled(keyPress: Double, charPress: String): Unit = js.native
    def startEditingIfEnabled(keyPress: Double, charPress: String, cellStartedEdit: Boolean): Unit = js.native
    def startEditingIfEnabled(keyPress: Double, charPress: Unit, cellStartedEdit: Boolean): Unit = js.native
    def startEditingIfEnabled(keyPress: Unit, charPress: String): Unit = js.native
    def startEditingIfEnabled(keyPress: Unit, charPress: String, cellStartedEdit: Boolean): Unit = js.native
    def startEditingIfEnabled(keyPress: Unit, charPress: Unit, cellStartedEdit: Boolean): Unit = js.native
    
    def startRowOrCellEdit(): Unit = js.native
    def startRowOrCellEdit(keyPress: Double): Unit = js.native
    def startRowOrCellEdit(keyPress: Double, charPress: String): Unit = js.native
    def startRowOrCellEdit(keyPress: Unit, charPress: String): Unit = js.native
    
    def stopEditing(): Unit = js.native
    def stopEditing(cancel: Boolean): Unit = js.native
    
    /* private */ def stopEditingAndFocus(suppressNavigateAfterEdit: js.Any): js.Any = js.native
    
    def stopRowOrCellEdit(): Unit = js.native
    def stopRowOrCellEdit(cancel: Boolean): Unit = js.native
    
    /* private */ var tooltip: js.Any = js.native
    
    /* private */ var usingCellRenderer: js.Any = js.native
    
    /* private */ var usingWrapper: js.Any = js.native
    
    /* private */ var value: js.Any = js.native
    
    /* private */ var valueFormatted: js.Any = js.native
    
    /* private */ def valuesAreEqual(val1: js.Any, val2: js.Any): js.Any = js.native
  }
  /* static members */
  object CellComp {
    
    @JSImport("ag-grid/dist/lib/rendering/cellComp", "CellComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellComp", "CellComp.DOM_DATA_KEY_CELL_COMP")
    @js.native
    def DOM_DATA_KEY_CELL_COMP: String = js.native
    inline def DOM_DATA_KEY_CELL_COMP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DATA_KEY_CELL_COMP")(x.asInstanceOf[js.Any])
  }
}
