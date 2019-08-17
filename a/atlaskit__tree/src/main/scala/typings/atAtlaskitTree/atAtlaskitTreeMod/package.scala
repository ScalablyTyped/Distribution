package typings.atAtlaskitTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAtlaskitTreeMod {
  import typings.react.reactMod.Component
  import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.NotDraggingStyle

  type ItemId = js.Any
  type Path = js.Array[Double]
  type Tree = Component[TreeProps, TreeState, js.Any]
  type TreeDraggableStyle = NotDraggingStyle | TreeDraggingStyle
  type TreeItemData = js.Any
}
