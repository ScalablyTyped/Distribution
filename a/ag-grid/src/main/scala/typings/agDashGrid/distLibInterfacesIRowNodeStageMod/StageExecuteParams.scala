package typings.agDashGrid.distLibInterfacesIRowNodeStageMod

import org.scalablytyped.runtime.StringDictionary
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibRowModelsClientSideChangedPathMod.ChangedPath
import typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageExecuteParams extends js.Object {
  var changedPath: js.UndefOr[ChangedPath] = js.undefined
  var rowNode: RowNode
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.undefined
  var rowNodeTransaction: js.UndefOr[RowNodeTransaction] = js.undefined
}

object StageExecuteParams {
  @scala.inline
  def apply(
    rowNode: RowNode,
    changedPath: ChangedPath = null,
    rowNodeOrder: StringDictionary[Double] = null,
    rowNodeTransaction: RowNodeTransaction = null
  ): StageExecuteParams = {
    val __obj = js.Dynamic.literal(rowNode = rowNode.asInstanceOf[js.Any])
    if (changedPath != null) __obj.updateDynamic("changedPath")(changedPath.asInstanceOf[js.Any])
    if (rowNodeOrder != null) __obj.updateDynamic("rowNodeOrder")(rowNodeOrder.asInstanceOf[js.Any])
    if (rowNodeTransaction != null) __obj.updateDynamic("rowNodeTransaction")(rowNodeTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecuteParams]
  }
}

