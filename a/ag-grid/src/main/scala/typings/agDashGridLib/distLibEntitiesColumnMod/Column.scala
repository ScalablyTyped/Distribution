package typings
package agDashGridLib.distLibEntitiesColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/column", "Column")
@js.native
class Column protected ()
  extends agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild
     with agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild {
  def this(colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef, colId: java.lang.String, primary: scala.Boolean) = this()
  var actualWidth: js.Any = js.native
  var aggFunc: js.Any = js.native
  var aggregationActive: js.Any = js.native
  var colDef: js.Any = js.native
  var colId: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnUtils: js.Any = js.native
  var eventService: js.Any = js.native
  var fieldContainsDots: js.Any = js.native
  var filterActive: js.Any = js.native
  var firstRightPinned: js.Any = js.native
  var frameworkFactory: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var lastLeftPinned: js.Any = js.native
  var left: js.Any = js.native
  var lockPinned: js.Any = js.native
  var lockPosition: js.Any = js.native
  var lockVisible: js.Any = js.native
  var maxWidth: js.Any = js.native
  var menuVisible: js.Any = js.native
  var minWidth: js.Any = js.native
  var moving: js.Any = js.native
  var oldLeft: js.Any = js.native
  var parent: js.Any = js.native
  var pinned: js.Any = js.native
  var pivotActive: js.Any = js.native
  var primary: js.Any = js.native
  var rowGroupActive: js.Any = js.native
  var sort: js.Any = js.native
  var sortedAt: js.Any = js.native
  var tooltipFieldContainsDots: js.Any = js.native
  var visible: js.Any = js.native
  /* private */ def createBaseColDefParams(rowNode: js.Any): js.Any = js.native
  /* private */ def createColumnEvent(`type`: js.Any, source: js.Any): js.Any = js.native
  /* private */ def createIsColumnFuncParams(rowNode: js.Any): js.Any = js.native
  def getAggFunc(): java.lang.String | agDashGridLib.distLibEntitiesColDefMod.IAggFunc = js.native
  def getColDef(): agDashGridLib.distLibEntitiesColDefMod.ColDef = js.native
  def getColId(): java.lang.String = js.native
  def getColSpan(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Double = js.native
  /* InferMemberOverrides */
  override def getColumnGroupShow(): java.lang.String = js.native
  /* CompleteClass */
  override def getId(): java.lang.String = js.native
  def getMaxWidth(): scala.Double = js.native
  def getMenuTabs(defaultValues: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def getPinned(): java.lang.String = js.native
  def getRight(): scala.Double = js.native
  def getRowSpan(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Double = js.native
  def getSort(): java.lang.String = js.native
  def getSortedAt(): scala.Double = js.native
  def initialise(): scala.Unit = js.native
  def isAllowPivot(): scala.Boolean = js.native
  def isAllowRowGroup(): scala.Boolean = js.native
  def isAllowValue(): scala.Boolean = js.native
  def isAnyFunctionActive(): scala.Boolean = js.native
  def isAnyFunctionAllowed(): scala.Boolean = js.native
  def isCellCheckboxSelection(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def isCellEditable(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  /* private */ def isColumnFunc(rowNode: js.Any, value: js.Any): js.Any = js.native
  def isFieldContainsDots(): scala.Boolean = js.native
  def isFilterActive(): scala.Boolean = js.native
  def isFilterAllowed(): scala.Boolean = js.native
  def isFirstRightPinned(): scala.Boolean = js.native
  def isGreaterThanMax(width: scala.Double): scala.Boolean = js.native
  def isLastLeftPinned(): scala.Boolean = js.native
  def isLockPinned(): scala.Boolean = js.native
  def isLockPosition(): scala.Boolean = js.native
  def isLockVisible(): scala.Boolean = js.native
  def isMenuVisible(): scala.Boolean = js.native
  def isPinned(): scala.Boolean = js.native
  def isPinnedLeft(): scala.Boolean = js.native
  def isPinnedRight(): scala.Boolean = js.native
  def isPivotActive(): scala.Boolean = js.native
  def isPrimary(): scala.Boolean = js.native
  def isRowDrag(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def isRowGroupActive(): scala.Boolean = js.native
  def isRowGroupDisplayed(colId: java.lang.String): scala.Boolean = js.native
  def isSortAscending(): scala.Boolean = js.native
  def isSortDescending(): scala.Boolean = js.native
  def isSortNone(): scala.Boolean = js.native
  def isSorting(): scala.Boolean = js.native
  def isSuppressNavigable(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def isSuppressPaste(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def isTooltipFieldContainsDots(): scala.Boolean = js.native
  def isValueActive(): scala.Boolean = js.native
  /* CompleteClass */
  override def isVisible(): scala.Boolean = js.native
  def setActualWidth(actualWidth: scala.Double): scala.Unit = js.native
  def setActualWidth(actualWidth: scala.Double, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setAggFunc(aggFunc: agDashGridLib.distLibEntitiesColDefMod.IAggFunc): scala.Unit = js.native
  def setAggFunc(aggFunc: java.lang.String): scala.Unit = js.native
  def setFilterActive(active: scala.Boolean): scala.Unit = js.native
  def setFilterActive(active: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setFirstRightPinned(firstRightPinned: scala.Boolean): scala.Unit = js.native
  def setFirstRightPinned(firstRightPinned: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setLastLeftPinned(lastLeftPinned: scala.Boolean): scala.Unit = js.native
  def setLastLeftPinned(lastLeftPinned: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setLeft(left: scala.Double): scala.Unit = js.native
  def setLeft(left: scala.Double, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setMenuVisible(visible: scala.Boolean): scala.Unit = js.native
  def setMenuVisible(visible: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setMinimum(): scala.Unit = js.native
  def setMinimum(source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setMoving(moving: scala.Boolean): scala.Unit = js.native
  def setMoving(moving: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setPinned(pinned: java.lang.String): scala.Unit = js.native
  def setPinned(pinned: scala.Boolean): scala.Unit = js.native
  def setPivotActive(pivot: scala.Boolean): scala.Unit = js.native
  def setPivotActive(pivot: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setRowGroupActive(rowGroup: scala.Boolean): scala.Unit = js.native
  def setRowGroupActive(rowGroup: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setSort(sort: java.lang.String): scala.Unit = js.native
  def setSort(sort: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setSortedAt(sortedAt: scala.Double): scala.Unit = js.native
  def setValueActive(value: scala.Boolean): scala.Unit = js.native
  def setValueActive(value: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setVisible(visible: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  /* private */ def validate(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/entities/column", "Column")
@js.native
object Column extends js.Object {
  var EVENT_FILTER_ACTIVE_CHANGED: java.lang.String = js.native
  var EVENT_FILTER_CHANGED: java.lang.String = js.native
  var EVENT_FIRST_RIGHT_PINNED_CHANGED: java.lang.String = js.native
  var EVENT_LAST_LEFT_PINNED_CHANGED: java.lang.String = js.native
  var EVENT_LEFT_CHANGED: java.lang.String = js.native
  var EVENT_MENU_VISIBLE_CHANGED: java.lang.String = js.native
  var EVENT_MOVING_CHANGED: java.lang.String = js.native
  var EVENT_PIVOT_CHANGED: java.lang.String = js.native
  var EVENT_ROW_GROUP_CHANGED: java.lang.String = js.native
  var EVENT_SORT_CHANGED: java.lang.String = js.native
  var EVENT_VALUE_CHANGED: java.lang.String = js.native
  var EVENT_VISIBLE_CHANGED: java.lang.String = js.native
  var EVENT_WIDTH_CHANGED: java.lang.String = js.native
  var PINNED_LEFT: java.lang.String = js.native
  var PINNED_RIGHT: java.lang.String = js.native
  var SORT_ASC: java.lang.String = js.native
  var SORT_DESC: java.lang.String = js.native
}

