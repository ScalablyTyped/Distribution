package typings.atAtlaskitTree.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSourcePosition extends js.Object {
  var index: Double
  var parentId: ItemId
}

object TreeSourcePosition {
  @scala.inline
  def apply(index: Double, parentId: ItemId): TreeSourcePosition = {
    val __obj = js.Dynamic.literal(index = index, parentId = parentId)
  
    __obj.asInstanceOf[TreeSourcePosition]
  }
}

