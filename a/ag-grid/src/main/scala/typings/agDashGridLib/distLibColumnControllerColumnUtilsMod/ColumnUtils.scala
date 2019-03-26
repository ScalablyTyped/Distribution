package typings
package agDashGridLib.distLibColumnControllerColumnUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/columnUtils", "ColumnUtils")
@js.native
class ColumnUtils () extends js.Object {
  var gridOptionsWrapper: js.Any = js.native
  def calculateColInitialWidth(colDef: js.Any): scala.Double = js.native
  def depthFirstAllColumnTreeSearch(
    tree: js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild],
    callback: js.Function1[
      /* treeNode */ agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def depthFirstDisplayedColumnTreeSearch(
    tree: js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild],
    callback: js.Function1[
      /* treeNode */ agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def depthFirstOriginalTreeSearch(
    tree: js.Array[
      agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
    ],
    callback: js.Function1[
      /* treeNode */ agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getOriginalPathForColumn(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    originalBalancedTree: js.Array[
      agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
    ]
  ): js.Array[agDashGridLib.distLibEntitiesOriginalColumnGroupMod.OriginalColumnGroup] = js.native
}

