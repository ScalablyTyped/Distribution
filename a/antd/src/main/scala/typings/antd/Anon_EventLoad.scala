package typings.antd

import typings.antd.antdStrings.load
import typings.antd.libTreeTreeMod.AntTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoad extends js.Object {
  var event: load
  var node: AntTreeNode
}

object Anon_EventLoad {
  @scala.inline
  def apply(event: load, node: AntTreeNode): Anon_EventLoad = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[Anon_EventLoad]
  }
}

