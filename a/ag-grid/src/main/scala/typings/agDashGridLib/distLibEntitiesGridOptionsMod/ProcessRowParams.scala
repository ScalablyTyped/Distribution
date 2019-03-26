package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessRowParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var ePinnedLeftRow: stdLib.HTMLElement
  var ePinnedRightRow: stdLib.HTMLElement
  var eRow: stdLib.HTMLElement
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var rowIndex: scala.Double
  def addRenderedRowListener(eventType: java.lang.String, listener: js.Function): scala.Unit
}

object ProcessRowParams {
  @scala.inline
  def apply(
    addRenderedRowListener: (java.lang.String, js.Function) => scala.Unit,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    ePinnedLeftRow: stdLib.HTMLElement,
    ePinnedRightRow: stdLib.HTMLElement,
    eRow: stdLib.HTMLElement,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    rowIndex: scala.Double
  ): ProcessRowParams = {
    val __obj = js.Dynamic.literal(addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api, columnApi = columnApi, context = context, ePinnedLeftRow = ePinnedLeftRow, ePinnedRightRow = ePinnedRightRow, eRow = eRow, node = node, rowIndex = rowIndex)
  
    __obj.asInstanceOf[ProcessRowParams]
  }
}

