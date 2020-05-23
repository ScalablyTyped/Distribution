package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertExtraNode extends js.Object {
  var insertExtraNode: js.UndefOr[Boolean] = js.undefined
}

object InsertExtraNode {
  @scala.inline
  def apply(insertExtraNode: js.UndefOr[Boolean] = js.undefined): InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertExtraNode)) __obj.updateDynamic("insertExtraNode")(insertExtraNode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertExtraNode]
  }
}

