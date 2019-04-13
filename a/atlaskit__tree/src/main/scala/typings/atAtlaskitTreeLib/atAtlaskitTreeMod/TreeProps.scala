package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProps extends js.Object {
  /** Boolean to turn on drag&drop re-ordering on the tree */
  var isDragEnabled: scala.Boolean = js.native
  /** Boolean to turn on hovering while dragging */
  var isNestingEnabled: scala.Boolean = js.native
  /** Number of pixel is used to scaffold the tree by the consumer. */
  var offsetPerLevel: scala.Double = js.native
  /** The tree data structure. */
  var tree: TreeData = js.native
  /** Function that will be called when a parent item needs to be collapsed. */
  def onCollapse(itemId: ItemId, path: Path): scala.Unit = js.native
  def onDragEnd(sourcePosition: TreeSourcePosition): scala.Unit = js.native
  /** Function that will be called when the user finishes dragging. */
  def onDragEnd(sourcePosition: TreeSourcePosition, destinationPosition: TreeDestinationPosition): scala.Unit = js.native
  /** Function that will be called when the user starts dragging. */
  def onDragStart(itemId: ItemId): scala.Unit = js.native
  /** Function that will be called when a parent item needs to be expanded. */
  def onExpand(itemId: ItemId, path: Path): scala.Unit = js.native
  /** Function that will be called to render a single item. */
  def renderItem(itemProps: RenderItemParams): reactLib.reactMod.ReactNode = js.native
}

