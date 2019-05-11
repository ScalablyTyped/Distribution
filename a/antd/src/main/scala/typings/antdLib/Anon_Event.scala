package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: antdLib.antdLibStrings.load
  var node: antdLib.esTreeTreeMod.AntTreeNode
}

object Anon_Event {
  @scala.inline
  def apply(event: antdLib.antdLibStrings.load, node: antdLib.esTreeTreeMod.AntTreeNode): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

