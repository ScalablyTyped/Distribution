package typings.atAtlaskitTree

import typings.atAtlaskitTree.atAtlaskitTreeBooleans.`false`
import typings.atAtlaskitTree.atAtlaskitTreeNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_35 extends js.Object {
  var isDragEnabled: `false`
  var isNestingEnabled: `false`
  var offsetPerLevel: `35`
  var tree: Anon_Children
  def onCollapse(): Unit
  def onDragEnd(): Unit
  def onDragStart(): Unit
  def onExpand(): Unit
  def renderItem(): Unit
}

object Anon_35 {
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
    tree: Anon_Children
  ): Anon_35 = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_35]
  }
}

