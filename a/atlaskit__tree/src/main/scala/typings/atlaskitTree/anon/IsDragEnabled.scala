package typings.atlaskitTree.anon

import typings.atlaskitTree.atlaskitTreeBooleans.`false`
import typings.atlaskitTree.atlaskitTreeNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDragEnabled extends js.Object {
  var isDragEnabled: `false`
  var isNestingEnabled: `false`
  var offsetPerLevel: `35`
  var tree: Children
  def onCollapse(): Unit
  def onDragEnd(): Unit
  def onDragStart(): Unit
  def onExpand(): Unit
  def renderItem(): Unit
}

object IsDragEnabled {
  @scala.inline
  def apply(
    isDragEnabled: `false`,
    isNestingEnabled: `false`,
    offsetPerLevel: `35`,
    onCollapse: () => Unit,
    onDragEnd: () => Unit,
    onDragStart: () => Unit,
    onExpand: () => Unit,
    renderItem: () => Unit,
    tree: Children
  ): IsDragEnabled = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDragEnabled]
  }
}

