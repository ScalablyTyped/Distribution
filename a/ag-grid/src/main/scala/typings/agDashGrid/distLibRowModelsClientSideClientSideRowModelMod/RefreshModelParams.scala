package typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshModelParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var groupState: js.UndefOr[js.Any] = js.undefined
  var keepEditingRows: js.UndefOr[Boolean] = js.undefined
  var keepRenderedRows: js.UndefOr[Boolean] = js.undefined
  var newData: js.UndefOr[Boolean] = js.undefined
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.undefined
  var rowNodeTransactions: js.UndefOr[js.Array[RowNodeTransaction]] = js.undefined
  var step: Double
}

object RefreshModelParams {
  @scala.inline
  def apply(
    step: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    groupState: js.Any = null,
    keepEditingRows: js.UndefOr[Boolean] = js.undefined,
    keepRenderedRows: js.UndefOr[Boolean] = js.undefined,
    newData: js.UndefOr[Boolean] = js.undefined,
    rowNodeOrder: StringDictionary[Double] = null,
    rowNodeTransactions: js.Array[RowNodeTransaction] = null
  ): RefreshModelParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (groupState != null) __obj.updateDynamic("groupState")(groupState.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEditingRows)) __obj.updateDynamic("keepEditingRows")(keepEditingRows.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRenderedRows)) __obj.updateDynamic("keepRenderedRows")(keepRenderedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(newData)) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (rowNodeOrder != null) __obj.updateDynamic("rowNodeOrder")(rowNodeOrder.asInstanceOf[js.Any])
    if (rowNodeTransactions != null) __obj.updateDynamic("rowNodeTransactions")(rowNodeTransactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshModelParams]
  }
}

