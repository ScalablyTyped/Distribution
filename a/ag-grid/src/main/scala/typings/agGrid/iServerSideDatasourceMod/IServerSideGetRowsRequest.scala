package typings.agGrid.iServerSideDatasourceMod

import typings.agGrid.iColumnVOMod.ColumnVO
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
    val __obj = js.Dynamic.literal(endRow = endRow.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], groupKeys = groupKeys.asInstanceOf[js.Any], pivotCols = pivotCols.asInstanceOf[js.Any], pivotMode = pivotMode.asInstanceOf[js.Any], rowGroupCols = rowGroupCols.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], valueCols = valueCols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IServerSideGetRowsRequest]
  }
}

