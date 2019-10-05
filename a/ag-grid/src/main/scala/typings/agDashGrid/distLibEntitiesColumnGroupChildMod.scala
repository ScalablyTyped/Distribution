package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.AbstractColDef
import typings.agDashGrid.distLibEntitiesColumnGroupChildMod.ColumnGroupChild
import typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
import typings.agDashGrid.distLibInterfacesIEventEmitterMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/entities/columnGroupChild", JSImport.Namespace)
@js.native
object distLibEntitiesColumnGroupChildMod extends js.Object {
  @js.native
  trait ColumnGroupChild extends IEventEmitter {
    def getActualWidth(): Double = js.native
    def getColumnGroupShow(): String = js.native
    def getDefinition(): AbstractColDef = js.native
    def getLeft(): Double = js.native
    def getMinWidth(): Double = js.native
    def getOldLeft(): Double = js.native
    def getParent(): ColumnGroupChild = js.native
    def getUniqueId(): String = js.native
    def isEmptyGroup(): Boolean = js.native
    def isMoving(): Boolean = js.native
    def isResizable(): Boolean = js.native
    def setParent(parent: ColumnGroup): Unit = js.native
  }
  
}

