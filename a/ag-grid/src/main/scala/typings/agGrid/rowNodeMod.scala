package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.columnMod.Column
import typings.agGrid.eventsMod.AgEvent
import typings.agGrid.gridApiMod.DetailGridInfo
import typings.agGrid.iEventEmitterMod.IEventEmitter
import typings.agGrid.rowNodeBlockMod.RowNodeBlock
import typings.agGrid.rowNodeCacheMod.RowNodeCache
import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowNodeMod {
  
  @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode")
  @js.native
  class RowNode ()
    extends StObject
       with IEventEmitter {
    
    /** Used by the value service, stores values for a particular change detection turn. */
    var __cacheData: StringDictionary[js.Any] = js.native
    
    var __cacheVersion: Double = js.native
    
    /** The aggregated data */
    var aggData: js.Any = js.native
    
    /** Groups only - Number of children and grand children */
    var allChildrenCount: Double = js.native
    
    /** All user provided nodes */
    var allLeafChildren: js.Array[RowNode] = js.native
    
    def calculateSelectedFromChildren(): Unit = js.native
    
    /** Same as master, kept for legacy reasons */
    var canFlower: Boolean = js.native
    
    /* private */ def checkRowSelectable(): js.Any = js.native
    
    /** Same as detailNode, kept for legacy reasons */
    var childFlower: RowNode = js.native
    
    /** The index of this node in the group */
    var childIndex: Double = js.native
    
    /** Groups only - Filtered children of this group */
    var childrenAfterFilter: js.Array[RowNode] = js.native
    
    /** Groups only - Children of this group */
    var childrenAfterGroup: js.Array[RowNode] = js.native
    
    /** Groups only - Sorted children of this group */
    var childrenAfterSort: js.Array[RowNode] = js.native
    
    /** Server Side Row Model Only - the children are in an infinite cache */
    var childrenCache: RowNodeCache[RowNodeBlock, RowNodeCacheParams] = js.native
    
    /** Children mapped by the pivot columns */
    var childrenMapped: StringDictionary[js.Any] = js.native
    
    def clearRowTop(): Unit = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createDaemonNode(): js.Any = js.native
    
    /* private */ def createDataChangedEvent(newData: js.Any, oldData: js.Any, update: js.Any): js.Any = js.native
    
    /* private */ def createGlobalRowEvent(`type`: js.Any): js.Any = js.native
    
    /* private */ def createLocalRowEvent(`type`: js.Any): js.Any = js.native
    
    /** True if this node is a daemon. This means row is not part of the model. Can happen when then
      * the row is selected and then the user sets a different ID onto the node. The nodes is then
      * representing a different entity, so the selection controller, if the node is selected, takes
      * a copy where daemon=true. */
    var daemon: Boolean = js.native
    
    /** The user provided data */
    var data: js.Any = js.native
    
    def depthFirstSearch(callback: js.Function1[/* rowNode */ this.type, Unit]): Unit = js.native
    
    /** True if this row is a detail row, part of master / detail (ie child row of an expanded master row)*/
    var detail: Boolean = js.native
    
    /** If master detail, this contains details about the detail grid */
    var detailGridInfo: DetailGridInfo = js.native
    
    /** If this row is a master row that was expanded, this points to the associated detail row. */
    var detailNode: RowNode = js.native
    
    /* private */ def dispatchCellChangedEvent(column: js.Any, newValue: js.Any): js.Any = js.native
    
    /* private */ def dispatchLocalEvent(event: js.Any): js.Any = js.native
    
    /* private */ def doRowRangeSelection(): js.Any = js.native
    
    /** True if this row is getting dragged */
    var dragging: Boolean = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /** Groups only - True if group is expanded, otherwise false */
    var expanded: Boolean = js.native
    
    /** Groups only - The field we are grouping on eg Country*/
    var field: String = js.native
    
    /** True if this is the first child in this group */
    var firstChild: Boolean = js.native
    
    /** Same as detail, kept for legacy reasons */
    var flower: Boolean = js.native
    
    /** Groups only - True if row is a footer. Footers  have group = true and footer = true */
    var footer: Boolean = js.native
    
    def getFirstChildOfFirstChild(rowGroupColumn: Column): RowNode = js.native
    
    def getRowIndexString(): String = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /** True if this node is a group node (ie has children) */
    var group: Boolean = js.native
    
    /** The group data */
    var groupData: js.Any = js.native
    
    def hasChildren(): Boolean = js.native
    
    /** Unique ID for the node. Either provided by the grid, or user can set to match the primary
      * key in the database (or whatever data source is used). */
    var id: String = js.native
    
    def isEmptyFillerNode(): Boolean = js.native
    
    def isExpandable(): Boolean = js.native
    
    def isParentOfNode(potentialParent: RowNode): Boolean = js.native
    
    def isPixelInRange(pixel: Double): Boolean = js.native
    
    def isRowPinned(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    /** Groups only - The key for the group eg Ireland, UK, USA */
    var key: js.Any = js.native
    
    /** True if this is the last child in this group */
    var lastChild: Boolean = js.native
    
    /** True if this node is a group and the group is the bottom level in the tree */
    var leafGroup: Boolean = js.native
    
    /** How many levels this node is from the top */
    var level: Double = js.native
    
    /* private */ var mainEventService: js.Any = js.native
    
    /** True if this row is a master row, part of master / detail (ie row can be expanded to show detail) */
    var master: Boolean = js.native
    
    /** The top pixel for this row last time, makes sense if data set was ordered or filtered,
      * it is used so new rows can animate in from their old position. */
    var oldRowTop: Double = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    /** The parent node to this node, or empty if top level */
    var parent: RowNode = js.native
    
    /** If using quick filter, stores a string representation of the row for searching against */
    var quickFilterAggregateText: String = js.native
    
    def resetQuickFilterAggregateText(): Unit = js.native
    
    /** Groups only - the row group column for this group */
    var rowGroupColumn: Column = js.native
    
    /** If doing in memory grouping, this is the index of the group column this cell is for.
      * This will always be the same as the level, unless we are collapsing groups ie groupRemoveSingleChildren = true */
    var rowGroupIndex: Double = js.native
    
    /** The height, in pixels, of this row */
    var rowHeight: Double = js.native
    
    /** The index of this node in the grid, only valid if node is displayed in the grid, otherwise it should be ignored as old index may be present */
    var rowIndex: Double = js.native
    
    /* private */ var rowModel: js.Any = js.native
    
    /** Either 'top' or 'bottom' if row pinned, otherwise undefined or null */
    var rowPinned: String = js.native
    
    /** The top pixel for this row */
    var rowTop: Double = js.native
    
    /* private */ def selectChildNodes(newValue: js.Any, groupSelectsFiltered: js.Any): js.Any = js.native
    
    def selectThisNode(newValue: Boolean): Boolean = js.native
    
    /** True by default - can be overridden via gridOptions.isRowSelectable(rowNode) */
    var selectable: Boolean = js.native
    
    /* private */ var selected: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
    def setAggData(newAggData: js.Any): Unit = js.native
    
    def setAllChildrenCount(allChildrenCount: Double): Unit = js.native
    
    def setChildIndex(childIndex: Double): Unit = js.native
    
    def setData(data: js.Any): Unit = js.native
    
    def setDataAndId(data: js.Any, id: String): Unit = js.native
    
    def setDataValue(colKey: String, newValue: js.Any): Unit = js.native
    def setDataValue(colKey: Column, newValue: js.Any): Unit = js.native
    
    def setDragging(dragging: Boolean): Unit = js.native
    
    def setExpanded(expanded: Boolean): Unit = js.native
    
    def setFirstChild(firstChild: Boolean): Unit = js.native
    
    def setGroupValue(colKey: String, newValue: js.Any): Unit = js.native
    def setGroupValue(colKey: Column, newValue: js.Any): Unit = js.native
    
    def setId(id: String): Unit = js.native
    
    def setLastChild(lastChild: Boolean): Unit = js.native
    
    def setRowHeight(rowHeight: Double): Unit = js.native
    
    def setRowIndex(rowIndex: Double): Unit = js.native
    
    def setRowSelectable(newVal: Boolean): Unit = js.native
    
    def setRowTop(rowTop: Double): Unit = js.native
    
    def setSelected(newValue: Boolean): Unit = js.native
    def setSelected(newValue: Boolean, clearSelection: Boolean): Unit = js.native
    def setSelected(newValue: Boolean, clearSelection: Boolean, suppressFinishActions: Boolean): Unit = js.native
    def setSelected(newValue: Boolean, clearSelection: Unit, suppressFinishActions: Boolean): Unit = js.native
    
    def setSelectedInitialValue(selected: Boolean): Unit = js.native
    
    def setSelectedParams(params: SetSelectedParams): Double = js.native
    
    def setUiLevel(uiLevel: Double): Unit = js.native
    
    /** Groups only - If doing footers, reference to the footer node for this group */
    var sibling: RowNode = js.native
    
    /** Used by server side row model, true if this row node is a stub */
    var stub: Boolean = js.native
    
    /** How many levels this node is from the top in the UI (different to the level when removing parents)*/
    var uiLevel: Double = js.native
    
    def updateData(data: js.Any): Unit = js.native
    
    /* private */ def updateDataOnDetailNode(): js.Any = js.native
    
    /* private */ var valueCache: js.Any = js.native
    
    /* private */ var valueService: js.Any = js.native
  }
  /* static members */
  object RowNode {
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_ALL_CHILDREN_COUNT_CHANGED")
    @js.native
    def EVENT_ALL_CHILDREN_COUNT_CHANGED: String = js.native
    inline def EVENT_ALL_CHILDREN_COUNT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_ALL_CHILDREN_COUNT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_CELL_CHANGED")
    @js.native
    def EVENT_CELL_CHANGED: String = js.native
    inline def EVENT_CELL_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CELL_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_CHILD_INDEX_CHANGED")
    @js.native
    def EVENT_CHILD_INDEX_CHANGED: String = js.native
    inline def EVENT_CHILD_INDEX_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CHILD_INDEX_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_DATA_CHANGED")
    @js.native
    def EVENT_DATA_CHANGED: String = js.native
    inline def EVENT_DATA_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DATA_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_DRAGGING_CHANGED")
    @js.native
    def EVENT_DRAGGING_CHANGED: String = js.native
    inline def EVENT_DRAGGING_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DRAGGING_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_EXPANDED_CHANGED")
    @js.native
    def EVENT_EXPANDED_CHANGED: String = js.native
    inline def EVENT_EXPANDED_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_EXPANDED_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_FIRST_CHILD_CHANGED")
    @js.native
    def EVENT_FIRST_CHILD_CHANGED: String = js.native
    inline def EVENT_FIRST_CHILD_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FIRST_CHILD_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_HEIGHT_CHANGED")
    @js.native
    def EVENT_HEIGHT_CHANGED: String = js.native
    inline def EVENT_HEIGHT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_HEIGHT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_LAST_CHILD_CHANGED")
    @js.native
    def EVENT_LAST_CHILD_CHANGED: String = js.native
    inline def EVENT_LAST_CHILD_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LAST_CHILD_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_MOUSE_ENTER")
    @js.native
    def EVENT_MOUSE_ENTER: String = js.native
    inline def EVENT_MOUSE_ENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_MOUSE_ENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_MOUSE_LEAVE")
    @js.native
    def EVENT_MOUSE_LEAVE: String = js.native
    inline def EVENT_MOUSE_LEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_MOUSE_LEAVE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_ROW_INDEX_CHANGED")
    @js.native
    def EVENT_ROW_INDEX_CHANGED: String = js.native
    inline def EVENT_ROW_INDEX_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_ROW_INDEX_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_ROW_SELECTED")
    @js.native
    def EVENT_ROW_SELECTED: String = js.native
    inline def EVENT_ROW_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_ROW_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_SELECTABLE_CHANGED")
    @js.native
    def EVENT_SELECTABLE_CHANGED: String = js.native
    inline def EVENT_SELECTABLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SELECTABLE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_TOP_CHANGED")
    @js.native
    def EVENT_TOP_CHANGED: String = js.native
    inline def EVENT_TOP_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TOP_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/rowNode", "RowNode.EVENT_UI_LEVEL_CHANGED")
    @js.native
    def EVENT_UI_LEVEL_CHANGED: String = js.native
    inline def EVENT_UI_LEVEL_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_UI_LEVEL_CHANGED")(x.asInstanceOf[js.Any])
  }
  
  trait CellChangedEvent
    extends StObject
       with RowNodeEvent {
    
    var column: Column
    
    var newValue: js.Any
  }
  object CellChangedEvent {
    
    inline def apply(column: Column, newValue: js.Any, node: RowNode, `type`: String): CellChangedEvent = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellChangedEvent]
    }
    
    extension [Self <: CellChangedEvent](x: Self) {
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataChangedEvent
    extends StObject
       with RowNodeEvent {
    
    var newData: js.Any
    
    var oldData: js.Any
    
    var update: Boolean
  }
  object DataChangedEvent {
    
    inline def apply(newData: js.Any, node: RowNode, oldData: js.Any, `type`: String, update: Boolean): DataChangedEvent = {
      val __obj = js.Dynamic.literal(newData = newData.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataChangedEvent]
    }
    
    extension [Self <: DataChangedEvent](x: Self) {
      
      inline def setNewData(value: js.Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setOldData(value: js.Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowNodeEvent
    extends StObject
       with AgEvent {
    
    var node: RowNode
  }
  object RowNodeEvent {
    
    inline def apply(node: RowNode, `type`: String): RowNodeEvent = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNodeEvent]
    }
    
    extension [Self <: RowNodeEvent](x: Self) {
      
      inline def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetSelectedParams extends StObject {
    
    var clearSelection: js.UndefOr[Boolean] = js.undefined
    
    var groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined
    
    var newValue: Boolean
    
    var rangeSelect: js.UndefOr[Boolean] = js.undefined
    
    var suppressFinishActions: js.UndefOr[Boolean] = js.undefined
  }
  object SetSelectedParams {
    
    inline def apply(newValue: Boolean): SetSelectedParams = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetSelectedParams]
    }
    
    extension [Self <: SetSelectedParams](x: Self) {
      
      inline def setClearSelection(value: Boolean): Self = StObject.set(x, "clearSelection", value.asInstanceOf[js.Any])
      
      inline def setClearSelectionUndefined: Self = StObject.set(x, "clearSelection", js.undefined)
      
      inline def setGroupSelectsFiltered(value: Boolean): Self = StObject.set(x, "groupSelectsFiltered", value.asInstanceOf[js.Any])
      
      inline def setGroupSelectsFilteredUndefined: Self = StObject.set(x, "groupSelectsFiltered", js.undefined)
      
      inline def setNewValue(value: Boolean): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setRangeSelect(value: Boolean): Self = StObject.set(x, "rangeSelect", value.asInstanceOf[js.Any])
      
      inline def setRangeSelectUndefined: Self = StObject.set(x, "rangeSelect", js.undefined)
      
      inline def setSuppressFinishActions(value: Boolean): Self = StObject.set(x, "suppressFinishActions", value.asInstanceOf[js.Any])
      
      inline def setSuppressFinishActionsUndefined: Self = StObject.set(x, "suppressFinishActions", js.undefined)
    }
  }
}
