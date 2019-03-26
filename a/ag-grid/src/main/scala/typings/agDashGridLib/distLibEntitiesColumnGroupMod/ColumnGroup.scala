package typings
package agDashGridLib.distLibEntitiesColumnGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup")
@js.native
class ColumnGroup protected ()
  extends agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild {
  def this(originalColumnGroup: agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup, groupId: java.lang.String, instanceId: scala.Double) = this()
  var children: js.Any = js.native
  var columnApi: js.Any = js.native
  var displayedChildren: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  var groupId: js.Any = js.native
  var instanceId: js.Any = js.native
  var left: js.Any = js.native
  var localEventService: js.Any = js.native
  var oldLeft: js.Any = js.native
  var originalColumnGroup: js.Any = js.native
  var parent: js.Any = js.native
  def addChild(child: agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild): scala.Unit = js.native
  /* private */ def addDisplayedLeafColumns(leafColumns: js.Any): js.Any = js.native
  /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
  def calculateDisplayedColumns(): scala.Unit = js.native
  def checkLeft(): scala.Unit = js.native
  /* private */ def createAgEvent(`type`: js.Any): js.Any = js.native
  def getChildren(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getColGroupDef(): agDashGridLib.distLibEntitiesColDefMod.ColGroupDef = js.native
  def getDisplayedChildren(): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def getDisplayedLeafColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getGroupId(): java.lang.String = js.native
  def getInstanceId(): scala.Double = js.native
  def getLeafColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getOriginalColumnGroup(): agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup = js.native
  def isChildInThisGroupDeepSearch(wantedChild: agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild): scala.Boolean = js.native
  def isExpandable(): scala.Boolean = js.native
  def isExpanded(): scala.Boolean = js.native
  def isPadding(): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  def setExpanded(expanded: scala.Boolean): scala.Unit = js.native
  def setLeft(left: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/entities/columnGroup", "ColumnGroup")
@js.native
object ColumnGroup extends js.Object {
  var EVENT_DISPLAYED_CHILDREN_CHANGED: java.lang.String = js.native
  var EVENT_LEFT_CHANGED: java.lang.String = js.native
  var HEADER_GROUP_SHOW_CLOSED: java.lang.String = js.native
  var HEADER_GROUP_SHOW_OPEN: java.lang.String = js.native
  def createUniqueId(groupId: java.lang.String, instanceId: scala.Double): java.lang.String = js.native
}

