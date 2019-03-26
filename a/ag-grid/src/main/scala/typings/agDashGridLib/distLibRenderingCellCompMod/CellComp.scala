package typings
package agDashGridLib.distLibRenderingCellCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellComp", "CellComp")
@js.native
class CellComp protected ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  def this(scope: js.Any, beans: agDashGridLib.distLibRenderingBeansMod.Beans, column: agDashGridLib.distLibEntitiesColumnMod.Column, rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, rowComp: agDashGridLib.distLibRenderingRowCompMod.RowComp, autoHeightCell: scala.Boolean) = this()
  var autoHeightCell: js.Any = js.native
  var beans: js.Any = js.native
  var cellEditor: js.Any = js.native
  var cellEditorInPopup: js.Any = js.native
  var cellEditorVersion: js.Any = js.native
  var cellFocused: js.Any = js.native
  var cellRenderer: js.Any = js.native
  var cellRendererGui: js.Any = js.native
  var cellRendererType: js.Any = js.native
  var cellRendererVersion: js.Any = js.native
  var colsSpanning: js.Any = js.native
  var column: js.Any = js.native
  var eCellWrapper: js.Any = js.native
  var eParentOfValue: js.Any = js.native
  var eParentRow: js.Any = js.native
  var editingCell: js.Any = js.native
  var firstRightPinned: js.Any = js.native
  var gridCell: js.Any = js.native
  var hideEditorPopup: js.Any = js.native
  var includeRowDraggingComponent: js.Any = js.native
  var includeSelectionComponent: js.Any = js.native
  var lastIPadMouseClickEvent: js.Any = js.native
  var lastLeftPinned: js.Any = js.native
  var rangeCount: js.Any = js.native
  var rangeSelectionEnabled: js.Any = js.native
  var rowComp: js.Any = js.native
  var rowNode: js.Any = js.native
  var rowSpan: js.Any = js.native
  var scope: js.Any = js.native
  var tooltip: js.Any = js.native
  var usingCellRenderer: js.Any = js.native
  var usingWrapper: js.Any = js.native
  var value: js.Any = js.native
  var valueFormatted: js.Any = js.native
  /* private */ def addDomData(): js.Any = js.native
  /* private */ def addInCellEditor(): js.Any = js.native
  /* private */ def addPopupCellEditor(): js.Any = js.native
  /* private */ def addRowDragging(): js.Any = js.native
  /* private */ def addSelectionCheckbox(): js.Any = js.native
  def afterAttached(): scala.Unit = js.native
  /* private */ def afterCellEditorCreated(cellEditorVersion: js.Any, cellEditor: js.Any): js.Any = js.native
  /* private */ def afterCellRendererCreated(cellRendererVersion: js.Any, cellRenderer: js.Any): js.Any = js.native
  /* private */ def angular1Compile(): js.Any = js.native
  /* private */ def animateCell(cssName: js.Any): js.Any = js.native
  /* private */ def attachCellRenderer(): js.Any = js.native
  def attemptCellRendererRefresh(): scala.Boolean = js.native
  /* private */ def chooseCellRenderer(): js.Any = js.native
  /* private */ def createCellEditorParams(keyPress: js.Any, charPress: js.Any, cellStartedEdit: js.Any): js.Any = js.native
  /* private */ def createCellRendererInstance(): js.Any = js.native
  /* private */ def createCellRendererParams(): js.Any = js.native
  /* private */ def createEvent(domEvent: js.Any, eventType: js.Any): js.Any = js.native
  /* private */ def createGridCellVo(): js.Any = js.native
  def detach(): scala.Unit = js.native
  def dispatchCellContextMenuEvent(event: stdLib.Event): scala.Unit = js.native
  /* private */ def doIeFocusHack(): js.Any = js.native
  def doesUserWantToCancelKeyboardEvent(event: stdLib.KeyboardEvent): scala.Boolean = js.native
  def flashCell(): scala.Unit = js.native
  def focusCell(): scala.Unit = js.native
  def focusCell(forceBrowserFocus: scala.Boolean): scala.Unit = js.native
  /* private */ def formatValue(value: js.Any): js.Any = js.native
  def getCellEditor(): agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp = js.native
  /* private */ def getCellLeft(): js.Any = js.native
  def getCellRenderer(): agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererComp = js.native
  /* private */ def getCellWidth(): js.Any = js.native
  /* private */ def getColSpanningList(): js.Any = js.native
  def getColumn(): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getCreateTemplate(): java.lang.String = js.native
  def getGridCell(): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  /* private */ def getInitialCssClasses(): js.Any = js.native
  def getInitialValueToRender(): java.lang.String = js.native
  def getParentRow(): stdLib.HTMLElement = js.native
  /* private */ def getRangeClasses(): js.Any = js.native
  def getRenderedRow(): agDashGridLib.distLibRenderingRowCompMod.RowComp = js.native
  /* private */ def getStylesForRowSpanning(): js.Any = js.native
  /* private */ def getToolTip(): js.Any = js.native
  /* private */ def getValue(): js.Any = js.native
  /* private */ def getValueAndFormat(): js.Any = js.native
  /* private */ def getValueToUse(): js.Any = js.native
  def isCellEditable(): scala.Boolean = js.native
  /* private */ def isDoubleClickOnIPad(): js.Any = js.native
  def isEditing(): scala.Boolean = js.native
  def isSuppressNavigable(): scala.Boolean = js.native
  /* private */ def navigateAfterEdit(): js.Any = js.native
  /* private */ def onBackspaceOrDeleteKeyPressed(key: js.Any): js.Any = js.native
  /* private */ def onCellChanged(event: js.Any): js.Any = js.native
  /* private */ def onCellClicked(mouseEvent: js.Any): js.Any = js.native
  /* private */ def onCellDoubleClicked(mouseEvent: js.Any): js.Any = js.native
  /* private */ def onCellFocused(): js.Any = js.native
  /* private */ def onCellFocused(event: js.Any): js.Any = js.native
  /* private */ def onColumnHover(): js.Any = js.native
  /* private */ def onDisplayColumnsChanged(): js.Any = js.native
  /* private */ def onEnterKeyDown(): js.Any = js.native
  /* private */ def onEscapeKeyDown(): js.Any = js.native
  /* private */ def onF2KeyDown(): js.Any = js.native
  /* private */ def onFirstRightPinnedChanged(): js.Any = js.native
  /* private */ def onFlashCells(event: js.Any): js.Any = js.native
  def onKeyDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def onKeyPress(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /* private */ def onLastLeftPinnedChanged(): js.Any = js.native
  /* private */ def onLeftChanged(): js.Any = js.native
  /* private */ def onMouseDown(mouseEvent: js.Any): js.Any = js.native
  def onMouseEvent(eventName: java.lang.String, mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
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
  /* private */ def processCellClassRules(onApplicableClass: js.Any): js.Any = js.native
  /* private */ def processCellClassRules(onApplicableClass: js.Any, onNotApplicableClass: js.Any): js.Any = js.native
  /* private */ def processClassesFromColDef(onApplicableClass: js.Any): js.Any = js.native
  /* private */ def processStylesFromColDef(): js.Any = js.native
  /* private */ def putDataIntoCellAfterRefresh(): js.Any = js.native
  def refreshCell(): scala.Unit = js.native
  def refreshCell(params: agDashGridLib.Anon_ForceRefresh): scala.Unit = js.native
  /* private */ def refreshToolTip(): js.Any = js.native
  /* private */ def replaceContentsAfterRefresh(): js.Any = js.native
  def setFocusInOnEditor(): scala.Unit = js.native
  def setFocusOutOnEditor(): scala.Unit = js.native
  /* private */ def setInlineEditingClass(): js.Any = js.native
  def setParentRow(eParentRow: stdLib.HTMLElement): scala.Unit = js.native
  def setUsingWrapper(): scala.Unit = js.native
  /* private */ def setupColSpan(): js.Any = js.native
  def startEditingIfEnabled(): scala.Unit = js.native
  def startEditingIfEnabled(keyPress: scala.Double): scala.Unit = js.native
  def startEditingIfEnabled(keyPress: scala.Double, charPress: java.lang.String): scala.Unit = js.native
  def startEditingIfEnabled(keyPress: scala.Double, charPress: java.lang.String, cellStartedEdit: scala.Boolean): scala.Unit = js.native
  def startRowOrCellEdit(): scala.Unit = js.native
  def startRowOrCellEdit(keyPress: scala.Double): scala.Unit = js.native
  def startRowOrCellEdit(keyPress: scala.Double, charPress: java.lang.String): scala.Unit = js.native
  def stopEditing(): scala.Unit = js.native
  def stopEditing(cancel: scala.Boolean): scala.Unit = js.native
  /* private */ def stopEditingAndFocus(): js.Any = js.native
  /* private */ def stopEditingAndFocus(suppressNavigateAfterEdit: js.Any): js.Any = js.native
  def stopRowOrCellEdit(): scala.Unit = js.native
  def stopRowOrCellEdit(cancel: scala.Boolean): scala.Unit = js.native
  /* private */ def valuesAreEqual(val1: js.Any, val2: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellComp", "CellComp")
@js.native
object CellComp extends js.Object {
  var DOM_DATA_KEY_CELL_COMP: java.lang.String = js.native
}

