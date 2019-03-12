package typings
package atAtlaskitTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_35 extends js.Object {
  var isDragEnabled: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`false`
  var isNestingEnabled: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`false`
  var offsetPerLevel: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`35`
  var tree: Anon_Children
  def onCollapse(): scala.Unit
  def onDragEnd(): scala.Unit
  def onDragStart(): scala.Unit
  def onExpand(): scala.Unit
  def renderItem(): scala.Unit
}

object Anon_35 {
  @scala.inline
  def apply(
    isDragEnabled: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`false`,
    isNestingEnabled: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`false`,
    offsetPerLevel: atAtlaskitTreeLib.atAtlaskitTreeLibNumbers.`35`,
    onCollapse: () => scala.Unit,
    onDragEnd: () => scala.Unit,
    onDragStart: () => scala.Unit,
    onExpand: () => scala.Unit,
    renderItem: () => scala.Unit,
    tree: Anon_Children
  ): Anon_35 = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled, isNestingEnabled = isNestingEnabled, offsetPerLevel = offsetPerLevel, onCollapse = js.Any.fromFunction0(onCollapse), onDragEnd = js.Any.fromFunction0(onDragEnd), onDragStart = js.Any.fromFunction0(onDragStart), onExpand = js.Any.fromFunction0(onExpand), renderItem = js.Any.fromFunction0(renderItem), tree = tree)
  
    __obj.asInstanceOf[Anon_35]
  }
}

