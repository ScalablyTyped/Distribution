package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeDestinationPosition extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var parentId: ItemId
}

object TreeDestinationPosition {
  @scala.inline
  def apply(parentId: ItemId, index: js.UndefOr[Double] = js.undefined): TreeDestinationPosition = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDestinationPosition]
  }
}

