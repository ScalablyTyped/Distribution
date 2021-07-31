package typings.agGrid

import typings.agGrid.anon.GroupId
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.columnControllerMod.ColumnState
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.columnMod.Column
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnApiMod {
  
  @JSImport("ag-grid/dist/lib/columnController/columnApi", "ColumnApi")
  @js.native
  class ColumnApi () extends StObject {
    
    def addAggregationColumn(colKey: String): Unit = js.native
    def addAggregationColumn(colKey: Column): Unit = js.native
    
    def addAggregationColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def addPivotColumn(colKey: String): Unit = js.native
    def addPivotColumn(colKey: Column): Unit = js.native
    
    def addPivotColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def addRowGroupColumn(colKey: String): Unit = js.native
    def addRowGroupColumn(colKey: Column): Unit = js.native
    
    def addRowGroupColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def addValueColumn(colKey: String): Unit = js.native
    def addValueColumn(colKey: Column): Unit = js.native
    
    def addValueColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def autoSizeAllColumns(): Unit = js.native
    
    def autoSizeColumn(key: String): Unit = js.native
    def autoSizeColumn(key: Column): Unit = js.native
    
    def autoSizeColumns(keys: js.Array[String | Column]): Unit = js.native
    
    var columnController: js.Any = js.native
    
    def columnGroupOpened(group: String, newValue: Boolean): Unit = js.native
    def columnGroupOpened(group: OriginalColumnGroup, newValue: Boolean): Unit = js.native
    
    def getAggregationColumns(): js.Array[Column] = js.native
    
    def getAllColumns(): js.Array[Column] = js.native
    
    def getAllDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getAllDisplayedColumns(): js.Array[Column] = js.native
    
    def getAllDisplayedVirtualColumns(): js.Array[Column] = js.native
    
    def getAllGridColumns(): js.Array[Column] = js.native
    
    def getCenterDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getColumn(key: js.Any): Column = js.native
    
    def getColumnGroup(name: String): ColumnGroup = js.native
    def getColumnGroup(name: String, instanceId: Double): ColumnGroup = js.native
    
    def getColumnGroupState(): js.Array[GroupId] = js.native
    
    def getColumnState(): js.Array[ColumnState] = js.native
    
    def getDisplayNameForCol(column: js.Any): String = js.native
    
    def getDisplayNameForColumn(column: Column, location: String): String = js.native
    
    def getDisplayNameForColumnGroup(columnGroup: ColumnGroup, location: String): String = js.native
    
    def getDisplayedCenterColumns(): js.Array[Column] = js.native
    
    def getDisplayedColAfter(col: Column): Column = js.native
    
    def getDisplayedColBefore(col: Column): Column = js.native
    
    def getDisplayedLeftColumns(): js.Array[Column] = js.native
    
    def getDisplayedRightColumns(): js.Array[Column] = js.native
    
    def getLeftDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getOriginalColumnGroup(name: String): OriginalColumnGroup = js.native
    
    def getPivotColumns(): js.Array[Column] = js.native
    
    def getRightDisplayedColumnGroups(): js.Array[ColumnGroupChild] = js.native
    
    def getRowGroupColumns(): js.Array[Column] = js.native
    
    def getSecondaryPivotColumn(pivotKeys: js.Array[String], valueColKey: String): Column = js.native
    def getSecondaryPivotColumn(pivotKeys: js.Array[String], valueColKey: Column): Column = js.native
    
    def getState(): js.Array[ColumnState] = js.native
    
    def getValueColumns(): js.Array[Column] = js.native
    
    def hideColumn(colId: js.Any, hide: js.Any): Unit = js.native
    
    def hideColumns(colIds: js.Any, hide: js.Any): Unit = js.native
    
    def isPinning(): Boolean = js.native
    
    def isPinningLeft(): Boolean = js.native
    
    def isPinningRight(): Boolean = js.native
    
    def isPivotMode(): Boolean = js.native
    
    def moveColumn(key: String, toIndex: Double): Unit = js.native
    def moveColumn(key: Column, toIndex: Double): Unit = js.native
    
    def moveColumnByIndex(fromIndex: Double, toIndex: Double): Unit = js.native
    
    def moveColumns(columnsToMoveKeys: js.Array[String | Column], toIndex: Double): Unit = js.native
    
    def moveRowGroupColumn(fromIndex: Double, toIndex: Double): Unit = js.native
    
    def removeAggregationColumn(colKey: String): Unit = js.native
    def removeAggregationColumn(colKey: Column): Unit = js.native
    
    def removeAggregationColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def removePivotColumn(colKey: String): Unit = js.native
    def removePivotColumn(colKey: Column): Unit = js.native
    
    def removePivotColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def removeRowGroupColumn(colKey: String): Unit = js.native
    def removeRowGroupColumn(colKey: Column): Unit = js.native
    
    def removeRowGroupColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def removeValueColumn(colKey: String): Unit = js.native
    def removeValueColumn(colKey: Column): Unit = js.native
    
    def removeValueColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def resetColumnGroupState(): Unit = js.native
    
    def resetColumnState(): Unit = js.native
    
    def resetState(): Unit = js.native
    
    def setColumnAggFunc(column: Column, aggFunc: String): Unit = js.native
    
    def setColumnAggFunction(column: Column, aggFunc: String): Unit = js.native
    
    def setColumnGroupOpened(group: String, newValue: Boolean): Unit = js.native
    def setColumnGroupOpened(group: OriginalColumnGroup, newValue: Boolean): Unit = js.native
    
    def setColumnGroupState(stateItems: js.Array[GroupId]): Unit = js.native
    
    def setColumnPinned(key: String, pinned: String): Unit = js.native
    def setColumnPinned(key: Column, pinned: String): Unit = js.native
    
    def setColumnState(columnState: js.Array[ColumnState]): Boolean = js.native
    
    def setColumnVisible(key: String, visible: Boolean): Unit = js.native
    def setColumnVisible(key: Column, visible: Boolean): Unit = js.native
    
    def setColumnWidth(key: String, newWidth: Double): Unit = js.native
    def setColumnWidth(key: String, newWidth: Double, finished: Boolean): Unit = js.native
    def setColumnWidth(key: Column, newWidth: Double): Unit = js.native
    def setColumnWidth(key: Column, newWidth: Double, finished: Boolean): Unit = js.native
    
    def setColumnsPinned(keys: js.Array[String | Column], pinned: String): Unit = js.native
    
    def setColumnsVisible(keys: js.Array[String | Column], visible: Boolean): Unit = js.native
    
    def setPivotColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def setPivotMode(pivotMode: Boolean): Unit = js.native
    
    def setRowGroupColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def setSecondaryColumns(colDefs: js.Array[ColDef | ColGroupDef]): Unit = js.native
    
    def setState(columnState: js.Array[ColumnState]): Boolean = js.native
    
    def setValueColumns(colKeys: js.Array[String | Column]): Unit = js.native
    
    def sizeColumnsToFit(gridWidth: js.Any): Unit = js.native
  }
}
