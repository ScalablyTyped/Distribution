package typings.agGrid.exportParamsMod

import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldRowBeSkippedParams extends js.Object {
  var api: GridApi = js.native
  var context: js.Any = js.native
  var node: RowNode = js.native
}

object ShouldRowBeSkippedParams {
  @scala.inline
  def apply(api: GridApi, context: js.Any, node: RowNode): ShouldRowBeSkippedParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldRowBeSkippedParams]
  }
  @scala.inline
  implicit class ShouldRowBeSkippedParamsOps[Self <: ShouldRowBeSkippedParams] (val x: Self) extends AnyVal {
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
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

