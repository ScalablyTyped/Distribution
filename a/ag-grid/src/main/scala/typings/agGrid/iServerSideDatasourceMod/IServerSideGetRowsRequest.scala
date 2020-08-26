package typings.agGrid.iServerSideDatasourceMod

import typings.agGrid.iColumnVOMod.ColumnVO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideGetRowsRequest extends js.Object {
  var endRow: Double = js.native
  var filterModel: js.Any = js.native
  var groupKeys: js.Array[String] = js.native
  var pivotCols: js.Array[ColumnVO] = js.native
  var pivotMode: Boolean = js.native
  var rowGroupCols: js.Array[ColumnVO] = js.native
  var sortModel: js.Any = js.native
  var startRow: Double = js.native
  var valueCols: js.Array[ColumnVO] = js.native
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
  @scala.inline
  implicit class IServerSideGetRowsRequestOps[Self <: IServerSideGetRowsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterModel(value: js.Any): Self = this.set("filterModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupKeysVarargs(value: String*): Self = this.set("groupKeys", js.Array(value :_*))
    @scala.inline
    def setGroupKeys(value: js.Array[String]): Self = this.set("groupKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotColsVarargs(value: ColumnVO*): Self = this.set("pivotCols", js.Array(value :_*))
    @scala.inline
    def setPivotCols(value: js.Array[ColumnVO]): Self = this.set("pivotCols", value.asInstanceOf[js.Any])
    @scala.inline
    def setPivotMode(value: Boolean): Self = this.set("pivotMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowGroupColsVarargs(value: ColumnVO*): Self = this.set("rowGroupCols", js.Array(value :_*))
    @scala.inline
    def setRowGroupCols(value: js.Array[ColumnVO]): Self = this.set("rowGroupCols", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortModel(value: js.Any): Self = this.set("sortModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueColsVarargs(value: ColumnVO*): Self = this.set("valueCols", js.Array(value :_*))
    @scala.inline
    def setValueCols(value: js.Array[ColumnVO]): Self = this.set("valueCols", value.asInstanceOf[js.Any])
  }
  
}

