package typings.antd

import typings.antd.antdStrings.load
import typings.antd.libTreeTreeMod.AntTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: load
  var node: AntTreeNode
}

object Anon_Event {
  @scala.inline
  def apply(event: load, node: AntTreeNode): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

