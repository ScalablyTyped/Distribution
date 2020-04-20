package typings.agGrid.iFilterMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDoesFilterPassParams extends js.Object {
  var data: js.Any
  var node: RowNode
}

object IDoesFilterPassParams {
  @scala.inline
  def apply(data: js.Any, node: RowNode): IDoesFilterPassParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDoesFilterPassParams]
  }
}

