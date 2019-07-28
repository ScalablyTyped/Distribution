package typings.agDashGrid.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnGroupMod.ColumnGroup
import typings.agDashGrid.distLibGridApiMod.GridApi
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
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, columnGroup = columnGroup, context = context, displayName = displayName, setExpanded = js.Any.fromFunction1(setExpanded))
  
    __obj.asInstanceOf[IHeaderGroupParams]
  }
}

