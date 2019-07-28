package typings.agDashGrid.distLibGridApiMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailGridInfo extends js.Object {
  var api: GridApi
  var columnApi: ColumnApi
  var id: String
}

object DetailGridInfo {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, id: String): DetailGridInfo = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, id = id)
  
    __obj.asInstanceOf[DetailGridInfo]
  }
}

