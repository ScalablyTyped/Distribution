package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeSourcePosition extends js.Object {
  var index: scala.Double
  var parentId: ItemId
}

object TreeSourcePosition {
  @scala.inline
  def apply(index: scala.Double, parentId: ItemId): TreeSourcePosition = {
    val __obj = js.Dynamic.literal(index = index, parentId = parentId)
  
    __obj.asInstanceOf[TreeSourcePosition]
  }
}

