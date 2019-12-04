package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertExtraNode extends js.Object {
  var insertExtraNode: js.UndefOr[Boolean] = js.undefined
}

object Anon_InsertExtraNode {
  @scala.inline
  def apply(insertExtraNode: js.UndefOr[Boolean] = js.undefined): Anon_InsertExtraNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertExtraNode)) __obj.updateDynamic("insertExtraNode")(insertExtraNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InsertExtraNode]
  }
}

