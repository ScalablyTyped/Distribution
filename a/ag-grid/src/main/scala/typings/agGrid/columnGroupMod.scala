package typings.agGrid

import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnGroupMod {
  
  @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup")
  @js.native
  class ColumnGroup protected () extends ColumnGroupChild {
    def this(originalColumnGroup: OriginalColumnGroup, groupId: String, instanceId: Double) = this()
    
    def addChild(child: ColumnGroupChild): Unit = js.native
    
    /* private */ def addDisplayedLeafColumns(leafColumns: js.Any): js.Any = js.native
    
    /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
    
    def calculateDisplayedColumns(): Unit = js.native
    
    def checkLeft(): Unit = js.native
    
    var children: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    /* private */ def createAgEvent(`type`: js.Any): js.Any = js.native
    
    var displayedChildren: js.Any = js.native
    
    def getChildren(): js.Array[ColumnGroupChild] = js.native
    
    def getColGroupDef(): ColGroupDef = js.native
    
    def getDisplayedChildren(): js.Array[ColumnGroupChild] = js.native
    
    def getDisplayedLeafColumns(): js.Array[Column] = js.native
    
    def getGroupId(): String = js.native
    
    def getInstanceId(): Double = js.native
    
    def getLeafColumns(): js.Array[Column] = js.native
    
    def getOriginalColumnGroup(): OriginalColumnGroup = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    var groupId: js.Any = js.native
    
    var instanceId: js.Any = js.native
    
    def isChildInThisGroupDeepSearch(wantedChild: ColumnGroupChild): Boolean = js.native
    
    def isExpandable(): Boolean = js.native
    
    def isExpanded(): Boolean = js.native
    
    def isPadding(): Boolean = js.native
    
    var left: js.Any = js.native
    
    var localEventService: js.Any = js.native
    
    var oldLeft: js.Any = js.native
    
    var originalColumnGroup: js.Any = js.native
    
    var parent: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def setExpanded(expanded: Boolean): Unit = js.native
    
    def setLeft(left: Double): Unit = js.native
  }
  /* static members */
  object ColumnGroup {
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup.EVENT_DISPLAYED_CHILDREN_CHANGED")
    @js.native
    def EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
    @scala.inline
    def EVENT_DISPLAYED_CHILDREN_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DISPLAYED_CHILDREN_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup.EVENT_LEFT_CHANGED")
    @js.native
    def EVENT_LEFT_CHANGED: String = js.native
    @scala.inline
    def EVENT_LEFT_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LEFT_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup.HEADER_GROUP_SHOW_CLOSED")
    @js.native
    def HEADER_GROUP_SHOW_CLOSED: String = js.native
    @scala.inline
    def HEADER_GROUP_SHOW_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_GROUP_SHOW_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup.HEADER_GROUP_SHOW_OPEN")
    @js.native
    def HEADER_GROUP_SHOW_OPEN: String = js.native
    @scala.inline
    def HEADER_GROUP_SHOW_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_GROUP_SHOW_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup.createUniqueId")
    @js.native
    def createUniqueId(groupId: String, instanceId: Double): String = js.native
  }
}
