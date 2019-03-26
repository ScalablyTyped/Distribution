package typings
package agDashGridLib.distLibEntitiesOriginalColumnGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup")
@js.native
class OriginalColumnGroup protected ()
  extends agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
     with agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter {
  def this(colGroupDef: agDashGridLib.distLibEntitiesColDefMod.ColGroupDef, groupId: java.lang.String, padding: scala.Boolean, level: scala.Double) = this()
  var children: js.Any = js.native
  var colGroupDef: js.Any = js.native
  var columnApi: js.Any = js.native
  var expandable: js.Any = js.native
  var expanded: js.Any = js.native
  var gridApi: js.Any = js.native
  var groupId: js.Any = js.native
  var level: js.Any = js.native
  var localEventService: js.Any = js.native
  var padding: js.Any = js.native
  /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
  def getChildren(): js.Array[
    agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
  ] = js.native
  def getColGroupDef(): agDashGridLib.distLibEntitiesColDefMod.ColGroupDef = js.native
  /* CompleteClass */
  override def getColumnGroupShow(): java.lang.String = js.native
  def getGroupId(): java.lang.String = js.native
  /* CompleteClass */
  override def getId(): java.lang.String = js.native
  def getLeafColumns(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getLevel(): scala.Double = js.native
  def isExpandable(): scala.Boolean = js.native
  def isExpanded(): scala.Boolean = js.native
  def isPadding(): scala.Boolean = js.native
  /* CompleteClass */
  override def isVisible(): scala.Boolean = js.native
  /* private */ def onColumnVisibilityChanged(): js.Any = js.native
  def setChildren(
    children: js.Array[
      agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
    ]
  ): scala.Unit = js.native
  def setExpandable(): scala.Unit = js.native
  def setExpanded(expanded: scala.Boolean): scala.Unit = js.native
  def setupExpandable(): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup")
@js.native
object OriginalColumnGroup extends js.Object {
  var EVENT_EXPANDABLE_CHANGED: java.lang.String = js.native
  var EVENT_EXPANDED_CHANGED: java.lang.String = js.native
}

