package typings.atAtlaskitTree.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenedItem extends js.Object {
  var item: TreeItem
  var path: Path
}

object FlattenedItem {
  @scala.inline
  def apply(item: TreeItem, path: Path): FlattenedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlattenedItem]
  }
}

