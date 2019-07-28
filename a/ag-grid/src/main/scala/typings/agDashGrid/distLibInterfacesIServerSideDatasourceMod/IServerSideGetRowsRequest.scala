package typings.agDashGrid.distLibInterfacesIServerSideDatasourceMod

import typings.agDashGrid.distLibInterfacesIColumnVOMod.ColumnVO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideGetRowsRequest extends js.Object {
  var endRow: Double
  var filterModel: js.Any
  var groupKeys: js.Array[String]
  var pivotCols: js.Array[ColumnVO]
  var pivotMode: Boolean
  var rowGroupCols: js.Array[ColumnVO]
  var sortModel: js.Any
  var startRow: Double
  var valueCols: js.Array[ColumnVO]
}

object IServerSideGetRowsRequest {
  @scala.inline
  def apply(
    endRow: Double,
    filterModel: js.Any,
    groupKeys: js.Array[String],
    pivotCols: js.Array[ColumnVO],
    pivotMode: Boolean,
    rowGroupCols: js.Array[ColumnVO],
    sortModel: js.Any,
    startRow: Double,
    valueCols: js.Array[ColumnVO]
  ): IServerSideGetRowsRequest = {
    val __obj = js.Dynamic.literal(endRow = endRow, filterModel = filterModel, groupKeys = groupKeys, pivotCols = pivotCols, pivotMode = pivotMode, rowGroupCols = rowGroupCols, sortModel = sortModel, startRow = startRow, valueCols = valueCols)
  
    __obj.asInstanceOf[IServerSideGetRowsRequest]
  }
}

