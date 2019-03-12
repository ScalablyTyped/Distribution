package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@atlaskit/tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def moveItemOnTree(tree: TreeData, from: TreeSourcePosition, to: TreeDestinationPosition): TreeData = js.native
  def mutateTree(tree: TreeData, itemId: ItemId, mutation: TreeItemMutation): TreeData = js.native
}

