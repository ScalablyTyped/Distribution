package typings
package agDashGridLib.distLibInterfacesIRowNodeStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageExecuteParams extends js.Object {
  var changedPath: js.UndefOr[agDashGridLib.distLibRowModelsClientSideChangedPathMod.ChangedPath] = js.undefined
  var rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var rowNodeOrder: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var rowNodeTransaction: js.UndefOr[agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction] = js.undefined
}

object StageExecuteParams {
  @scala.inline
  def apply(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    changedPath: agDashGridLib.distLibRowModelsClientSideChangedPathMod.ChangedPath = null,
    rowNodeOrder: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    rowNodeTransaction: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction = null
  ): StageExecuteParams = {
    val __obj = js.Dynamic.literal(rowNode = rowNode)
    if (changedPath != null) __obj.updateDynamic("changedPath")(changedPath)
    if (rowNodeOrder != null) __obj.updateDynamic("rowNodeOrder")(rowNodeOrder)
    if (rowNodeTransaction != null) __obj.updateDynamic("rowNodeTransaction")(rowNodeTransaction)
    __obj.asInstanceOf[StageExecuteParams]
  }
}

