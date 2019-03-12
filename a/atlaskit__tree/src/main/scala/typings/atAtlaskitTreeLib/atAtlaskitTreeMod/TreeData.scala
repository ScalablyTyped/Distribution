package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeData extends js.Object {
  var items: /* import warning: ImportType.apply Failed type conversion: {[key: string] : @atlaskit/tree.@atlaskit/tree.TreeItem, [key: number] : @atlaskit/tree.@atlaskit/tree.TreeItem} */ js.Any
  var rootId: ItemId
}

object TreeData {
  @scala.inline
  def apply(
    items: /* import warning: ImportType.apply Failed type conversion: {[key: string] : @atlaskit/tree.@atlaskit/tree.TreeItem, [key: number] : @atlaskit/tree.@atlaskit/tree.TreeItem} */ js.Any,
    rootId: ItemId
  ): TreeData = {
    val __obj = js.Dynamic.literal(items = items, rootId = rootId)
  
    __obj.asInstanceOf[TreeData]
  }
}

