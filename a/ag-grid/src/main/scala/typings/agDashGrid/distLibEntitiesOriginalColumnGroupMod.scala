package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.ColGroupDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
import typings.agDashGrid.distLibInterfacesIEventEmitterMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/originalColumnGroup", JSImport.Namespace)
@js.native
object distLibEntitiesOriginalColumnGroupMod extends js.Object {
  @js.native
  class OriginalColumnGroup protected ()
    extends OriginalColumnGroupChild
       with IEventEmitter {
    def this(colGroupDef: ColGroupDef, groupId: String, padding: Boolean, level: Double) = this()
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
    def getChildren(): js.Array[OriginalColumnGroupChild] = js.native
    def getColGroupDef(): ColGroupDef = js.native
    /* CompleteClass */
    override def getColumnGroupShow(): String = js.native
    def getGroupId(): String = js.native
    /* CompleteClass */
    override def getId(): String = js.native
    def getLeafColumns(): js.Array[Column] = js.native
    def getLevel(): Double = js.native
    def isExpandable(): Boolean = js.native
    def isExpanded(): Boolean = js.native
    def isPadding(): Boolean = js.native
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    /* private */ def onColumnVisibilityChanged(): js.Any = js.native
    def setChildren(children: js.Array[OriginalColumnGroupChild]): Unit = js.native
    def setExpandable(): Unit = js.native
    def setExpanded(expanded: Boolean): Unit = js.native
    def setupExpandable(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object OriginalColumnGroup extends js.Object {
    var EVENT_EXPANDABLE_CHANGED: String = js.native
    var EVENT_EXPANDED_CHANGED: String = js.native
  }
  
}

