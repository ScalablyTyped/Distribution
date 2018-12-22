package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTreeNodeMouseEvent extends js.Object {
  @JSName("event")
  var event_Original: reactLib.reactMod.ReactNs.MouseEventHandler[_] = js.native
  var node: AntTreeNode = js.native
  def event(event: reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

