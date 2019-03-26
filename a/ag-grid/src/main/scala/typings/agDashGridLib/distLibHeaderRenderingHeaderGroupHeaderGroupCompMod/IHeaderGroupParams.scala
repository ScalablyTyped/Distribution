package typings
package agDashGridLib.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderGroupParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup
  var context: js.Any
  var displayName: java.lang.String
  def setExpanded(expanded: scala.Boolean): scala.Unit
}

object IHeaderGroupParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columnGroup: agDashGridLib.distLibEntitiesColumnGroupMod.ColumnGroup,
    context: js.Any,
    displayName: java.lang.String,
    setExpanded: scala.Boolean => scala.Unit
  ): IHeaderGroupParams = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, columnGroup = columnGroup, context = context, displayName = displayName, setExpanded = js.Any.fromFunction1(setExpanded))
  
    __obj.asInstanceOf[IHeaderGroupParams]
  }
}

