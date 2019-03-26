package typings
package agDashGridLib.distLibRowModelsClientSideChangedPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/changedPath", "ChangedPath")
@js.native
class ChangedPath protected () extends js.Object {
  def this(keepingColumns: scala.Boolean) = this()
  var active: js.Any = js.native
  var keepingColumns: js.Any = js.native
  var nodeIdsToBoolean: js.Any = js.native
  var nodeIdsToColumns: js.Any = js.native
  def addParentNode(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def addParentNode(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  ): scala.Unit = js.native
  def getNotValueColumnsForNode(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    valueColumns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  ): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def getValueColumnsForNode(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    valueColumns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  ): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  def isActive(): scala.Boolean = js.native
  def isInPath(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  def setInactive(): scala.Unit = js.native
  /* private */ def validateActive(): js.Any = js.native
}

