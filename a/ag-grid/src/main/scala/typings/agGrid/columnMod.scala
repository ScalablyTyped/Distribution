package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.eventsMod.ColumnEventType
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("ag-grid/dist/lib/entities/column", "Column")
  @js.native
  class Column protected ()
    extends StObject
       with ColumnGroupChild
       with OriginalColumnGroupChild {
    def this(colDef: ColDef, colId: String, primary: Boolean) = this()
    
    var actualWidth: js.Any = js.native
    
    var aggFunc: js.Any = js.native
    
    var aggregationActive: js.Any = js.native
    
    var colDef: js.Any = js.native
    
    var colId: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnUtils: js.Any = js.native
    
    /* private */ def createBaseColDefParams(rowNode: js.Any): js.Any = js.native
    
    /* private */ def createColumnEvent(`type`: js.Any, source: js.Any): js.Any = js.native
    
    /* private */ def createIsColumnFuncParams(rowNode: js.Any): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var fieldContainsDots: js.Any = js.native
    
    var filterActive: js.Any = js.native
    
    var firstRightPinned: js.Any = js.native
    
    var frameworkFactory: js.Any = js.native
    
    def getAggFunc(): String | IAggFunc = js.native
    
    def getColDef(): ColDef = js.native
    
    def getColId(): String = js.native
    
    def getColSpan(rowNode: RowNode): Double = js.native
    
    /* InferMemberOverrides */
    override def getColumnGroupShow(): String = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    def getMaxWidth(): Double = js.native
    
    def getMenuTabs(defaultValues: js.Array[String]): js.Array[String] = js.native
    
    def getPinned(): String = js.native
    
    def getRight(): Double = js.native
    
    def getRowSpan(rowNode: RowNode): Double = js.native
    
    def getSort(): String = js.native
    
    def getSortedAt(): Double = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def initialise(): Unit = js.native
    
    def isAllowPivot(): Boolean = js.native
    
    def isAllowRowGroup(): Boolean = js.native
    
    def isAllowValue(): Boolean = js.native
    
    def isAnyFunctionActive(): Boolean = js.native
    
    def isAnyFunctionAllowed(): Boolean = js.native
    
    def isCellCheckboxSelection(rowNode: RowNode): Boolean = js.native
    
    def isCellEditable(rowNode: RowNode): Boolean = js.native
    
    /* private */ def isColumnFunc(rowNode: js.Any, value: js.Any): js.Any = js.native
    
    def isFieldContainsDots(): Boolean = js.native
    
    def isFilterActive(): Boolean = js.native
    
    def isFilterAllowed(): Boolean = js.native
    
    def isFirstRightPinned(): Boolean = js.native
    
    def isGreaterThanMax(width: Double): Boolean = js.native
    
    def isLastLeftPinned(): Boolean = js.native
    
    def isLockPinned(): Boolean = js.native
    
    def isLockPosition(): Boolean = js.native
    
    def isLockVisible(): Boolean = js.native
    
    def isMenuVisible(): Boolean = js.native
    
    def isPinned(): Boolean = js.native
    
    def isPinnedLeft(): Boolean = js.native
    
    def isPinnedRight(): Boolean = js.native
    
    def isPivotActive(): Boolean = js.native
    
    def isPrimary(): Boolean = js.native
    
    def isRowDrag(rowNode: RowNode): Boolean = js.native
    
    def isRowGroupActive(): Boolean = js.native
    
    def isRowGroupDisplayed(colId: String): Boolean = js.native
    
    def isSortAscending(): Boolean = js.native
    
    def isSortDescending(): Boolean = js.native
    
    def isSortNone(): Boolean = js.native
    
    def isSorting(): Boolean = js.native
    
    def isSuppressNavigable(rowNode: RowNode): Boolean = js.native
    
    def isSuppressPaste(rowNode: RowNode): Boolean = js.native
    
    def isTooltipFieldContainsDots(): Boolean = js.native
    
    def isValueActive(): Boolean = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
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
    
    def setActualWidth(actualWidth: Double): Unit = js.native
    def setActualWidth(actualWidth: Double, source: ColumnEventType): Unit = js.native
    
    def setAggFunc(aggFunc: String): Unit = js.native
    def setAggFunc(aggFunc: IAggFunc): Unit = js.native
    
    def setFilterActive(active: Boolean): Unit = js.native
    def setFilterActive(active: Boolean, source: ColumnEventType): Unit = js.native
    
    def setFirstRightPinned(firstRightPinned: Boolean): Unit = js.native
    def setFirstRightPinned(firstRightPinned: Boolean, source: ColumnEventType): Unit = js.native
    
    def setLastLeftPinned(lastLeftPinned: Boolean): Unit = js.native
    def setLastLeftPinned(lastLeftPinned: Boolean, source: ColumnEventType): Unit = js.native
    
    def setLeft(left: Double): Unit = js.native
    def setLeft(left: Double, source: ColumnEventType): Unit = js.native
    
    def setMenuVisible(visible: Boolean): Unit = js.native
    def setMenuVisible(visible: Boolean, source: ColumnEventType): Unit = js.native
    
    def setMinimum(): Unit = js.native
    def setMinimum(source: ColumnEventType): Unit = js.native
    
    def setMoving(moving: Boolean): Unit = js.native
    def setMoving(moving: Boolean, source: ColumnEventType): Unit = js.native
    
    def setPinned(pinned: String): Unit = js.native
    def setPinned(pinned: Boolean): Unit = js.native
    
    def setPivotActive(pivot: Boolean): Unit = js.native
    def setPivotActive(pivot: Boolean, source: ColumnEventType): Unit = js.native
    
    def setRowGroupActive(rowGroup: Boolean): Unit = js.native
    def setRowGroupActive(rowGroup: Boolean, source: ColumnEventType): Unit = js.native
    
    def setSort(sort: String): Unit = js.native
    def setSort(sort: String, source: ColumnEventType): Unit = js.native
    
    def setSortedAt(sortedAt: Double): Unit = js.native
    
    def setValueActive(value: Boolean): Unit = js.native
    def setValueActive(value: Boolean, source: ColumnEventType): Unit = js.native
    
    def setVisible(visible: Boolean): Unit = js.native
    def setVisible(visible: Boolean, source: ColumnEventType): Unit = js.native
    
    var sort: js.Any = js.native
    
    var sortedAt: js.Any = js.native
    
    var tooltipFieldContainsDots: js.Any = js.native
    
    /* private */ def validate(): js.Any = js.native
    
    var visible: js.Any = js.native
  }
  /* static members */
  object Column {
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_FILTER_ACTIVE_CHANGED")
    @js.native
    def EVENT_FILTER_ACTIVE_CHANGED: String = js.native
    @scala.inline
    def EVENT_FILTER_ACTIVE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILTER_ACTIVE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_FILTER_CHANGED")
    @js.native
    def EVENT_FILTER_CHANGED: String = js.native
    @scala.inline
    def EVENT_FILTER_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILTER_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_FIRST_RIGHT_PINNED_CHANGED")
    @js.native
    def EVENT_FIRST_RIGHT_PINNED_CHANGED: String = js.native
    @scala.inline
    def EVENT_FIRST_RIGHT_PINNED_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FIRST_RIGHT_PINNED_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_LAST_LEFT_PINNED_CHANGED")
    @js.native
    def EVENT_LAST_LEFT_PINNED_CHANGED: String = js.native
    @scala.inline
    def EVENT_LAST_LEFT_PINNED_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LAST_LEFT_PINNED_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_LEFT_CHANGED")
    @js.native
    def EVENT_LEFT_CHANGED: String = js.native
    @scala.inline
    def EVENT_LEFT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LEFT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_MENU_VISIBLE_CHANGED")
    @js.native
    def EVENT_MENU_VISIBLE_CHANGED: String = js.native
    @scala.inline
    def EVENT_MENU_VISIBLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_MENU_VISIBLE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_MOVING_CHANGED")
    @js.native
    def EVENT_MOVING_CHANGED: String = js.native
    @scala.inline
    def EVENT_MOVING_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_MOVING_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_PIVOT_CHANGED")
    @js.native
    def EVENT_PIVOT_CHANGED: String = js.native
    @scala.inline
    def EVENT_PIVOT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_PIVOT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_ROW_GROUP_CHANGED")
    @js.native
    def EVENT_ROW_GROUP_CHANGED: String = js.native
    @scala.inline
    def EVENT_ROW_GROUP_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_ROW_GROUP_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_SORT_CHANGED")
    @js.native
    def EVENT_SORT_CHANGED: String = js.native
    @scala.inline
    def EVENT_SORT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SORT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_VALUE_CHANGED")
    @js.native
    def EVENT_VALUE_CHANGED: String = js.native
    @scala.inline
    def EVENT_VALUE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_VALUE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_VISIBLE_CHANGED")
    @js.native
    def EVENT_VISIBLE_CHANGED: String = js.native
    @scala.inline
    def EVENT_VISIBLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_VISIBLE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.EVENT_WIDTH_CHANGED")
    @js.native
    def EVENT_WIDTH_CHANGED: String = js.native
    @scala.inline
    def EVENT_WIDTH_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_WIDTH_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.PINNED_LEFT")
    @js.native
    def PINNED_LEFT: String = js.native
    @scala.inline
    def PINNED_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PINNED_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.PINNED_RIGHT")
    @js.native
    def PINNED_RIGHT: String = js.native
    @scala.inline
    def PINNED_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PINNED_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.SORT_ASC")
    @js.native
    def SORT_ASC: String = js.native
    @scala.inline
    def SORT_ASC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_ASC")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/column", "Column.SORT_DESC")
    @js.native
    def SORT_DESC: String = js.native
    @scala.inline
    def SORT_DESC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_DESC")(x.asInstanceOf[js.Any])
  }
}
