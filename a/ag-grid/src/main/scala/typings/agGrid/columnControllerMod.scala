package typings.agGrid

import typings.agGrid.agGridStrings.left
import typings.agGrid.agGridStrings.right
import typings.agGrid.anon.GroupId
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.colDefMod.IAggFunc
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.columnMod.Column
import typings.agGrid.eventsMod.ColumnEventType
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnControllerMod {
  
  @JSImport("ag-grid/dist/lib/columnController/columnController", "ColumnController")
  @js.native
  class ColumnController () extends StObject {
    
    /* private */ def actionOnGridColumns(keys: js.Any, action: js.Any, source: js.Any, createEvent: js.Any): js.Any = js.native
    
    /* private */ def addAutoGroupToGridColumns(): js.Any = js.native
    
    def addPivotColumn(key: String): Unit = js.native
    def addPivotColumn(key: String, source: ColumnEventType): Unit = js.native
    def addPivotColumn(key: Column): Unit = js.native
    def addPivotColumn(key: Column, source: ColumnEventType): Unit = js.native
    
    def addPivotColumns(keys: js.Array[String | Column]): Unit = js.native
    def addPivotColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def addRowGroupColumn(key: String): Unit = js.native
    def addRowGroupColumn(key: String, source: ColumnEventType): Unit = js.native
    def addRowGroupColumn(key: Column): Unit = js.native
    def addRowGroupColumn(key: Column, source: ColumnEventType): Unit = js.native
    
    def addRowGroupColumns(keys: js.Array[String | Column]): Unit = js.native
    def addRowGroupColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    /* private */ def addToDisplayedColumns(displayedColumnTree: js.Any, displayedColumns: js.Any): js.Any = js.native
    
    def addValueColumn(colKey: String): Unit = js.native
    def addValueColumn(colKey: String, source: ColumnEventType): Unit = js.native
    def addValueColumn(colKey: Column): Unit = js.native
    def addValueColumn(colKey: Column, source: ColumnEventType): Unit = js.native
    
    def addValueColumns(keys: js.Array[String | Column]): Unit = js.native
    def addValueColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    var aggFuncService: js.Any = js.native
    
    var allDisplayedCenterVirtualColumns: js.Any = js.native
    
    var allDisplayedColumns: js.Any = js.native
    
    var allDisplayedVirtualColumns: js.Any = js.native
    
    var autoGroupColService: js.Any = js.native
    
    var autoGroupsNeedBuilding: js.Any = js.native
    
    var autoRowHeightColumns: js.Any = js.native
    
    def autoSizeAllColumns(): Unit = js.native
    def autoSizeAllColumns(source: ColumnEventType): Unit = js.native
    
    def autoSizeColumn(key: String): Unit = js.native
    def autoSizeColumn(key: String, source: ColumnEventType): Unit = js.native
    def autoSizeColumn(key: Column): Unit = js.native
    def autoSizeColumn(key: Column, source: ColumnEventType): Unit = js.native
    
    def autoSizeColumns(keys: js.Array[String | Column]): Unit = js.native
    def autoSizeColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    var autoWidthCalculator: js.Any = js.native
    
    var balancedColumnTreeBuilder: js.Any = js.native
    
    var bodyWidth: js.Any = js.native
    
    var bodyWidthDirty: js.Any = js.native
    
    /* private */ def buildDisplayedTrees(visibleColumns: js.Any): js.Any = js.native
    
    /* private */ def calculateColumnsForDisplay(): js.Any = js.native
    
    /* private */ def calculateColumnsForGroupDisplay(): js.Any = js.native
    
    /* private */ def checkColSpanActiveInCols(columns: js.Any): js.Any = js.native
    
    /* private */ def checkDisplayedVirtualColumns(): js.Any = js.native
    
    /* private */ def checkMinAndMaxWidthsForSet(columnResizeSet: js.Any): js.Any = js.native
    
    /* private */ def clearDisplayedColumns(): js.Any = js.native
    
    var colSpanActive: js.Any = js.native
    
    var columnAnimationService: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnUtils: js.Any = js.native
    
    var columnsForQuickFilter: js.Any = js.native
    
    /* private */ def columnsMatch(column: js.Any, key: js.Any): js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createGroupAutoColumnsIfNeeded(): js.Any = js.native
    
    /* private */ def createStateItemFromColumn(column: js.Any): js.Any = js.native
    
    /* private */ def createValueColumns(source: js.Any): js.Any = js.native
    
    var displayedCenterColumns: js.Any = js.native
    
    var displayedCentreColumnTree: js.Any = js.native
    
    var displayedCentreHeaderRows: js.Any = js.native
    
    var displayedGroupCreator: js.Any = js.native
    
    var displayedLeftColumnTree: js.Any = js.native
    
    var displayedLeftColumns: js.Any = js.native
    
    var displayedLeftHeaderRows: js.Any = js.native
    
    var displayedRightColumnTree: js.Any = js.native
    
    var displayedRightColumns: js.Any = js.native
    
    var displayedRightHeaderRows: js.Any = js.native
    
    def doesMovePassLockedPositions(proposedColumnOrder: js.Array[Column]): Boolean = js.native
    
    def doesMovePassMarryChildren(allColumnsCopy: js.Array[Column]): Boolean = js.native
    
    def doesMovePassRules(columnsToMove: js.Array[Column], toIndex: Double): Boolean = js.native
    
    var eventService: js.Any = js.native
    
    var expressionService: js.Any = js.native
    
    /* private */ def extractPivotColumns(source: js.Any): js.Any = js.native
    
    /* private */ def extractRowGroupColumns(source: js.Any): js.Any = js.native
    
    /* private */ def filterOutColumnsWithinViewport(): js.Any = js.native
    
    def getAllAutoRowHeightCols(): js.Array[Column] = js.native
    
    def getAllColumnsForQuickFilter(): js.Array[Column] = js.native
    
    def getAllDisplayedCenterVirtualColumnsForRow(rowNode: RowNode): js.Array[Column] = js.native
    
    def getAllDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getAllDisplayedColumns(): js.Array[Column] = js.native
    
    def getAllDisplayedVirtualColumns(): js.Array[Column] = js.native
    
    def getAllGridColumns(): js.Array[Column] = js.native
    
    def getAllPrimaryColumns(): js.Array[Column] = js.native
    
    /* private */ def getAutoColumn(key: js.Any): js.Any = js.native
    
    def getBodyContainerWidth(): Double = js.native
    
    def getCenterDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    /* private */ def getColumn(key: js.Any, columnList: js.Any): js.Any = js.native
    
    def getColumnGroup(colId: String): ColumnGroup = js.native
    def getColumnGroup(colId: String, instanceId: Double): ColumnGroup = js.native
    def getColumnGroup(colId: ColumnGroup): ColumnGroup = js.native
    def getColumnGroup(colId: ColumnGroup, instanceId: Double): ColumnGroup = js.native
    
    def getColumnGroupState(): js.Array[GroupId] = js.native
    
    def getColumnState(): js.Array[ColumnState] = js.native
    
    def getColumnWithValidation(key: String): Column = js.native
    def getColumnWithValidation(key: Column): Column = js.native
    
    /* private */ def getColumns(keys: js.Any, columnLookupCallback: js.Any): js.Any = js.native
    
    /* private */ def getColumnsFromTree(rootColumns: js.Any): js.Any = js.native
    
    def getContainerWidth(pinned: String): Double = js.native
    
    def getDisplayNameForColumn(column: Column, location: String): String = js.native
    def getDisplayNameForColumn(column: Column, location: String, includeAggFunc: Boolean): String = js.native
    
    def getDisplayNameForColumnGroup(columnGroup: ColumnGroup, location: String): String = js.native
    
    def getDisplayNameForOriginalColumnGroup(columnGroup: ColumnGroup, originalColumnGroup: OriginalColumnGroup, location: String): String = js.native
    
    def getDisplayedCenterColumns(): js.Array[Column] = js.native
    
    def getDisplayedColAfter(col: Column): Column = js.native
    
    def getDisplayedColBefore(col: Column): Column = js.native
    
    def getDisplayedColumnGroups(`type`: String): js.Array[ColumnGroupChild] = js.native
    
    def getDisplayedColumns(`type`: String): js.Array[Column] = js.native
    
    /* private */ def getDisplayedColumnsForRow(rowNode: js.Any, displayedColumns: js.Any, filterCallback: js.Any, emptySpaceBeforeColumn: js.Any): js.Any = js.native
    
    def getDisplayedColumnsStartingAt(column: Column): js.Array[Column] = js.native
    
    def getDisplayedGroupAfter(columnGroup: ColumnGroup): ColumnGroup = js.native
    
    def getDisplayedLeftColumns(): js.Array[Column] = js.native
    
    def getDisplayedLeftColumnsForRow(rowNode: RowNode): js.Array[Column] = js.native
    
    def getDisplayedRightColumns(): js.Array[Column] = js.native
    
    def getDisplayedRightColumnsForRow(rowNode: RowNode): js.Array[Column] = js.native
    
    def getGridBalancedTree(): js.Array[OriginalColumnGroupChild] = js.native
    
    def getGridColumn(key: String): Column = js.native
    def getGridColumn(key: Column): Column = js.native
    
    def getGridColumns(keys: js.Array[String | Column]): js.Array[Column] = js.native
    
    def getGroupAutoColumns(): js.Array[Column] = js.native
    
    def getGroupDisplayColumns(): js.Array[Column] = js.native
    
    /* private */ def getHeaderName(colDef: js.Any, column: js.Any, columnGroup: js.Any, originalColumnGroup: js.Any, location: js.Any): js.Any = js.native
    
    def getHeaderRowCount(): Double = js.native
    
    def getLeftDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getOriginalColumnGroup(key: String): OriginalColumnGroup = js.native
    def getOriginalColumnGroup(key: OriginalColumnGroup): OriginalColumnGroup = js.native
    
    def getPinnedLeftContainerWidth(): Double = js.native
    
    def getPinnedRightContainerWidth(): Double = js.native
    
    def getPivotColumns(): js.Array[Column] = js.native
    
    def getPrimaryAndSecondaryAndAutoColumns(): js.Array[Column] = js.native
    
    def getPrimaryColumn(key: String): Column = js.native
    def getPrimaryColumn(key: Column): Column = js.native
    
    def getPrimaryColumnTree(): js.Array[OriginalColumnGroupChild] = js.native
    
    /* private */ def getPrimaryOrGridColumn(key: js.Any): js.Any = js.native
    
    def getRightDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getRowGroupColumns(): js.Array[Column] = js.native
    
    def getSecondaryPivotColumn(pivotKeys: js.Array[String], valueColKey: String): Column = js.native
    def getSecondaryPivotColumn(pivotKeys: js.Array[String], valueColKey: Column): Column = js.native
    
    def getValueColumns(): js.Array[Column] = js.native
    
    def getVirtualHeaderGroupRow(`type`: String, dept: Double): js.Array[ColumnGroupChild] = js.native
    
    /* private */ def getWidthOfColsInList(columnList: js.Any): js.Any = js.native
    
    var gridApi: js.Any = js.native
    
    var gridBalancedTree: js.Any = js.native
    
    var gridColsArePrimary: js.Any = js.native
    
    var gridColumns: js.Any = js.native
    
    var gridHeaderRowCount: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var groupAutoColumns: js.Any = js.native
    
    var groupDisplayColumns: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isAutoRowHeightActive(): Boolean = js.native
    
    def isColumnDisplayed(column: Column): Boolean = js.native
    
    /* private */ def isColumnInViewport(col: js.Any): js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isPinningLeft(): Boolean = js.native
    
    def isPinningRight(): Boolean = js.native
    
    def isPivotActive(): Boolean = js.native
    
    def isPivotMode(): Boolean = js.native
    
    /* private */ def isPivotSettingAllowed(pivot: js.Any): js.Any = js.native
    
    def isPrimaryColumnGroupsPresent(): Boolean = js.native
    
    def isReady(): Boolean = js.native
    
    def isRowGroupEmpty(): Boolean = js.native
    
    def isSecondaryColumnsPresent(): Boolean = js.native
    
    var lastPrimaryOrder: js.Any = js.native
    
    var leftWidth: js.Any = js.native
    
    var logger: js.Any = js.native
    
    def moveColumn(key: String, toIndex: Double): Unit = js.native
    def moveColumn(key: String, toIndex: Double, source: ColumnEventType): Unit = js.native
    def moveColumn(key: Column, toIndex: Double): Unit = js.native
    def moveColumn(key: Column, toIndex: Double, source: ColumnEventType): Unit = js.native
    
    def moveColumnByIndex(fromIndex: Double, toIndex: Double): Unit = js.native
    def moveColumnByIndex(fromIndex: Double, toIndex: Double, source: ColumnEventType): Unit = js.native
    
    def moveColumns(columnsToMoveKeys: js.Array[String | Column], toIndex: Double): Unit = js.native
    def moveColumns(columnsToMoveKeys: js.Array[String | Column], toIndex: Double, source: ColumnEventType): Unit = js.native
    
    def moveRowGroupColumn(fromIndex: Double, toIndex: Double): Unit = js.native
    def moveRowGroupColumn(fromIndex: Double, toIndex: Double, source: ColumnEventType): Unit = js.native
    
    /* private */ def normaliseColumnWidth(column: js.Any, newWidth: js.Any): js.Any = js.native
    
    /* private */ def orderColumnStateList(columnStateList: js.Any): js.Any = js.native
    
    /* private */ def orderGridColsLikeLastPrimary(): js.Any = js.native
    
    var pivotColumns: js.Any = js.native
    
    var pivotMode: js.Any = js.native
    
    var primaryBalancedTree: js.Any = js.native
    
    var primaryColumns: js.Any = js.native
    
    var primaryHeaderRowCount: js.Any = js.native
    
    /* private */ def processSecondaryColumnDefinitions(colDefs: js.Any): js.Any = js.native
    
    /* private */ def putFixedColumnsFirst(): js.Any = js.native
    
    var ready: js.Any = js.native
    
    def removePivotColumn(key: String): Unit = js.native
    def removePivotColumn(key: String, source: ColumnEventType): Unit = js.native
    def removePivotColumn(key: Column): Unit = js.native
    def removePivotColumn(key: Column, source: ColumnEventType): Unit = js.native
    
    def removePivotColumns(keys: js.Array[String | Column]): Unit = js.native
    def removePivotColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def removeRowGroupColumn(key: String): Unit = js.native
    def removeRowGroupColumn(key: String, source: ColumnEventType): Unit = js.native
    def removeRowGroupColumn(key: Column): Unit = js.native
    def removeRowGroupColumn(key: Column, source: ColumnEventType): Unit = js.native
    
    def removeRowGroupColumns(keys: js.Array[String | Column]): Unit = js.native
    def removeRowGroupColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def removeValueColumn(colKey: String): Unit = js.native
    def removeValueColumn(colKey: String, source: ColumnEventType): Unit = js.native
    def removeValueColumn(colKey: Column): Unit = js.native
    def removeValueColumn(colKey: Column, source: ColumnEventType): Unit = js.native
    
    def removeValueColumns(keys: js.Array[String | Column]): Unit = js.native
    def removeValueColumns(keys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def resetColumnGroupState(): Unit = js.native
    def resetColumnGroupState(source: ColumnEventType): Unit = js.native
    
    def resetColumnState(): Unit = js.native
    def resetColumnState(source: ColumnEventType): Unit = js.native
    
    def resizeColumnSets(resizeSets: js.Array[ColumnResizeSet], finished: Boolean, source: ColumnEventType): Unit = js.native
    
    var rightWidth: js.Any = js.native
    
    var rowGroupColumns: js.Any = js.native
    
    var scrollPosition: js.Any = js.native
    
    var scrollWidth: js.Any = js.native
    
    var secondaryBalancedTree: js.Any = js.native
    
    var secondaryColumns: js.Any = js.native
    
    var secondaryColumnsPresent: js.Any = js.native
    
    var secondaryHeaderRowCount: js.Any = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
    
    def setColumnAggFunc(column: Column, aggFunc: String): Unit = js.native
    def setColumnAggFunc(column: Column, aggFunc: String, source: ColumnEventType): Unit = js.native
    
    def setColumnDefs(columnDefs: js.Array[ColDef | ColGroupDef]): Unit = js.native
    def setColumnDefs(columnDefs: js.Array[ColDef | ColGroupDef], source: ColumnEventType): Unit = js.native
    
    def setColumnGroupOpened(key: String, newValue: Boolean): Unit = js.native
    def setColumnGroupOpened(key: String, newValue: Boolean, source: ColumnEventType): Unit = js.native
    def setColumnGroupOpened(key: OriginalColumnGroup, newValue: Boolean): Unit = js.native
    def setColumnGroupOpened(key: OriginalColumnGroup, newValue: Boolean, source: ColumnEventType): Unit = js.native
    
    def setColumnGroupState(stateItems: js.Array[GroupId]): Unit = js.native
    def setColumnGroupState(stateItems: js.Array[GroupId], source: ColumnEventType): Unit = js.native
    
    def setColumnPinned(key: String, pinned: String): Unit = js.native
    def setColumnPinned(key: String, pinned: String, source: ColumnEventType): Unit = js.native
    def setColumnPinned(key: String, pinned: Boolean): Unit = js.native
    def setColumnPinned(key: String, pinned: Boolean, source: ColumnEventType): Unit = js.native
    def setColumnPinned(key: Column, pinned: String): Unit = js.native
    def setColumnPinned(key: Column, pinned: String, source: ColumnEventType): Unit = js.native
    def setColumnPinned(key: Column, pinned: Boolean): Unit = js.native
    def setColumnPinned(key: Column, pinned: Boolean, source: ColumnEventType): Unit = js.native
    
    def setColumnState(columnState: js.Array[ColumnState]): Boolean = js.native
    def setColumnState(columnState: js.Array[ColumnState], source: ColumnEventType): Boolean = js.native
    
    def setColumnVisible(key: String, visible: Boolean): Unit = js.native
    def setColumnVisible(key: String, visible: Boolean, source: ColumnEventType): Unit = js.native
    def setColumnVisible(key: Column, visible: Boolean): Unit = js.native
    def setColumnVisible(key: Column, visible: Boolean, source: ColumnEventType): Unit = js.native
    
    def setColumnWidth(key: String, newWidth: Double, shiftKey: Boolean, finished: Boolean): Unit = js.native
    def setColumnWidth(key: String, newWidth: Double, shiftKey: Boolean, finished: Boolean, source: ColumnEventType): Unit = js.native
    def setColumnWidth(key: Column, newWidth: Double, shiftKey: Boolean, finished: Boolean): Unit = js.native
    def setColumnWidth(key: Column, newWidth: Double, shiftKey: Boolean, finished: Boolean, source: ColumnEventType): Unit = js.native
    
    def setColumnsPinned(keys: js.Array[String | Column], pinned: String): Unit = js.native
    def setColumnsPinned(keys: js.Array[String | Column], pinned: String, source: ColumnEventType): Unit = js.native
    def setColumnsPinned(keys: js.Array[String | Column], pinned: Boolean): Unit = js.native
    def setColumnsPinned(keys: js.Array[String | Column], pinned: Boolean, source: ColumnEventType): Unit = js.native
    
    def setColumnsVisible(keys: js.Array[String | Column], visible: Boolean): Unit = js.native
    def setColumnsVisible(keys: js.Array[String | Column], visible: Boolean, source: ColumnEventType): Unit = js.native
    
    /* private */ def setFirstRightAndLastLeftPinned(source: js.Any): js.Any = js.native
    
    /* private */ def setLeftValues(source: js.Any): js.Any = js.native
    
    /* private */ def setLeftValuesOfColumns(source: js.Any): js.Any = js.native
    
    /* private */ def setLeftValuesOfGroups(): js.Any = js.native
    
    def setPivotColumns(colKeys: js.Array[String | Column]): Unit = js.native
    def setPivotColumns(colKeys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def setPivotMode(pivotMode: Boolean): Unit = js.native
    def setPivotMode(pivotMode: Boolean, source: ColumnEventType): Unit = js.native
    
    /* private */ def setPrimaryColumnList(colKeys: js.Any, masterList: js.Any, eventName: js.Any, columnCallback: js.Any, source: js.Any): js.Any = js.native
    
    /* private */ def setRowGroupActive(active: js.Any, column: js.Any, source: js.Any): js.Any = js.native
    
    def setRowGroupColumns(colKeys: js.Array[String | Column]): Unit = js.native
    def setRowGroupColumns(colKeys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    def setSecondaryColumns(colDefs: js.Array[ColDef | ColGroupDef]): Unit = js.native
    def setSecondaryColumns(colDefs: js.Array[ColDef | ColGroupDef], source: ColumnEventType): Unit = js.native
    
    /* private */ def setValueActive(active: js.Any, column: js.Any, source: js.Any): js.Any = js.native
    
    def setValueColumns(colKeys: js.Array[String | Column]): Unit = js.native
    def setValueColumns(colKeys: js.Array[String | Column], source: ColumnEventType): Unit = js.native
    
    /* private */ def setVirtualViewportLeftAndRight(): js.Any = js.native
    
    def setVirtualViewportPosition(scrollWidth: Double, scrollPosition: Double): Unit = js.native
    
    /* private */ def setupAllDisplayedColumns(): js.Any = js.native
    
    /* private */ def setupQuickFilterColumns(): js.Any = js.native
    
    def sizeColumnsToFit(gridWidth: js.Any): Unit = js.native
    def sizeColumnsToFit(gridWidth: js.Any, source: ColumnEventType): Unit = js.native
    
    /* private */ def sortColumnListUsingIndexes(indexes: js.Any, colA: js.Any, colB: js.Any): js.Any = js.native
    
    var suppressColumnVirtualisation: js.Any = js.native
    
    /* private */ def syncColumnWithNoState(column: js.Any, source: js.Any): js.Any = js.native
    
    /* private */ def syncColumnWithStateItem(column: js.Any, stateItem: js.Any, rowGroupIndexes: js.Any, pivotIndexes: js.Any, source: js.Any): js.Any = js.native
    
    /* private */ def updateBodyWidths(): js.Any = js.native
    
    /* private */ def updateDisplayedCenterVirtualColumns(): js.Any = js.native
    
    /* private */ def updateDisplayedColumns(source: js.Any): js.Any = js.native
    
    /* private */ def updateDisplayedColumnsFromTrees(source: js.Any): js.Any = js.native
    
    /* private */ def updateDisplayedVirtualGroups(virtualColIds: js.Any): js.Any = js.native
    
    /* private */ def updateGridColumns(): js.Any = js.native
    
    /* private */ def updateGroupsAndDisplayedColumns(source: js.Any): js.Any = js.native
    
    /* private */ def updateOpenClosedVisibilityInColumnGroups(): js.Any = js.native
    
    def updatePrimaryColumnList(
      keys: js.Array[String | Column],
      masterList: js.Array[Column],
      actionIsAdd: Boolean,
      columnCallback: js.Function1[/* column */ Column, Unit],
      eventType: String
    ): Unit = js.native
    def updatePrimaryColumnList(
      keys: js.Array[String | Column],
      masterList: js.Array[Column],
      actionIsAdd: Boolean,
      columnCallback: js.Function1[/* column */ Column, Unit],
      eventType: String,
      source: ColumnEventType
    ): Unit = js.native
    
    /* private */ def updateVirtualSets(): js.Any = js.native
    
    var usingTreeData: js.Any = js.native
    
    var valueCache: js.Any = js.native
    
    var valueColumns: js.Any = js.native
    
    var viewportLeft: js.Any = js.native
    
    var viewportRight: js.Any = js.native
    
    /* private */ def wrapHeaderNameWithAggFunc(column: js.Any, headerName: js.Any): js.Any = js.native
  }
  
  trait ColumnResizeSet extends StObject {
    
    var columns: js.Array[Column]
    
    var ratios: js.Array[Double]
    
    var width: Double
  }
  object ColumnResizeSet {
    
    @scala.inline
    def apply(columns: js.Array[Column], ratios: js.Array[Double], width: Double): ColumnResizeSet = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], ratios = ratios.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnResizeSet]
    }
    
    @scala.inline
    implicit class ColumnResizeSetMutableBuilder[Self <: ColumnResizeSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setRatios(value: js.Array[Double]): Self = StObject.set(x, "ratios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatiosVarargs(value: Double*): Self = StObject.set(x, "ratios", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnState extends StObject {
    
    var aggFunc: js.UndefOr[String | IAggFunc] = js.undefined
    
    var colId: String
    
    var hide: js.UndefOr[Boolean] = js.undefined
    
    var pinned: js.UndefOr[Boolean | String | left | right] = js.undefined
    
    var pivotIndex: js.UndefOr[Double] = js.undefined
    
    var rowGroupIndex: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ColumnState {
    
    @scala.inline
    def apply(colId: String): ColumnState = {
      val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnState]
    }
    
    @scala.inline
    implicit class ColumnStateMutableBuilder[Self <: ColumnState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggFunc(value: String | IAggFunc): Self = StObject.set(x, "aggFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "aggFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAggFuncUndefined: Self = StObject.set(x, "aggFunc", js.undefined)
      
      @scala.inline
      def setColId(value: String): Self = StObject.set(x, "colId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setPinned(value: Boolean | String | left | right): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      @scala.inline
      def setPivotIndex(value: Double): Self = StObject.set(x, "pivotIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotIndexUndefined: Self = StObject.set(x, "pivotIndex", js.undefined)
      
      @scala.inline
      def setRowGroupIndex(value: Double): Self = StObject.set(x, "rowGroupIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupIndexUndefined: Self = StObject.set(x, "rowGroupIndex", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
