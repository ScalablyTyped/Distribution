package typings.agDashGrid.distLibExportParamsMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldRowBeSkippedParams extends js.Object {
  var api: GridApi
  var context: js.Any
  var node: RowNode
}

object ShouldRowBeSkippedParams {
  @scala.inline
  def apply(api: GridApi, context: js.Any, node: RowNode): ShouldRowBeSkippedParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShouldRowBeSkippedParams]
  }
}

