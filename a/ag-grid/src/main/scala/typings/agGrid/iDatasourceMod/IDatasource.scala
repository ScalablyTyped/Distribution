package typings.agGrid.iDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** If you know up front how many rows are in the dataset, set it here. Otherwise leave blank.*/
  var rowCount: js.UndefOr[Double] = js.undefined
  /** Callback the grid calls that you implement to fetch rows from the server. See below for params.*/
  def getRows(params: IGetRowsParams): Unit
}

object IDatasource {
  @scala.inline
  def apply(
    getRows: IGetRowsParams => Unit,
    destroy: () => Unit = null,
    rowCount: js.UndefOr[Double] = js.undefined
  ): IDatasource = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatasource]
  }
}

