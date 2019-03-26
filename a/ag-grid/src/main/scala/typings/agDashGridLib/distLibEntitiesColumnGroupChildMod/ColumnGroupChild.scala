package typings
package agDashGridLib.distLibEntitiesColumnGroupChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupChild
  extends agDashGridLib.distLibInterfacesIEventEmitterMod.IEventEmitter {
  def getActualWidth(): scala.Double = js.native
  def getColumnGroupShow(): java.lang.String = js.native
  def getDefinition(): agDashGridLib.distLibEntitiesColDefMod.AbstractColDef = js.native
  def getLeft(): scala.Double = js.native
  def getMinWidth(): scala.Double = js.native
  def getOldLeft(): scala.Double = js.native
  def getParent(): ColumnGroupChild = js.native
  def getUniqueId(): java.lang.String = js.native
  def isEmptyGroup(): scala.Boolean = js.native
  def isMoving(): scala.Boolean = js.native
  def isResizable(): scala.Boolean = js.native
  def setParent(parent: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup): scala.Unit = js.native
}

