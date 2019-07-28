package typings.atAtlaskitTree.atAtlaskitTreeMod

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
    val __obj = js.Dynamic.literal(parentId = parentId)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDestinationPosition]
  }
}

