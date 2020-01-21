package typings.agGrid.headerGroupCompMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderGroupParams extends js.Object {
  var api: GridApi
  var columnApi: ColumnApi
  var columnGroup: ColumnGroup
  var context: js.Any
  var displayName: String
  def setExpanded(expanded: Boolean): Unit
}

object IHeaderGroupParams {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    columnGroup: ColumnGroup,
    context: js.Any,
    displayName: String,
    setExpanded: Boolean => Unit
  ): IHeaderGroupParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded))
  
    __obj.asInstanceOf[IHeaderGroupParams]
  }
}

