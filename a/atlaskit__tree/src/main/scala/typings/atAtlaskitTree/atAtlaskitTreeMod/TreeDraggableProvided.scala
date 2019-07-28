package typings.atAtlaskitTree.atAtlaskitTreeMod

import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DraggableProvidedDragHandleProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDraggableProvided extends js.Object {
  // will be null if the draggable is disabled
  var dragHandleProps: js.UndefOr[DraggableProvidedDragHandleProps] = js.native
  var draggableProps: TreeDraggableProps = js.native
  // The following props will be removed once we move to react 16
  def innerRef(): Unit = js.native
  def innerRef(element: HTMLElement): Unit = js.native
}

