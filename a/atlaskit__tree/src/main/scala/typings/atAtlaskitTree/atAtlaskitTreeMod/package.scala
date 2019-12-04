package typings.atAtlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAtlaskitTreeMod {
  import typings.react.reactMod.Component
  import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.NotDraggingStyle
  import typings.std.Exclude
  import typings.std.Pick

  type FlattenedTree = js.Array[FlattenedItem]
  type ItemId = js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Path = js.Array[Double]
  type Tree = Component[TreeProps, TreeState, js.Any]
  type TreeDraggableStyle = NotDraggingStyle | TreeDraggingStyle
  type TreeItemData = js.Any
}
