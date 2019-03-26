package typings
package agDashGridLib.distLibGridApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailGridInfo extends js.Object {
  var api: GridApi
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var id: java.lang.String
}

object DetailGridInfo {
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    id: java.lang.String
  ): DetailGridInfo = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, id = id)
  
    __obj.asInstanceOf[DetailGridInfo]
  }
}

