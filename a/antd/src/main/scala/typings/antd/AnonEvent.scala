package typings.antd

import typings.antd.antdStrings.load
import typings.antd.treeTreeMod.AntTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: load
  var node: AntTreeNode
}

object AnonEvent {
  @scala.inline
  def apply(event: load, node: AntTreeNode): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

