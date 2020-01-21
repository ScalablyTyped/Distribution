package typings.astring

import typings.astring.mod.Options
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnNode extends js.Object {
  def apply(node: Node): String = js.native
  def apply(node: Node, options: Options): String = js.native
}

