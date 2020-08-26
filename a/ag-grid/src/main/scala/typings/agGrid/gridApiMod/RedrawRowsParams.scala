package typings.agGrid.gridApiMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedrawRowsParams extends js.Object {
  var rowNodes: js.UndefOr[js.Array[RowNode]] = js.native
}

object RedrawRowsParams {
  @scala.inline
  def apply(): RedrawRowsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedrawRowsParams]
  }
  @scala.inline
  implicit class RedrawRowsParamsOps[Self <: RedrawRowsParams] (val x: Self) extends AnyVal {
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
    def setRowNodesVarargs(value: RowNode*): Self = this.set("rowNodes", js.Array(value :_*))
    @scala.inline
    def setRowNodes(value: js.Array[RowNode]): Self = this.set("rowNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNodes: Self = this.set("rowNodes", js.undefined)
  }
  
}

