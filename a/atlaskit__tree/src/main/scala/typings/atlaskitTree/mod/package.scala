package typings.atlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FlattenedTree = js.Array[typings.atlaskitTree.mod.FlattenedItem]
  type ItemId = js.Any
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Path = js.Array[scala.Double]
  type Tree = typings.react.mod.Component[typings.atlaskitTree.mod.TreeProps, typings.atlaskitTree.mod.TreeState, js.Any]
  type TreeDraggableStyle = typings.reactBeautifulDnd.mod.NotDraggingStyle | typings.atlaskitTree.mod.TreeDraggingStyle
  type TreeItemData = js.Any
}
