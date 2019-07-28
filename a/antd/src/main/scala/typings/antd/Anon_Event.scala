package typings.antd

import typings.antd.antdStrings.load
import typings.antd.esTreeTreeMod.AntTreeNode
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
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

