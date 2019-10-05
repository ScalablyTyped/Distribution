package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.ColGroupDef
import typings.agDashGrid.distLibEntitiesColumnGroupChildMod.ColumnGroupChild
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/columnGroup", JSImport.Namespace)
@js.native
object distLibEntitiesColumnGroupMod extends js.Object {
  @js.native
  class ColumnGroup protected () extends ColumnGroupChild {
    def this(originalColumnGroup: OriginalColumnGroup, groupId: String, instanceId: Double) = this()
    var children: js.Any = js.native
    var columnApi: js.Any = js.native
    var displayedChildren: js.Any = js.native
    var gridApi: js.Any = js.native
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    var groupId: js.Any = js.native
    var instanceId: js.Any = js.native
    var left: js.Any = js.native
    var localEventService: js.Any = js.native
    var oldLeft: js.Any = js.native
    var originalColumnGroup: js.Any = js.native
    var parent: js.Any = js.native
    def addChild(child: ColumnGroupChild): Unit = js.native
    /* private */ def addDisplayedLeafColumns(leafColumns: js.Any): js.Any = js.native
    /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
    def calculateDisplayedColumns(): Unit = js.native
    def checkLeft(): Unit = js.native
    /* private */ def createAgEvent(`type`: js.Any): js.Any = js.native
    def getChildren(): js.Array[ColumnGroupChild] = js.native
    def getColGroupDef(): ColGroupDef = js.native
    def getDisplayedChildren(): js.Array[ColumnGroupChild] = js.native
    def getDisplayedLeafColumns(): js.Array[Column] = js.native
    def getGroupId(): String = js.native
    def getInstanceId(): Double = js.native
    def getLeafColumns(): js.Array[Column] = js.native
    def getOriginalColumnGroup(): OriginalColumnGroup = js.native
    def isChildInThisGroupDeepSearch(wantedChild: ColumnGroupChild): Boolean = js.native
    def isExpandable(): Boolean = js.native
    def isExpanded(): Boolean = js.native
    def isPadding(): Boolean = js.native
    def reset(): Unit = js.native
    def setExpanded(expanded: Boolean): Unit = js.native
    def setLeft(left: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ColumnGroup extends js.Object {
    var EVENT_DISPLAYED_CHILDREN_CHANGED: String = js.native
    var EVENT_LEFT_CHANGED: String = js.native
    var HEADER_GROUP_SHOW_CLOSED: String = js.native
    var HEADER_GROUP_SHOW_OPEN: String = js.native
    def createUniqueId(groupId: String, instanceId: Double): String = js.native
  }
  
}

