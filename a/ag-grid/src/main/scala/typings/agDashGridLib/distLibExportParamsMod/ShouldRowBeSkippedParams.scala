package typings
package agDashGridLib.distLibExportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldRowBeSkippedParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var context: js.Any
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
}

object ShouldRowBeSkippedParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    context: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): ShouldRowBeSkippedParams = {
    val __obj = js.Dynamic.literal(api = api, context = context, node = node)
  
    __obj.asInstanceOf[ShouldRowBeSkippedParams]
  }
}

