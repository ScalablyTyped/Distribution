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
  def apply(parentId: ItemId, index: Int | Double = null): TreeDestinationPosition = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDestinationPosition]
  }
}

