package typings
package agDashGridLib.distLibColumnControllerColumnApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/columnApi", "ColumnApi")
@js.native
class ColumnApi () extends js.Object {
  var columnController: js.Any = js.native
  def addAggregationColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addAggregationColumn(colKey: java.lang.String): scala.Unit = js.native
  def addAggregationColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addPivotColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addPivotColumn(colKey: java.lang.String): scala.Unit = js.native
  def addPivotColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addRowGroupColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addRowGroupColumn(colKey: java.lang.String): scala.Unit = js.native
  def addRowGroupColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def addValueColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def addValueColumn(colKey: java.lang.String): scala.Unit = js.native
  def addValueColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def autoSizeAllColumns(): scala.Unit = js.native
  def autoSizeColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def autoSizeColumn(key: java.lang.String): scala.Unit = js.native
  def autoSizeColumns(keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def columnGroupOpened(
    group: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    newValue: scala.Boolean
  ): scala.Unit = js.native
  def columnGroupOpened(group: java.lang.String, newValue: scala.Boolean): scala.Unit = js.native
  def getAggregationColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getAllDisplayedColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllDisplayedVirtualColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getAllGridColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getCenterDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getColumn(key: js.Any): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getColumnGroup(name: java.lang.String): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroup(name: java.lang.String, instanceId: scala.Double): agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup = js.native
  def getColumnGroupState(): js.Array[agDashGridLib.Anon_GroupId] = js.native
  def getColumnState(): js.Array[agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnState] = js.native
  def getDisplayNameForCol(column: js.Any): java.lang.String = js.native
  def getDisplayNameForColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column, location: java.lang.String): java.lang.String = js.native
  def getDisplayNameForColumnGroup(columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup, location: java.lang.String): java.lang.String = js.native
  def getDisplayedCenterColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedColAfter(col: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getDisplayedColBefore(col: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getDisplayedLeftColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getDisplayedRightColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getLeftDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getOriginalColumnGroup(name: java.lang.String): agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup = js.native
  def getPivotColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getRightDisplayedColumnGroups(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getRowGroupColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getSecondaryPivotColumn(pivotKeys: js.Array[java.lang.String], valueColKey: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getSecondaryPivotColumn(pivotKeys: js.Array[java.lang.String], valueColKey: java.lang.String): agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  def getState(): js.Array[agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnState] = js.native
  def getValueColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def hideColumn(colId: js.Any, hide: js.Any): scala.Unit = js.native
  def hideColumns(colIds: js.Any, hide: js.Any): scala.Unit = js.native
  def isPinning(): scala.Boolean = js.native
  def isPinningLeft(): scala.Boolean = js.native
  def isPinningRight(): scala.Boolean = js.native
  def isPivotMode(): scala.Boolean = js.native
  def moveColumn(key: agDashGridLib.distLibEntitiesColumnMod.Column, toIndex: scala.Double): scala.Unit = js.native
  def moveColumn(key: java.lang.String, toIndex: scala.Double): scala.Unit = js.native
  def moveColumnByIndex(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def moveColumns(
    columnsToMoveKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    toIndex: scala.Double
  ): scala.Unit = js.native
  def moveRowGroupColumn(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def removeAggregationColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removeAggregationColumn(colKey: java.lang.String): scala.Unit = js.native
  def removeAggregationColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removePivotColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removePivotColumn(colKey: java.lang.String): scala.Unit = js.native
  def removePivotColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removeRowGroupColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removeRowGroupColumn(colKey: java.lang.String): scala.Unit = js.native
  def removeRowGroupColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def removeValueColumn(colKey: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Unit = js.native
  def removeValueColumn(colKey: java.lang.String): scala.Unit = js.native
  def removeValueColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def resetColumnGroupState(): scala.Unit = js.native
  def resetColumnState(): scala.Unit = js.native
  def resetState(): scala.Unit = js.native
  def setColumnAggFunc(column: agDashGridLib.distLibEntitiesColumnMod.Column, aggFunc: java.lang.String): scala.Unit = js.native
  def setColumnAggFunction(column: agDashGridLib.distLibEntitiesColumnMod.Column, aggFunc: java.lang.String): scala.Unit = js.native
  def setColumnGroupOpened(
    group: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup,
    newValue: scala.Boolean
  ): scala.Unit = js.native
  def setColumnGroupOpened(group: java.lang.String, newValue: scala.Boolean): scala.Unit = js.native
  def setColumnGroupState(stateItems: js.Array[agDashGridLib.Anon_GroupId]): scala.Unit = js.native
  def setColumnPinned(key: agDashGridLib.distLibEntitiesColumnMod.Column, pinned: java.lang.String): scala.Unit = js.native
  def setColumnPinned(key: java.lang.String, pinned: java.lang.String): scala.Unit = js.native
  def setColumnState(columnState: js.Array[agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnState]): scala.Boolean = js.native
  def setColumnVisible(key: agDashGridLib.distLibEntitiesColumnMod.Column, visible: scala.Boolean): scala.Unit = js.native
  def setColumnVisible(key: java.lang.String, visible: scala.Boolean): scala.Unit = js.native
  def setColumnWidth(key: agDashGridLib.distLibEntitiesColumnMod.Column, newWidth: scala.Double): scala.Unit = js.native
  def setColumnWidth(
    key: agDashGridLib.distLibEntitiesColumnMod.Column,
    newWidth: scala.Double,
    finished: scala.Boolean
  ): scala.Unit = js.native
  def setColumnWidth(key: java.lang.String, newWidth: scala.Double): scala.Unit = js.native
  def setColumnWidth(key: java.lang.String, newWidth: scala.Double, finished: scala.Boolean): scala.Unit = js.native
  def setColumnsPinned(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: java.lang.String
  ): scala.Unit = js.native
  def setColumnsVisible(
    keys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column],
    visible: scala.Boolean
  ): scala.Unit = js.native
  def setPivotColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def setPivotMode(pivotMode: scala.Boolean): scala.Unit = js.native
  def setRowGroupColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def setSecondaryColumns(
    colDefs: js.Array[
      agDashGridLib.distLibEntitiesColDefMod.ColDef | agDashGridLib.distLibEntitiesColDefMod.ColGroupDef
    ]
  ): scala.Unit = js.native
  def setState(columnState: js.Array[agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnState]): scala.Boolean = js.native
  def setValueColumns(colKeys: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
  def sizeColumnsToFit(gridWidth: js.Any): scala.Unit = js.native
}

