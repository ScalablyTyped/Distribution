package typings
package agDashGridLib.distLibInterfacesIServerSideDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideGetRowsRequest extends js.Object {
  var endRow: scala.Double
  var filterModel: js.Any
  var groupKeys: js.Array[java.lang.String]
  var pivotCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO]
  var pivotMode: scala.Boolean
  var rowGroupCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO]
  var sortModel: js.Any
  var startRow: scala.Double
  var valueCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO]
}

object IServerSideGetRowsRequest {
  @scala.inline
  def apply(
    endRow: scala.Double,
    filterModel: js.Any,
    groupKeys: js.Array[java.lang.String],
    pivotCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO],
    pivotMode: scala.Boolean,
    rowGroupCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO],
    sortModel: js.Any,
    startRow: scala.Double,
    valueCols: js.Array[agDashGridLib.distLibInterfacesIColumnVOMod.ColumnVO]
  ): IServerSideGetRowsRequest = {
    val __obj = js.Dynamic.literal(endRow = endRow, filterModel = filterModel, groupKeys = groupKeys, pivotCols = pivotCols, pivotMode = pivotMode, rowGroupCols = rowGroupCols, sortModel = sortModel, startRow = startRow, valueCols = valueCols)
  
    __obj.asInstanceOf[IServerSideGetRowsRequest]
  }
}

