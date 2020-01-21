package typings.angularCompiler

import typings.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodes extends js.Object {
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node]
}

object AnonNodes {
  @scala.inline
  def apply(nodes: js.Array[Node]): AnonNodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodes]
  }
}

