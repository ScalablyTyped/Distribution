package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: AntTreeNode = js.native
  var dragNodesKeys: js.Array[java.lang.String] = js.native
  var dropPosition: scala.Double = js.native
  var dropToGap: js.UndefOr[scala.Boolean] = js.native
  @JSName("event")
  var event_Original: reactLib.reactMod.ReactNs.MouseEventHandler[_] = js.native
  var node: AntTreeNode = js.native
  def event(event: reactLib.reactMod.ReactNs.MouseEvent[_]): scala.Unit = js.native
}

