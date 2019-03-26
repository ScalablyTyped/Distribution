package typings
package agDashGridLib.distLibColumnControllerColumnControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/columnController", "ColumnController")
@js.native
class ColumnController () extends js.Object {
  var aggFuncService: js.Any = js.native
  var allDisplayedCenterVirtualColumns: js.Any = js.native
  var allDisplayedColumns: js.Any = js.native
  var allDisplayedVirtualColumns: js.Any = js.native
  var autoGroupColService: js.Any = js.native
  var autoGroupsNeedBuilding: js.Any = js.native
  var autoRowHeightColumns: js.Any = js.native
  var autoWidthCalculator: js.Any = js.native
  var balancedColumnTreeBuilder: js.Any = js.native
  var bodyWidth: js.Any = js.native
  var bodyWidthDirty: js.Any = js.native
  var colSpanActive: js.Any = js.native
  var columnAnimationService: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnUtils: js.Any = js.native
  var columnsForQuickFilter: js.Any = js.native
  var context: js.Any = js.native
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
  var eventService: js.Any = js.native
  var expressionService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridBalancedTree: js.Any = js.native
  var gridColsArePrimary: js.Any = js.native
  var gridColumns: js.Any = js.native
  var gridHeaderRowCount: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var groupAutoColumns: js.Any = js.native
  var groupDisplayColumns: js.Any = js.native
  var lastPrimaryOrder: js.Any = js.native
  var leftWidth: js.Any = js.native
  var logger: js.Any = js.native
  var pivotColumns: js.Any = js.native
  var pivotMode: js.Any = js.native
  var primaryBalancedTree: js.Any = js.native
  var primaryColumns: js.Any = js.native
  var primaryHeaderRowCount: js.Any = js.native
  var ready: js.Any = js.native
  var rightWidth: js.Any = js.native
  var rowGroupColumns: js.Any = js.native
  var scrollPosition: js.Any = js.native
  var scrollWidth: js.Any = js.native
  var secondaryBalancedTree: js.Any = js.native
  var secondaryColumns: js.Any = js.native
  var secondaryColumnsPresent: js.Any = js.native
  var secondaryHeaderRowCount: js.Any = js.native
  var suppressColumnVirtualisation: js.Any = js.native
  var usingTreeData: js.Any = js.native
  var valueCache: js.Any = js.native
  var valueColumns: js.Any = js.native
  var viewportLeft: js.Any = js.native
  var viewportRight: js.Any = js.native
  /* private */ def actionOnGridColumns(keys: js.Any, action: js.Any, source: js.Any): js.Any = js.native
  /* private */ def actionOnGridColumns(keys: js.Any, action: js.Any, source: js.Any, createEvent: js.Any): js.Any = js.native
  /* private */ def addAutoGroupToGridColumns(): js.Any = js.native
  def addPivotColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addPivotColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def addPivotColumn(key: java.lang.String): scala.Unit = js.native
  def addPivotColumn(key: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def addPivotColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addPivotColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def addRowGroupColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addRowGroupColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def addRowGroupColumn(key: java.lang.String): scala.Unit = js.native
  def addRowGroupColumn(key: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def addRowGroupColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addRowGroupColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def addToDisplayedColumns(displayedColumnTree: js.Any, displayedColumns: js.Any): js.Any = js.native
  def addValueColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addValueColumn(
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def addValueColumn(colKey: java.lang.String): scala.Unit = js.native
  def addValueColumn(colKey: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def addValueColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addValueColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def autoSizeAllColumns(): scala.Unit = js.native
  def autoSizeAllColumns(source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def autoSizeColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def autoSizeColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def autoSizeColumn(key: java.lang.String): scala.Unit = js.native
  def autoSizeColumn(key: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def autoSizeColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def autoSizeColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def buildDisplayedTrees(visibleColumns: js.Any): js.Any = js.native
  /* private */ def calculateColumnsForDisplay(): js.Any = js.native
  /* private */ def calculateColumnsForGroupDisplay(): js.Any = js.native
  /* private */ def checkColSpanActiveInCols(columns: js.Any): js.Any = js.native
  /* private */ def checkDisplayedVirtualColumns(): js.Any = js.native
  /* private */ def checkMinAndMaxWidthsForSet(columnResizeSet: js.Any): js.Any = js.native
  /* private */ def clearDisplayedColumns(): js.Any = js.native
  /* private */ def columnsMatch(column: js.Any, key: js.Any): js.Any = js.native
  /* private */ def createGroupAutoColumnsIfNeeded(): js.Any = js.native
  /* private */ def createStateItemFromColumn(column: js.Any): js.Any = js.native
  /* private */ def createValueColumns(source: js.Any): js.Any = js.native
  def doesMovePassLockedPositions(proposedColumnOrder: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Boolean = js.native
  def doesMovePassMarryChildren(allColumnsCopy: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Boolean = js.native
  def doesMovePassRules(columnsToMove: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column], toIndex: scala.Double): scala.Boolean = js.native
  /* private */ def extractPivotColumns(source: js.Any): js.Any = js.native
  /* private */ def extractRowGroupColumns(source: js.Any): js.Any = js.native
  /* private */ def filterOutColumnsWithinViewport(): js.Any = js.native
  def getAllAutoRowHeightCols(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllColumnsForQuickFilter(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllDisplayedCenterVirtualColumnsForRow(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getAllDisplayedColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllDisplayedVirtualColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllGridColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllPrimaryColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  /* private */ def getAutoColumn(key: js.Any): js.Any = js.native
  def getBodyContainerWidth(): scala.Double = js.native
  def getCenterDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  /* private */ def getColumn(key: js.Any, columnList: js.Any): js.Any = js.native
  def getColumnGroup(colId: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroup(colId: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup, instanceId: scala.Double): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroup(colId: java.lang.String): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroup(colId: java.lang.String, instanceId: scala.Double): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroupState(): js.Array[agDashGridLib.Anon_GroupId] = js.native
  def getColumnState(): js.Array[ColumnState] = js.native
  def getColumnWithValidation(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getColumnWithValidation(key: java.lang.String): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  /* private */ def getColumns(keys: js.Any, columnLookupCallback: js.Any): js.Any = js.native
  /* private */ def getColumnsFromTree(rootColumns: js.Any): js.Any = js.native
  def getContainerWidth(pinned: java.lang.String): scala.Double = js.native
  def getDisplayNameForColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column, location: java.lang.String): java.lang.String = js.native
  def getDisplayNameForColumn(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    location: java.lang.String,
    includeAggFunc: scala.Boolean
  ): java.lang.String = js.native
  def getDisplayNameForColumnGroup(columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup, location: java.lang.String): java.lang.String = js.native
  def getDisplayNameForOriginalColumnGroup(
    columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup,
    originalColumnGroup: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    location: java.lang.String
  ): java.lang.String = js.native
  def getDisplayedCenterColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedColAfter(col: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getDisplayedColBefore(col: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getDisplayedColumnGroups(`type`: java.lang.String): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getDisplayedColumns(`type`: java.lang.String): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  /* private */ def getDisplayedColumnsForRow(rowNode: js.Any, displayedColumns: js.Any): js.Any = js.native
  /* private */ def getDisplayedColumnsForRow(rowNode: js.Any, displayedColumns: js.Any, filterCallback: js.Any): js.Any = js.native
  /* private */ def getDisplayedColumnsForRow(rowNode: js.Any, displayedColumns: js.Any, filterCallback: js.Any, emptySpaceBeforeColumn: js.Any): js.Any = js.native
  def getDisplayedColumnsStartingAt(column: agDashGridLib.distLibEntitiesColumnMod.Column): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedGroupAfter(columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getDisplayedLeftColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedLeftColumnsForRow(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedRightColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedRightColumnsForRow(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getGridBalancedTree(): js.Array[
    agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
  ] = js.native
  def getGridColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getGridColumn(key: java.lang.String): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getGridColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getGroupAutoColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getGroupDisplayColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  /* private */ def getHeaderName(colDef: js.Any, column: js.Any, columnGroup: js.Any, originalColumnGroup: js.Any, location: js.Any): js.Any = js.native
  def getHeaderRowCount(): scala.Double = js.native
  def getLeftDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getOriginalColumnGroup(key: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup): agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup = js.native
  def getOriginalColumnGroup(key: java.lang.String): agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup = js.native
  def getPinnedLeftContainerWidth(): scala.Double = js.native
  def getPinnedRightContainerWidth(): scala.Double = js.native
  def getPivotColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getPrimaryAndSecondaryAndAutoColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getPrimaryColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getPrimaryColumn(key: java.lang.String): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getPrimaryColumnTree(): js.Array[
    agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
  ] = js.native
  /* private */ def getPrimaryOrGridColumn(key: js.Any): js.Any = js.native
  def getRightDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getRowGroupColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getSecondaryPivotColumn(pivotKeys: js.Array[java.lang.String], valueColKey: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getSecondaryPivotColumn(pivotKeys: js.Array[java.lang.String], valueColKey: java.lang.String): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getValueColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getVirtualHeaderGroupRow(`type`: java.lang.String, dept: scala.Double): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  /* private */ def getWidthOfColsInList(columnList: js.Any): js.Any = js.native
  def init(): scala.Unit = js.native
  def isAutoRowHeightActive(): scala.Boolean = js.native
  def isColumnDisplayed(column: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Boolean = js.native
  /* private */ def isColumnInViewport(col: js.Any): js.Any = js.native
  def isEmpty(): scala.Boolean = js.native
  def isPinningLeft(): scala.Boolean = js.native
  def isPinningRight(): scala.Boolean = js.native
  def isPivotActive(): scala.Boolean = js.native
  def isPivotMode(): scala.Boolean = js.native
  /* private */ def isPivotSettingAllowed(pivot: js.Any): js.Any = js.native
  def isPrimaryColumnGroupsPresent(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def isRowGroupEmpty(): scala.Boolean = js.native
  def isSecondaryColumnsPresent(): scala.Boolean = js.native
  def moveColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column, toIndex: scala.Double): scala.Unit = js.native
  def moveColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    toIndex: scala.Double,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def moveColumn(key: java.lang.String, toIndex: scala.Double): scala.Unit = js.native
  def moveColumn(
    key: java.lang.String,
    toIndex: scala.Double,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def moveColumnByIndex(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def moveColumnByIndex(
    fromIndex: scala.Double,
    toIndex: scala.Double,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def moveColumns(
    columnsToMoveKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    toIndex: scala.Double
  ): scala.Unit = js.native
  def moveColumns(
    columnsToMoveKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    toIndex: scala.Double,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def moveRowGroupColumn(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def moveRowGroupColumn(
    fromIndex: scala.Double,
    toIndex: scala.Double,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def normaliseColumnWidth(column: js.Any, newWidth: js.Any): js.Any = js.native
  /* private */ def orderColumnStateList(columnStateList: js.Any): js.Any = js.native
  /* private */ def orderGridColsLikeLastPrimary(): js.Any = js.native
  /* private */ def processSecondaryColumnDefinitions(colDefs: js.Any): js.Any = js.native
  /* private */ def putFixedColumnsFirst(): js.Any = js.native
  def removePivotColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removePivotColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def removePivotColumn(key: java.lang.String): scala.Unit = js.native
  def removePivotColumn(key: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def removePivotColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removePivotColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def removeRowGroupColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removeRowGroupColumn(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def removeRowGroupColumn(key: java.lang.String): scala.Unit = js.native
  def removeRowGroupColumn(key: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def removeRowGroupColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removeRowGroupColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def removeValueColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removeValueColumn(
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def removeValueColumn(colKey: java.lang.String): scala.Unit = js.native
  def removeValueColumn(colKey: java.lang.String, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def removeValueColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removeValueColumns(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def resetColumnGroupState(): scala.Unit = js.native
  def resetColumnGroupState(source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def resetColumnState(): scala.Unit = js.native
  def resetColumnState(source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  def resizeColumnSets(
    resizeSets: js.Array[ColumnResizeSet],
    finished: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  def setColumnAggFunc(column: agDashGridLib.distLibEntitiesColumnMod.Column, aggFunc: java.lang.String): scala.Unit = js.native
  def setColumnAggFunc(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    aggFunc: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnDefs(
    columnDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ]
  ): scala.Unit = js.native
  def setColumnDefs(
    columnDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnGroupOpened(
    key: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    newValue: scala.Boolean
  ): scala.Unit = js.native
  def setColumnGroupOpened(
    key: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    newValue: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnGroupOpened(key: java.lang.String, newValue: scala.Boolean): scala.Unit = js.native
  def setColumnGroupOpened(
    key: java.lang.String,
    newValue: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnGroupState(stateItems: js.Array[agDashGridLib.Anon_GroupId]): scala.Unit = js.native
  def setColumnGroupState(
    stateItems: js.Array[agDashGridLib.Anon_GroupId],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnPinned(key: agDashGridLib.distLibEntitiesColumnMod.Column, pinned: java.lang.String): scala.Unit = js.native
  def setColumnPinned(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    pinned: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnPinned(key: agDashGridLib.distLibEntitiesColumnMod.Column, pinned: scala.Boolean): scala.Unit = js.native
  def setColumnPinned(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    pinned: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnPinned(key: java.lang.String, pinned: java.lang.String): scala.Unit = js.native
  def setColumnPinned(
    key: java.lang.String,
    pinned: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnPinned(key: java.lang.String, pinned: scala.Boolean): scala.Unit = js.native
  def setColumnPinned(
    key: java.lang.String,
    pinned: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnState(columnState: js.Array[ColumnState]): scala.Boolean = js.native
  def setColumnState(columnState: js.Array[ColumnState], source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Boolean = js.native
  def setColumnVisible(key: agDashGridLib.distLibEntitiesColumnMod.Column, visible: scala.Boolean): scala.Unit = js.native
  def setColumnVisible(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    visible: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnVisible(key: java.lang.String, visible: scala.Boolean): scala.Unit = js.native
  def setColumnVisible(
    key: java.lang.String,
    visible: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnWidth(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    newWidth: scala.Double,
    shiftKey: scala.Boolean,
    finished: scala.Boolean
  ): scala.Unit = js.native
  def setColumnWidth(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    newWidth: scala.Double,
    shiftKey: scala.Boolean,
    finished: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnWidth(key: java.lang.String, newWidth: scala.Double, shiftKey: scala.Boolean, finished: scala.Boolean): scala.Unit = js.native
  def setColumnWidth(
    key: java.lang.String,
    newWidth: scala.Double,
    shiftKey: scala.Boolean,
    finished: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnsPinned(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: java.lang.String
  ): scala.Unit = js.native
  def setColumnsPinned(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnsPinned(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: scala.Boolean
  ): scala.Unit = js.native
  def setColumnsPinned(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnsVisible(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    visible: scala.Boolean
  ): scala.Unit = js.native
  def setColumnsVisible(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    visible: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def setFirstRightAndLastLeftPinned(source: js.Any): js.Any = js.native
  /* private */ def setLeftValues(source: js.Any): js.Any = js.native
  /* private */ def setLeftValuesOfColumns(source: js.Any): js.Any = js.native
  /* private */ def setLeftValuesOfGroups(): js.Any = js.native
  def setPivotColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def setPivotColumns(
    colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setPivotMode(pivotMode: scala.Boolean): scala.Unit = js.native
  def setPivotMode(pivotMode: scala.Boolean, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  /* private */ def setPrimaryColumnList(colKeys: js.Any, masterList: js.Any, eventName: js.Any, columnCallback: js.Any, source: js.Any): js.Any = js.native
  /* private */ def setRowGroupActive(active: js.Any, column: js.Any, source: js.Any): js.Any = js.native
  def setRowGroupColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def setRowGroupColumns(
    colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setSecondaryColumns(
    colDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ]
  ): scala.Unit = js.native
  def setSecondaryColumns(
    colDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def setValueActive(active: js.Any, column: js.Any, source: js.Any): js.Any = js.native
  def setValueColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def setValueColumns(
    colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def setVirtualViewportLeftAndRight(): js.Any = js.native
  def setVirtualViewportPosition(scrollWidth: scala.Double, scrollPosition: scala.Double): scala.Unit = js.native
  /* private */ def setupAllDisplayedColumns(): js.Any = js.native
  /* private */ def setupQuickFilterColumns(): js.Any = js.native
  def sizeColumnsToFit(gridWidth: js.Any): scala.Unit = js.native
  def sizeColumnsToFit(gridWidth: js.Any, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
  /* private */ def sortColumnListUsingIndexes(indexes: js.Any, colA: js.Any, colB: js.Any): js.Any = js.native
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
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    masterList: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    actionIsAdd: scala.Boolean,
    columnCallback: js.Function1[/* column */ agDashGridLib.distLibEntitiesColumnMod.Column, scala.Unit],
    eventType: java.lang.String
  ): scala.Unit = js.native
  def updatePrimaryColumnList(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    masterList: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    actionIsAdd: scala.Boolean,
    columnCallback: js.Function1[/* column */ agDashGridLib.distLibEntitiesColumnMod.Column, scala.Unit],
    eventType: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  /* private */ def updateVirtualSets(): js.Any = js.native
  /* private */ def wrapHeaderNameWithAggFunc(column: js.Any, headerName: js.Any): js.Any = js.native
}

