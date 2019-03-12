package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDraggableProvided extends js.Object {
  // will be null if the draggable is disabled
  var dragHandleProps: js.UndefOr[
    reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod.DraggableProvidedDragHandleProps
  ] = js.native
  var draggableProps: TreeDraggableProps = js.native
  // The following props will be removed once we move to react 16
  def innerRef(): scala.Unit = js.native
  def innerRef(element: stdLib.HTMLElement): scala.Unit = js.native
}

