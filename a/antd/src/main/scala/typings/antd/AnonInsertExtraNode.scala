package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertExtraNode extends js.Object {
  var insertExtraNode: js.UndefOr[Boolean] = js.undefined
}

object AnonInsertExtraNode {
  @scala.inline
  def apply(insertExtraNode: js.UndefOr[Boolean] = js.undefined): AnonInsertExtraNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertExtraNode)) __obj.updateDynamic("insertExtraNode")(insertExtraNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsertExtraNode]
  }
}

